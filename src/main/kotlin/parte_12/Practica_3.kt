package org.parte_12

/*
Tienes una aplicación donde quieres registrar temperaturas. La clase almacena la información
en grados Celsius, pero quieres proporcionar una forma sencilla de crear una instancia también
en grados Fahrenheit. Completa la clase de datos para que el siguiente código en la función
main() se ejecute correctamente:
*/

data class Temperature(val celsius: Double) {
    val fahrenheit: Double = celsius * 9 / 5 + 32

    // Write your code here
}

fun main() {
    val fahrenheit = 90.0
//    val temp = Temperature.fromFahrenheit(fahrenheit)
//    println("${temp.celsius}°C is $fahrenheit °F")
    // 32.22222222222222°C is 90.0 °F
}