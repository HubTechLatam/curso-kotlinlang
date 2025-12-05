package org.parte_11

/*
Imagina que trabajas en un sistema de casa inteligente. Una casa inteligente suele tener
diferentes tipos de dispositivos, todos con características básicas, pero también con
comportamientos únicos. En el ejemplo de código a continuación, completa la abstractclase
llamada SmartDevicepara que la clase secundaria SmartLightpueda compilarse correctamente.

Luego, crea otra clase secundaria llamada SmartThermostatque herede de la SmartDeviceclase
e implemente turnOn()funciones turnOff()que devuelvan instrucciones de impresión que
describan qué termostato está calentando o apagado. Finalmente, agrega otra función llamada
adjustTemperature()que acepte una medición de temperatura como entrada e imprima:$name
thermostat set to $temperature°C.
*/

//abstract class // Write your code here
//
//class SmartLight(name: String) : SmartDevice(name) {
//    override fun turnOn() {
//        println("$name is now ON.")
//    }
//
//    override fun turnOff() {
//        println("$name is now OFF.")
//    }
//
//    fun adjustBrightness(level: Int) {
//        println("Adjusting $name brightness to $level%.")
//    }
//}

//class SmartThermostat // Write your code here

//fun main() {
//    val livingRoomLight = SmartLight("Living Room Light")
//    val bedroomThermostat = SmartThermostat("Bedroom Thermostat")
//
//    livingRoomLight.turnOn()
//    // Living Room Light is now ON.
//    livingRoomLight.adjustBrightness(10)
//    // Adjusting Living Room Light brightness to 10%.
//    livingRoomLight.turnOff()
//    // Living Room Light is now OFF.
//
//    bedroomThermostat.turnOn()
//    // Bedroom Thermostat thermostat is now heating.
//    bedroomThermostat.adjustTemperature(5)
//    // Bedroom Thermostat thermostat set to 5°C.
//    bedroomThermostat.turnOff()
//    // Bedroom Thermostat thermostat is now off.
//}