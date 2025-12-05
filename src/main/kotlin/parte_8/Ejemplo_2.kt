package org.parte_8

fun agregarLinea() {
    val builder = StringBuilder()
        // Se llama a la función de extensión appendLine() en builder
        .appendLine("Hello")
        .appendLine()
        .appendLine("World")
    println(builder.toString())
}

fun agregarLinea2(linea1: String, linea2: String) {
    val lineas = StringBuilder()
    lineas.agregar(linea1, linea2)
}

fun StringBuilder.agregar(linea1: String, linea2: String) {
    val salida = StringBuilder()
        .appendLine(linea1)
        .appendLine()
        .appendLine(linea2)
    println(salida.toString())
}