<div align="center">

# 🌊 Acuario-POO 🐠

<img src="https://img.shields.io/badge/Kotlin-0095D5?style=for-the-badge&logo=kotlin&logoColor=white" alt="Kotlin"/>
<img src="https://img.shields.io/badge/Gradle-02303A.svg?style=for-the-badge&logo=Gradle&logoColor=white" alt="Gradle"/>
<img src="https://img.shields.io/badge/POO-blue?style=for-the-badge" alt="POO"/>

### 🎯 Un entorno acuático digital impulsado por la Programación Orientada a Objetos

*Explora las profundidades del código y observa cómo los pilares de la POO se integran en perfecta armonía* 🌊

</div>

---

## 🌟 ¿Por qué destaca este proyecto?

Este **acuario virtual** no es simplemente un conjunto de clases: es un ecosistema cuidadosamente diseñado. Cada componente del sistema trabaja en conjunto para demostrar, de forma didáctica, cómo los principios de la Programación Orientada a Objetos (POO) se aplican en un contexto lúdico y funcional.

---

## 🧠 Principios de POO Implementados

<div align="center">

| Icono | Concepto          | Aplicación concreta                                          |
| :---: | ----------------- | ------------------------------------------------------------ |
|   🧬  | **Herencia**      | Clase `Pez` como base, extendida por `Tiburon` y `PezPayaso` |
|   🔄  | **Polimorfismo**  | Comportamientos distintos en `comer()` según la especie      |
|   🎭  | **Interfaces**    | `AccionPez` define un contrato común de acciones             |
|   🔒  | **Encapsulación** | Control de acceso a propiedades y métodos                    |
|   ☁️  | **Abstracción**   | Clases abstractas con implementación concreta                |

</div>

---

## 🧱 Estructura del Proyecto

```text
📁 src/main/kotlin/acuario/
├── Acuario.kt         ◄── Representa el entorno general
├── PecesAcuario.kt    ◄── Contiene la jerarquía de especies marinas
└── main.kt            ◄── Punto de entrada del programa
```

---

## 🐠 Habitantes del Acuario

<div align="center">

| Clase       | Tipo      | Característica   | Dieta     |
| ----------- | --------- | ---------------- | --------- |
| `Pez`       | Abstracta | Clase base       | —         |
| `Tiburon`   | Concreta  | Color gris       | Carnívoro |
| `PezPayaso` | Concreta  | Color dorado     | Herbívoro |
| `AccionPez` | Interface | Define `comer()` | —         |

</div>

---

## 🧪 Tipos de Hábitat

<div align="center">

| Tanque        | Forma       | Capacidad útil | Fórmula de cálculo     |
| ------------- | ----------- | -------------- | ---------------------- |
| `Acuario`     | Rectangular | 90%            | `ancho × alto × largo` |
| `TanqueTorre` | Cilíndrica  | 80%            | `π × r² × h`           |

</div>

---

## 💻 Requisitos del Entorno

<div align="center">

| Herramienta | Versión sugerida | Enlace                                    |
| ----------- | ---------------- | ----------------------------------------- |
| Kotlin      | 1.8+             | [kotlinlang.org](https://kotlinlang.org/) |
| JDK         | 11+              | [adoptium.net](https://adoptium.net/)     |
| Gradle      | 8.x (opcional)   | [gradle.org](https://gradle.org/)         |

</div>

---

## 🚀 Compilación y Ejecución

### Opción 1: Desde consola

```bash
kotlinc src/main/kotlin/acuario/*.kt -include-runtime -d build/acuario.jar
java -jar build/acuario.jar
```

### Opción 2: Usando Gradle

```bash
./gradlew build
```

Los archivos compilados se ubican en: `build/classes/kotlin/main/`

---

## 🖥️ Salida esperada

```text
Tiburón -> color: gris
cazar y comer peces
PezPayaso -> color: dorado
comer algas
```

Esta salida ilustra el uso del polimorfismo: cada clase concreta sobrescribe su comportamiento alimenticio.

---

## ✨ Funcionalidades Destacadas

<div align="center">

| Funcionalidad                | Descripción                             |
| ---------------------------- | --------------------------------------- |
| 🧬 Herencia Evolutiva        | Estructura jerárquica entre especies    |
| 🔄 Comportamiento Adaptativo | Comidas según tipo de pez               |
| 🎭 Interfaces Inteligentes   | Contrato único para diferentes especies |
| 📐 Geometría Acuática        | Cálculo preciso del volumen de tanques  |

</div>

---

## 🧭 Mapa del Proyecto

```text
Acuario-POO/
├── README.md
├── build.gradle.kts
├── settings.gradle.kts
├── gradle.properties
├── gradlew / gradlew.bat
├── gradle/wrapper/
├── src/
│   ├── main/
│   │   └── kotlin/acuario/
│   │       ├── Acuario.kt
│   │       ├── PecesAcuario.kt
│   │       └── main.kt
│   └── test/ (futuro)
└── build/
```

---

## 🤝 Contribuciones

¿Quieres añadir nuevas especies marinas, hábitats o funcionalidades? ¡Bienvenido!

1. Haz un **fork**
2. Crea una rama: `git checkout -b feature/NuevoPez`
3. Realiza tus cambios: `git commit -m 'Nuevo pez agregado'`
4. Empújalos: `git push origin feature/NuevoPez`
5. Envía un **pull request**

---

## 📜 Licencia

Este proyecto se encuentra bajo la **Licencia MIT**. Consulta el archivo [LICENSE](LICENSE) para más detalles.

---

## 👨‍💻 Autor

<div align="center">

**Rafael Diego Chuco Yantas**
*Desarrollador y creador del ecosistema digital Acuario-POO*

[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge\&logo=github\&logoColor=white)](https://github.com/rafaelchuco)

</div>

---

## ⭐ ¡Gracias por visitar el acuario!

*Que tu código sea tan elegante como un banco de peces nadando en sincronía.* 🐟