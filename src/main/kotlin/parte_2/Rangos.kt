package org.parte_2

fun rangos() {
    val rango = 1..5
    val rango2 = 1..<5
    val rango3 = 'a'..'h'
    val rango4 = 'z' downTo 's' step 2  // downTo significa orden inverso

    println(rango::class.simpleName)
    println(rango)

    rango.forEach {
        println("Número: $it")
    }
    separador()
    rango2.forEach {
        println("Número: $it")
    }
    separador()
    rango3.forEach {
        println("Letra: $it")
    }
    separador()
    rango4.forEach {
        println("Letra: $it")
    }

}

fun separador() {
    println("\n=================\n")
}