package org.parte_2

fun operadores() {

    var clientes = 10

    // Algunos clientes se van
    clientes = 8
    println("Clientes: $clientes")

    clientes = clientes + 3     // Example of addition: 11
    println("clientes = clientes + 3\n$clientes")
    clientes += 7               // Example of addition: 18
    println("clientes += 7\n$clientes")
    clientes -= 3               // Example of subtraction: 15
    println("clientes -= 3\n$clientes")
    clientes *= 2               // Example of multiplication: 30
    println("clientes *= 2\n$clientes")
    clientes /= 3               // Example of division: 10
    println("clientes /= 3\n$clientes")
    clientes %= 3               // Módulo muestra el resto de la división
    println("clientes %= 3\n$clientes")

    println(clientes) // 10
}