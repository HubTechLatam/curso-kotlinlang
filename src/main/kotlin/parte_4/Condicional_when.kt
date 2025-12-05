package org.parte_4

fun condicionalWhen() {
    val obj = "Hello"

    when (obj) {
        // Revisa si obj es igual a "1"
        "1" -> println("One")
        // Revisa si obj es igual a "Hello"
        "Hello" -> println("Greeting")
        // Respuesta por defecto
        else -> println("Unknown")
    }
    // Greeting

    val result = when (obj) {
        // Si obj es igual a "1", guardar como resultado "one"
        "1" -> "Uno"
        // Si obj es igual a "Hello", guardar como resultado "Greeting"
        "Hello" -> "Felicitación"
        // Guardar como resultado "Unknown" si ninguna condición previa se cumplió
        else -> "Desconocido"
    }
    println(result)
    // Greeting

    otrasFormasDeUso()
}

fun otrasFormasDeUso() {
    val trafficLightState = "Rojo" // Este puede ser "Rojo", "Amarillo" o "Verde"

    val trafficAction = when {
        trafficLightState == "Verde" -> "Avanzar"
        trafficLightState == "Amarillo" -> "Atención"
        trafficLightState == "Rojo" -> "Detenerse"
        else -> "Descompuesto"
    }

    println(trafficAction)
    // Stop
}