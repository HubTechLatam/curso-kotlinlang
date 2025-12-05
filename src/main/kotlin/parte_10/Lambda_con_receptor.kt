package org.parte_10

fun lambdaConReceptor() {
    render {
        drawCircle()
        // 🟠 Dibujando un círculo
        drawSquare()
        // 🟥 Dibujando un cuadrado
    }
}

class Canvas {
    fun drawCircle() = println("🟠 Dibujando un círculo")
    fun drawSquare() = println("🟥 Dibujando un cuadrado")
}

// Expresión lambda con definición de receptor
fun render(block: Canvas.() -> Unit): Canvas {
    val canvas = Canvas()
    // Utilice la expresión lambda con receptor
    canvas.block()
    return canvas
}
