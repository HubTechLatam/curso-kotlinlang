package org.parte_4

import org.parte_2.separador

fun bucleWhile() {
    var cakesEaten = 0
    while (cakesEaten < 3) {
        println("Eat a cake")
        cakesEaten++
    }
    // Eat a cake
    // Eat a cake
    // Eat a cake

    separador()
    otroUsoWhile()
}

fun otroUsoWhile() {
    var cakesEaten = 0
    var cakesBaked = 0

    while (cakesEaten < 3) {
        println("Eat a cake")
        cakesEaten++
    }

    do {
        println("Bake a cake")
        cakesBaked++
    } while (cakesBaked < cakesEaten)

}