package org.parte_11

import org.parte_5.titulo

fun delegacion() {
    val cocheBase = Coche("Toyota")
    val moto = Moto("Yamaha")
    val cocheClasico = CocheFormaClasica(cocheBase)
    val cocheModerno = CocheFormaModerna(cocheBase)
    val motoModerna = CocheFormaModerna(moto)

    titulo("cocheBase")
    cocheBase.acelerar()

    titulo("cocheClasico")
    cocheClasico.acelerar()
    println(cocheClasico.obtenerInfo())

    titulo("cocheModerno")
    cocheModerno.acelerar()
    cocheModerno.frenar()
    println(cocheModerno.obtenerInfo())

    titulo("motoModerna")
    motoModerna.acelerar()
    motoModerna.frenar()
    println(motoModerna.obtenerInfo())
}

// Tenemos una interfaz base
interface Vehiculo {
    val marca: String
    fun acelerar()
    fun frenar()
    fun obtenerInfo(): String
}

// Creamos una clase que implementa esta interfaz
class Coche(override val marca: String) : Vehiculo {
    override fun acelerar() {
        println("🚗 El coche $marca está acelerando.")
    }

    override fun frenar() {
        println("🚗 El coche $marca está frenando.")
    }

    override fun obtenerInfo(): String {
        return "Coche marca $marca"
    }
}

// Forma clásica sin delegación
class CocheFormaClasica(val coche: Vehiculo) : Vehiculo {
    override val marca: String = coche.marca

    override fun acelerar() {
        println("[Log] Acelerando...")
        coche.acelerar()
    }

    override fun frenar() {
        println("[Log] Frenando...")
        coche.frenar()
    }

    override fun obtenerInfo(): String {
        return coche.obtenerInfo()
    }
}

// Forma moderna con delegación
class CocheFormaModerna(val coche: Vehiculo) : Vehiculo by coche {
    override fun acelerar() {
        println("[LOG] Acelerando...")
        coche.acelerar()
    }
}

class Moto(override val marca: String) : Vehiculo {
    override fun acelerar() = println("🏍️ La moto $marca acelera rápidamente.")
    override fun frenar() = println("🏍️ La moto $marca frena suavemente.")
    override fun obtenerInfo() = "Moto marca $marca"
}














