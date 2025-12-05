package org.parte_12

/*
Tienes una cafetería y un sistema para el seguimiento de los pedidos de los clientes.
Considera el código a continuación y completa la declaración del segundo objeto de datos
para que el siguiente código de la función main() se ejecute correctamente:
*/

interface Order {
    val orderId: String
    val customerName: String
    val orderTotal: Double
}

data object OrderOne: Order {
    override val orderId = "001"
    override val customerName = "Alice"
    override val orderTotal = 15.50
}

data object // Write your code here

fun main() {
    // Print the name of each data object
    println("Order name: $OrderOne")
    // Order name: OrderOne
//    println("Order name: $OrderTwo")
    // Order name: OrderTwo

    // Check if the orders are identical
//    println("Are the two orders identical? ${OrderOne == OrderTwo}")
    // Are the two orders identical? false

//    if (OrderOne == OrderTwo) {
//        println("The orders are identical.")
//    } else {
//        println("The orders are unique.")
//        // The orders are unique.
//    }

//    println("Do the orders have the same customer name? ${OrderOne.customerName == OrderTwo.customerName}")
    // Do the orders have the same customer name? false
}