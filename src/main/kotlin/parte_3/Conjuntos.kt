package org.parte_3

//TIP Mientras que las listas están ordenadas y permiten elementos duplicados, los conjuntos
// no están ordenados y solo almacenan elementos únicos.

fun conjuntos() {
    // Read-only set
    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
    // Mutable set with explicit type declaration
    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")

    println(readOnlyFruit)
    // [apple, banana, cherry]
    println("This set has ${readOnlyFruit.count()} items")
    // This set has 3 items
    println("banana" in readOnlyFruit)
    // true
    fruit.add("dragonfruit")    // Add "dragonfruit" to the set
    println(fruit)              // [apple, banana, cherry, dragonfruit]

    fruit.remove("dragonfruit") // Remove "dragonfruit" from the set
    println(fruit)              // [apple, banana, cherry]

}