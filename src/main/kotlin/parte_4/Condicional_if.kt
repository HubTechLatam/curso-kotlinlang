package org.parte_4

fun condicionalIf() {
    val valor: Int
    val check = true

    if (check) {
        valor = 1
    } else {
        valor = 2
    }

    println(valor)
    // 1

    val a = 1
    val b = 2

    println(if (a > b) a else b) // Returns a value: 2
}