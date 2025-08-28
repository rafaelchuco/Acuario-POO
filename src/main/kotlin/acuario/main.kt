package acuario

fun crearPeces() {
    val t = Tiburon()
    val p = PezPayaso()
    println("Tiburón -> color: ${t.color}")
    t.comer()
    println("PezPayaso -> color: ${p.color}")
    p.comer()
}

fun main() {
    crearPeces()
}
