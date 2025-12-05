package org.parte_2

fun tipoDatos() {

    // Enteros con signo (Signed integers)
    println("▒▒ Enteros con signo ▒▒")
    println("Byte: ${Byte.MIN_VALUE} a ${Byte.MAX_VALUE}")
    println("Short: ${Short.MIN_VALUE} a ${Short.MAX_VALUE}")
    println("Int: ${Int.MIN_VALUE} a ${Int.MAX_VALUE}")
    println("Long: ${Long.MIN_VALUE} a ${Long.MAX_VALUE}")

    // Enteros sin signo (Unsigned integers)
    println("▒▒ Enteros sin signo ▒▒")
    println("UByte: ${UByte.MIN_VALUE} a ${UByte.MAX_VALUE}")
    println("Short: ${UShort.MIN_VALUE} a ${UShort.MAX_VALUE}")
    println("Int: ${UInt.MIN_VALUE} a ${UInt.MAX_VALUE}")
    println("Long: ${ULong.MIN_VALUE} a ${ULong.MAX_VALUE}")

    // Flotantes o con decimales
    println("▒▒ Flotantes o con decimales ▒▒")
    println("Long: ${Long.MIN_VALUE} a ${Long.MAX_VALUE}")
    println("Double: ${Double.MIN_VALUE} a ${Double.MAX_VALUE}")

    // Booleanos
    println("▒▒ Booleanos ▒▒")
    println("1 > 2 = ${1 > 2}")
    println("1 < 2 = ${1 < 2}")

    // Caracteres o Char
    println("▒▒ Character ▒▒")
    val caracter = 'a'
    println("La variable \"caracter\" es de tipo: ${caracter::class.simpleName}")

    // Cadenas o String
    println("▒▒ Cadenas o String ▒▒")
    val cadena = "Hola Kotlin!"
    println(cadena)

    // Declarar una variable sin inicializarla
    val variable: Int
    // Variable inicializada y con tipo de dato explícito
    val otraVariable: String = "Aprendo Kotlin!"
    variable = 100
    println(variable)
    println(otraVariable)

}