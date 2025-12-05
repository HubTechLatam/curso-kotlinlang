package org.parte_5

fun funcionLambda() {
    titulo("Función Normal")
    println(textoEnMayusculas("hola"))
    titulo("Función Lambda")
    val textoMayusculas = { texto: String -> texto.uppercase() }
    println(textoMayusculas("mayusculas"))
    titulo("Pasar a otra función")
    pasarAOtraFuncion()
    titulo("Usando \"map\"")
    usandoMap()
}

fun textoEnMayusculas(texto: String): String {
    return texto.uppercase()
}

fun pasarAOtraFuncion() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    // Cuando el parámetro es una función se pueden eliminar los ()
    val positives = numbers.filter ({ x -> x > 0 })

    val isNegative = { x: Int -> x < 0 }
    val negatives = numbers.filter(isNegative)

    println(positives)
    // [1, 3, 5]
    println(negatives)
    // [-2, -4, -6]
}

fun usandoMap() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val doubled = numbers.map { x -> x * 2 }

    val isTripled = { x: Int -> x * 3 }
    val tripled = numbers.map(isTripled)

    println(doubled)
    // [2, -4, 6, -8, 10, -12]
    println(tripled)
    // [3, -6, 9, -12, 15, -18]
}

