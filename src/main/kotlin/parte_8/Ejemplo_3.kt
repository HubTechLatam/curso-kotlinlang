package org.parte_8

fun String.truncar(maxChar: Int): String {
    return if (this.length <= maxChar) this else take(maxChar - 3) + "..."
}

fun truncarTexto() {
    val textoCorto = "KotlinFan42"
    val textoLargo = "JetBrainsLoverForever"

    println("Nombre usuario corto: ${textoCorto.truncar(15)}")
    println("Nombre usuario largo: ${textoLargo.truncar(15)}")
}