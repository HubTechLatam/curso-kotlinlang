package org.parte_11

fun interfaces() {
    val metodoPago = PagoTarjetaCredito("1234 5678 9012 3456", "John Doe", "12/25")
    println(metodoPago.iniciarPago(100.0))
    // Payment of $100.0 initiated using Credit Card ending in 3456.

    println("Pago realizado con ${metodoPago.tipoDePago}")
}

interface TipoDePago {
    val tipoDePago: String
}

interface MetodoDePago {
    // Las funciones son heredables por defecto
    fun iniciarPago(monto: Double): String
}

class PagoTarjetaCredito(
    val numeroTarjeta: String,
    val nombreTarjeta: String,
    val fechaExpiracion: String
) : MetodoDePago, TipoDePago {
    override fun iniciarPago(monto: Double): String {
        // Simular proceso de pago con la tarjeta de crédito
        return "Pago de $$monto iniciado usando Tarjeta de Crédito terminado en ${numeroTarjeta.takeLast(4)}."
    }

    override val tipoDePago: String = "Tarjeta de Crédito"
}



