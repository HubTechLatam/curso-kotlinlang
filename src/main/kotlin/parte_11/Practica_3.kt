package org.parte_11

/*
Estás desarrollando un sistema de procesamiento de pagos para una aplicación de
comercio electrónico. Cada método de pago debe poder autorizar un pago y procesar
una transacción. Algunos pagos también deben poder procesar reembolsos.

1. En la Refundableinterfaz, agregue una función llamada refund()para procesar reembolsos.

2. En la PaymentMethodclase abstracta:

- Agregue una función llamada authorize()que toma una cantidad e imprime un mensaje
que contiene la cantidad.
- Agregue una función abstracta llamada processPayment()que también toma una cantidad.

Cree una clase llamada CreditCardque implemente la Refundableinterfaz y PaymentMethodla
clase abstracta. En esta clase, agregue implementaciones para las funciones refund() y
processPayment() para que impriman las siguientes sentencias:

- "Refunding $amount to the credit card."
- "Processing credit card payment of $amount."
*/

//interface Refundable {
//    // Write your code here
//}
//
//abstract class PaymentMethod(val name: String) {
//    // Write your code here
//}
//
//class CreditCard // Write your code here
//
//fun main() {
//    val visa = CreditCard("Visa")
//
//    visa.authorize(100.0)
//    // Authorizing payment of $100.0.
//    visa.processPayment(100.0)
//    // Processing credit card payment of $100.0.
//    visa.refund(50.0)
//    // Refunding $50.0 to the credit card.
//}