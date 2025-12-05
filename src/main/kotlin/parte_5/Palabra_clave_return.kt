package org.parte_5

// Lista de nombres registrados
val usuariosRegistrados = mutableListOf("john_doe", "jane_smith")

// Lista de emails registrados
val emailsRegistrados = mutableListOf("john@example.com", "jane@example.com")

fun palabraClaveReturn() {
    titulo("Retorno anticipado - uso de \"return\"")
    println(usuarioRegistrado("john_doe", "newjohn@example.com"))
    // Username already taken. Please choose a different username.
    println(usuarioRegistrado("new_user", "newuser@example.com"))
    // User registered successfully: new_user
}

fun usuarioRegistrado(nombre: String, email: String): String {
    // Retorno anticipado si el nombre de usuario ya está tomado
    if (nombre in usuariosRegistrados) {
        return "Nombre de usuario tomado. Escoger un nombre diferente."
    }

    // Retorno anticipado si el email ya está tomado
    if (nombre in usuariosRegistrados) {
        return "Email ya registrado. Ingresar un correo nuevo."
    }

    // Guardamos nombre de usuario y email no tomados
    usuariosRegistrados.add(nombre)
    emailsRegistrados.add(email)

    return "Usuario registrado exitosamente: $nombre"
}
