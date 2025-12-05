package org.parte_12

fun objetoAutenticar() {
    Autenticar.tomarParametros("Peter", "12345abc")

    DoAuth.takeParameters("Admin", "ABC#123")
}

object Autenticar {
    fun tomarParametros(nombreUsuario: String, clave: String) {
        println("Parámetros de autenticación = $nombreUsuario : $clave")
    }
}

// Los objetos pueden heredar de clases e interfaces
interface Auth {
    fun takeParameters(username: String, password: String)
}

object DoAuth: Auth {
    override fun takeParameters(username: String, password: String) {
        println("input Auth parameters = $username : $password")
    }
}