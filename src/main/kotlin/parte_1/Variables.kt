package org.parte_1

fun variables() {

    println("Variables de solo lectura - val")
    val planetas = 9
    val soles = 1
    var asteroides = 1_000

    asteroides = 2_000
    println(asteroides)
    println("Planetas: $planetas\nSoles: $soles\nAsteroides: $asteroides")
}