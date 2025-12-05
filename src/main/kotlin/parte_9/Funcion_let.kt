package org.parte_9

import org.parte_5.titulo

fun funcionLet() {
    val destino: String? = obtenerProximoDestino()

    // Forma con condicional if
    titulo("Forma con condicional if")
    val confirmar = if (destino != null) {
        enviarNotificacion(destino)
    } else { null }

    // Forma con la función de alcance let
    titulo("Forma con la función de alcance let")
    val confirmarLet = destino?.let { enviarNotificacion(it) }
    println(confirmarLet)
}

fun enviarNotificacion(destino: String): String {
    println("Yo $destino!")
    return "Notificación enviada!"
}

fun obtenerProximoDestino(): String {
    return "sebastian@jetbrains.com"
}