package org.parte_1

fun cadenas() {

    val camarero1 = "Juan"
    val camarero2 = "Ana"
    val clientes = 10

    println(clientes)
    println(camarero1 + camarero2)
    println("Camarero 1: $camarero1" + "Camarero 2: $camarero2")
    println("Camarero 1: $camarero1" + "\nCamarero 2: $camarero2")
    println("Camarero 1: $camarero1\nCamarero 2: $camarero2")

    println(clientes + clientes)

    println("Hay $clientes clientes.")

    println("Hay ${clientes * 2} clientes.")

    println("Hay ${clientes * clientes} clientes.")
}