package org.parte_8

import org.parte_5.titulo

interface Usuario {
    val nombre: String
    val correo: String
}

fun Usuario.displayInfo(): String = "Usuario(nombre=$nombre, correo=$correo)"

// Hereda e implementa las propiedades de la interfaz de usuario
class UsuarioComun(override val nombre: String, override val correo: String) : Usuario

fun usoInterface() {
    val usuario = UsuarioComun("Alice", "alice@example.com")

    titulo("Uso de Interface")
    println(usuario.displayInfo())
    // User(name=Alice, email=alice@example.com)
}