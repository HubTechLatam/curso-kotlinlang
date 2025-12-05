package org.parte_5

fun tiposDeFunciones() {
    titulo("Función con argumento")
    println(mayusculas("hola mundo."))

    titulo("Función Lambda sin argumento")
    funcionLambdaSinArgumento()

    titulo("Lambda devuelta de una función")
    val tiempoMinutos = listOf(2, 10, 15, 1)
    val minASeg = convertirASegundos("minuto")
    val totalTiempoSegundos = tiempoMinutos.map(minASeg).sum()
    println("Tiempo total es $totalTiempoSegundos")

    titulo("Invocar la función a si misma")
    println({ text: String -> text.uppercase() }("hola kotlin."))

    titulo("Lambdas finales")
    // La operación suma el valor inicial con cada elemento de la lista de forma acumulada
    println(listOf(1, 2, 3).fold(0, { x, item -> x + item })) // 6
    // Modo alternativo, en la forma de una lambda final
    println(listOf(1, 2, 3).fold(0) { x, item -> x + item })  // 6

}

val mayusculas: (String) -> String = { texto -> texto.uppercase() }

val funcionLambdaSinArgumento: () -> Unit = { println("Función Lambda sin argumento.".uppercase()) }
// También
// funcionLambdaSinArgumento = { println("Función Lambda sin argumento.".uppercase()) }
// es válido

fun convertirASegundos(tiempo: String): (Int) -> Int = when (tiempo) {
    "hora" -> { valor -> valor * 60 * 60 }
    "minuto" -> { valor -> valor * 60 }
    "segundo" -> { valor -> valor }
    else -> { valor -> valor }
}

