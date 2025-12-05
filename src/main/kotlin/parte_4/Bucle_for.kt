package org.parte_4

fun bucleFor() {
    for (number in 1..5) {
        // number is the iterator and 1..5 is the range
        print(number)
    }
    println()
    // 12345

    val cakes = listOf("carrot", "cheese", "chocolate")

    for (cake in cakes) {
        println("Yummy, it's a $cake cake!")
    }
    // Yummy, it's a carrot cake!
    // Yummy, it's a cheese cake!
    // Yummy, it's a chocolate cake!
}