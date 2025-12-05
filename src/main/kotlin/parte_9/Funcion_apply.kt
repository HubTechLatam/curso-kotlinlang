package org.parte_9

import org.parte_5.titulo

fun funcionApply() {
    titulo("Manera tradicional sin apply()")
    val cliente = Cliente()
    cliente.token = "asdf"
    cliente.connect()
    cliente.conectar()
    cliente.authenticate()
    cliente.autenticar()
    println(cliente.getData())

    titulo("Manera moderna con apply()")
    val clienteApply = Cliente().apply {
        token = "asdf"
        connect()
        authenticate()
    }
    println(clienteApply.getData())
}

class Cliente() {
    var token: String? = null
    fun connect() = println("connected!")
    val conectar = { println("conectado!") }
    fun authenticate() = println("authenticated!")
    val autenticar = { println("autenticado!") }
    fun getData(): String = "Mock data"
}
