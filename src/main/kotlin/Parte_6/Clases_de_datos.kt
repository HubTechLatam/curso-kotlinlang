package org.Parte_6

data class Usuario(
    val nombre: String,
    val id: Int
)

fun clasesDeDatos() {
    val usuario = Usuario("Alex", 1)
    val usuarioDos = Usuario("Alex", 1)
    val usuarioTres = Usuario("Max", 2)

    // Muestra el usuario
    println(usuario)

    // Compara usuario con usuarioDos
    println("usuario == usuarioDos: ${usuario == usuarioDos}")
    // usuario == usuarioDos: true

    // Compara usuario con usuarioTres
    println("usuario == usuarioTres: ${usuario == usuarioTres}")
    // usuario == usuarioTres: false

    // Crea una copia exacta de usuario
    println(usuario.copy())
    // usuario(name=Alex, id=1)

    // Crea una copia de usuario con nombre "Max"
    println(usuario.copy("Max"))
    // usuario(name=Max, id=1)

    // Crea una copia de usuario con id "3"
    println(usuario.copy(id = 3))
    // usuario(name=Alex, id=3)
}