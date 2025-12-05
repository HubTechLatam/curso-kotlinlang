package org.parte_12

import org.parte_5.titulo

fun dataObject() {
    titulo("Ejemplo de \"data object\"")
    println(Data)
    println(Data.appName)
}

data object Data {
    var appName: String = "My Application"
    var version: String = "1.0.0"
}