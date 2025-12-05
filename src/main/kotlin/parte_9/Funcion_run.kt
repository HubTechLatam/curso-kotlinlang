package org.parte_9

fun funcionRun() {
    val clienteRun = Cliente().apply { token = "asdf" }

    val resultado: String = clienteRun.run {
        connect()
        authenticate()
        getData()
    }

    println(resultado)
}