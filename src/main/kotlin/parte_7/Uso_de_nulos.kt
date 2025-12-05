package org.parte_7

fun usoDeNulos() {
    // nuncaNulo es de tipo String
    var nuncaNulo: String = "Esto no puede ser nulo"

    // Lanzará un error de compilación
    // nuncaNulo = null

    // nulable es de tipo String o nulo
    var nulable: String? = "Puede ser nulo también"

    // Esto está bien
    nulable = null

    // Por defecto, valores nulos no son aceptados
    var aceptaNoNulos = "El compilador asume que no es nulo"

    // Lanzará un error de compilación
    // aceptaNoNulos = null

    // noNulo no acepta valores nulos
    fun largoCadena(noNulo: String): Int {
        return noNulo.length
    }

    // nulable = if (nulable == null) "" else nulable
    nulable = nulable ?: ""

    println(largoCadena(nuncaNulo)) // 18
    println(largoCadena(nulable))  // Throws a compiler error

    println(comprobarNulo(nulable))

    nulable = "Cadena de texto"
    println(comprobarNulo(nulable))

    val stringNulo: String? = null
    println(largoDeString(stringNulo))

    val cadenaNula: String? = null
    println(cadenaNula?.uppercase())

    operadorElvis()
}

fun comprobarNulo(esString: String): String {
    if (esString != null && esString.length > 0) {
        return  "Largo de Cadena: ${esString.length}"
    } else {
        return "Cadena vacía o nula"
    }
}

fun largoDeString(posibleString: String?): Int? = posibleString?.length

fun operadorElvis() {
    val cadenaNula: String? = null
    println(cadenaNula?.length ?: 0)
}