package org.parte_11

/*
Tienes una aplicación de mensajería simple que tiene algunas funciones básicas,
pero quieres agregar algunas funciones para mensajes inteligentes sin duplicar
significativamente tu código.

En el código siguiente, defina una clase llamada SmartMessengerque hereda de la
Messengerinterfaz pero delega la implementación a una instancia de la BasicMessengerclase.

En la SmartMessengerclase, sobrescriba la sendMessage()función para enviar mensajes
inteligentes. La función debe aceptar "a" messagecomo entrada y devolver una declaración
impresa: "Sending a smart message: $message". Además, invoque la sendMessage()función
desde la BasicMessengerclase y anteponga "<sup>" al mensaje [smart].
*/

//interface Messenger {
//    fun sendMessage(message: String)
//    fun receiveMessage(): String
//}
//
//class BasicMessenger : Messenger {
//    override fun sendMessage(message: String) {
//        println("Sending message: $message")
//    }
//
//    override fun receiveMessage(): String {
//        return "You've got a new message!"
//    }
//}
//
//class SmartMessenger // Write your code here
//
//fun main() {
//    val basicMessenger = BasicMessenger()
//    val smartMessenger = SmartMessenger(basicMessenger)
//
//    basicMessenger.sendMessage("Hello!")
//    // Sending message: Hello!
//    println(smartMessenger.receiveMessage())
//    // You've got a new message!
//    smartMessenger.sendMessage("Hello from SmartMessenger!")
//    // Sending a smart message: Hello from SmartMessenger!
//    // Sending message: [smart] Hello from SmartMessenger!
//}