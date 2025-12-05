package org.parte_3

    //TIP Los mapas almacenan elementos como pares clave-valor. Se accede al valor haciendo referencia a la clave.
    // Un mapa es como un menú de comida. Puedes encontrar el precio (valor) buscando el alimento (clave) que quieres
    // comer. Los mapas son útiles si quieres buscar un valor sin usar un índice numerado, como en una lista.

fun mapas() {
    // Read-only map
    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(readOnlyJuiceMenu)
    // {apple=100, kiwi=190, orange=100}

    // Mutable map with explicit type declaration
    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(juiceMenu)
    // {apple=100, kiwi=190, orange=100}

    // Para evitar modificaciones no deseadas, puede crear una vista de solo lectura de un mapa mutable asignándolo a un Map
    val juiceMenuLocked: Map<String, Int> = juiceMenu

    println("The value of apple juice is: ${readOnlyJuiceMenu["apple"]}")
    // The value of apple juice is: 100
    println("The value of pineapple juice is: ${readOnlyJuiceMenu["pineapple"]}")
    // The value of pineapple juice is: null

    juiceMenu["coconut"] = 150 // Add key "coconut" with value 150 to the map
    println(juiceMenu)
    // {apple=100, kiwi=190, orange=100, coconut=150}

    juiceMenu.remove("orange")    // Remove key "orange" from the map
    println(juiceMenu)
    // {apple=100, kiwi=190}

    println("This map has ${readOnlyJuiceMenu.count()} key-value pairs")
    // This map has 3 key-value pairs

    println(readOnlyJuiceMenu.containsKey("kiwi"))
    // true

    println(readOnlyJuiceMenu.keys)
    // [apple, kiwi, orange]
    println(readOnlyJuiceMenu.values)
    // [100, 190, 100]

    println("orange" in readOnlyJuiceMenu.keys)
    // true

    // Alternatively, you don't need to use the keys property
    println("orange" in readOnlyJuiceMenu)
    // true

    println(200 in readOnlyJuiceMenu.values)
    // false

}