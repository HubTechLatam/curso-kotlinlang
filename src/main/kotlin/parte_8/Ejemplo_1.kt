package org.parte_8

class HttpRespuesta(val contenido: String)

class HttpCliente {
    fun solicitud(metodo: String, url: String, cabeceras: Map<String, String>): HttpRespuesta {
        println("Solicitud $metodo a $url con cabeceras: $cabeceras")
        return HttpRespuesta("Respuesta de $url")
    }
}

// Creamos extensiones sobre HttpCliente
fun HttpCliente.get(url: String): HttpRespuesta = solicitud("GET", url, emptyMap())
fun HttpCliente.post(url: String): HttpRespuesta = solicitud("POST", url, emptyMap())