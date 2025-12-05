package org.parte_11

fun clasesAbstractas() {
    // Crea una instancia de la clase 'Electronico'
    val laptop = Electronico("Laptop", 1000.0, 2)

    println(laptop.infoProducto())
}

abstract class Producto(val nombre: String, val precio: Double) {
    abstract val categoria: String

    fun infoProducto(): String {
        return "Producto: $nombre, Categoría: $categoria, Precio: $precio"
    }
}

// Creamos una clase hija
class Electronico(nombre: String, precio: Double, val garantia: Int): Producto(nombre, precio) {
    override val categoria = "Electrónico"
}