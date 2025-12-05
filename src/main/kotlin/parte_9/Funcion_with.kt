package org.parte_9

import org.parte_5.titulo

class Canvas {
    fun rect(x: Int, y: Int, w: Int, h: Int): Unit = println("$x, $y, $w, $h")
    fun circ(x: Int, y: Int, rad: Int): Unit = println("$x, $y, $rad")
    fun text(x: Int, y: Int, str: String): Unit = println("$x, $y, $str")
}

fun funcionWith() {
    // Llamando funciones de Canvas sin "with"
    titulo("Llamando funciones de Canvas sin \"with\"")
    val usandoCanvas = Canvas()

    usandoCanvas.text(10, 10, "Foo")
    usandoCanvas.rect(20, 30, 100, 50)
    usandoCanvas.circ(40, 60, 25)
    usandoCanvas.text(15, 45, "Hello")
    usandoCanvas.rect(70, 80, 150, 100)
    usandoCanvas.circ(90, 110, 40)
    usandoCanvas.text(35, 55, "World")
    usandoCanvas.rect(120, 140, 200, 75)
    usandoCanvas.circ(160, 180, 55)
    usandoCanvas.text(50, 70, "Kotlin")

    // Llamando funciones de Canvas con "with"
    titulo("Llamando funciones de Canvas con \"with\"")
    val canvasWith = Canvas()
    with(canvasWith) {
        text(10, 10, "Foo")
        rect(20, 30, 100, 50)
        circ(40, 60, 25)
        text(15, 45, "Hello")
        rect(70, 80, 150, 100)
        circ(90, 110, 40)
        text(35, 55, "World")
        rect(120, 140, 200, 75)
        circ(160, 180, 55)
        text(50, 70, "Kotlin")
    }
}