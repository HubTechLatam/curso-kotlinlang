package org.parte_8

import org.parte_5.titulo
import kotlin.math.pow
import kotlin.math.sqrt

fun funcionExtension() {
    titulo("Función de Extensión")
    println("Hola".bold())
    println("Cuadrado de 2 es: ${2.cuadrado()}")
    println("Cubo de 2 es: ${2.cubo()}")
    // Raíz Cuadrada de un número
    val numero = 25f
    val raizCuadrada = sqrt(numero)
    titulo("Funciones mátematicas de Kotlin")
    println("Raiz cuadrada de 25 es: $raizCuadrada")
    val otroNumero = 5f
    val cuadrado = otroNumero.pow(2)
    println("Cuadrado de $otroNumero es: $cuadrado")

    titulo("Ejemplo 1")
    val cliente = HttpCliente()
    // Haciendo una petición GET usando solicitud() directamente
    val respuestaConMiembro = cliente.solicitud("GET", "https://example.com", emptyMap())
    println(respuestaConMiembro)
    // Haciendo petición GET usando la función de extensión get()
    // La instancia cliente es el receptor
    val respuestaConExtension = cliente.get("https://example.com")
    println(respuestaConExtension)

    titulo("Ejemplo 2")
    agregarLinea()
    agregarLinea2("Hola", "Kotlin")

    titulo("Ejemplo 3")
    truncarTexto()

}

fun String.bold(): String = "<b>$this</b>"

fun Int.cuadrado(): Int = this * this

fun Int.cubo(): Int = this * this * this