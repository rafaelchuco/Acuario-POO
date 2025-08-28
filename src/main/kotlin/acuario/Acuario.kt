package acuario

import kotlin.math.PI

open class Acuario(
    open var largo: Int = 100,
    open var ancho: Int = 20,
    open var alto: Int = 40
) {
    constructor(numeroDePeces: Int) : this() {
        val tanque = numeroDePeces * 2000 * 1.1
        alto = (tanque / (largo * ancho)).toInt()
    }

    open var volumen: Int
        get() = ancho * alto * largo / 1000
        set(valor) {
            alto = (valor * 1000) / (ancho * largo)
        }

    open val forma: String = "rectángulo"
    open val agua: Double
        get() = volumen * 0.9

    fun imprimirTamano() {
        println(forma)
        println("Ancho: $ancho cm Largo: $largo cm Alto: $alto cm")
        val pct = if (volumen == 0) 0.0 else (agua / volumen) * 100.0
        println("Volumen: $volumen l Agua: %.2f l (%.1f%% lleno)".format(agua, pct))
    }
}

class TanqueTorre(
    override var alto: Int,
    var diametro: Int
) : Acuario(alto = alto, ancho = diametro, largo = diametro) {

    override var volumen: Int
        get() = ((ancho / 2.0) * (largo / 2.0) * alto / 1000.0 * PI).toInt()
        set(valor) {
            alto = (((valor * 1000.0) / PI) / ((ancho / 2.0) * (largo / 2.0))).toInt()
        }

    override val forma: String = "cilindro"

    // 80% de agua útil
    override val agua: Double
        get() = volumen * 0.8
}
