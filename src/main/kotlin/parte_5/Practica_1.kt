package org.parte_5

/*
Tiene una lista de acciones compatibles con un servicio web, un prefijo
común para todas las solicitudes y un ID de un recurso específico. Para
solicitar una acción title sobre el recurso con ID: 5, debe crear la
siguiente URL: https://example.com/book-info/5/title.
Use una expresión lambda para crear una lista de URL a partir de la lista
de acciones.
*/

fun main() {
    val actions = listOf("title", "year", "author")
    val prefix = "https://example.com/book-info"
    val id = 5
//    val urls = // Write your code here
//        println(urls)
}