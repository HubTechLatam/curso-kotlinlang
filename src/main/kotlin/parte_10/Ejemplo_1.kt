package org.parte_10

fun imprimirMenu() {
    // Creamos el menú
    val menuPrincipal = menu("Menu Principal") {
        addItem("Inicio")
        addItem("Configuración")
        addItem("Salir")
    }

    // Se imprime el menú
    printMenu(menuPrincipal)
}

class MenuItem(val nombre: String)

class Menu(val nombreMenu: String) {
    val items = mutableListOf<MenuItem>()

    fun addItem(nombreItem: String) {
        items.add(MenuItem(nombreItem))
    }
}

fun menu(nombre: String, init: Menu.() -> Unit): Menu {
    // Creamos una instancia de la clase Menu y pasamos el argumento 'nombre'
    val menu = Menu(nombre)
    // Llamamos a la expresión lambda con receptor init() en la instancia de la clase
    menu.init()
    return menu
}

fun printMenu(menu: Menu) {
    println("Menu: ${menu.nombreMenu}")
    menu.items.forEach { println(" Item: ${it.nombre}") }
}
