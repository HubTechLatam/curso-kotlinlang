package org.parte_9

import org.parte_5.titulo

fun funcionAlso() {
    // Usando map(), filter(), reversed()

    titulo("Usando map(), filter(), reversed()")
    val medallas: List<String> = listOf("Oro", "Plata", "Bronce")
    val mayusculasReverso: List<String> =
        medallas
            .map { it.uppercase() }
            .filter { it.length > 4 }
            .reversed()

    println(mayusculasReverso)

    // "Usando also() también"

    titulo("Usando also() también")
    val mayusReversoAlso: List<String> =
        medallas
            .map { it.uppercase() }
            .also { println(it) }
            .filter { it.length > 4 }
            .also { println(it) }
            .reversed()

    println(mayusReversoAlso)
}