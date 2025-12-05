package org.parte_5

fun funciones() {
    titulo("Función hola()")
    hola()
    titulo("Función suma()")
    println("La suma es: ${suma(20, 30)}")
    titulo("Argumentos con nombres")
    mensajeConPrefijo("Hola con prefijo", "Log")
    mensajeConPrefijo("Hola con prefijo por defecto")
    titulo("Función expresión")
    println(funcionExpresión(100, 200))
}

fun hola() {
    return println("Hola mundo!")
}

fun suma(x: Int, y: Int): Int {
    return x + y
}

fun titulo(text: String) {
    val largo = text.length
    val linea = "=".repeat(largo)

    println()
    println(text)
    println(linea)
    println()
}

// Argumentos con nombres, valor de argumento por defecto y función sin retorno
fun mensajeConPrefijo(mensaje: String, prefijo: String = "Info") {
    println("[$prefijo] $mensaje")
}

fun funcionExpresión(x: Int, y: Int) = x + y