package org.parte_11

// Ejemplo de delegación múltiple
fun delegacionMultiple() {
    val gps = GPSReal()
    val audio = AudioReal()
    val coche = CocheSmart(gps, audio)

    println(coche.obtenerUbicacion())
    coche.reproducirSonido()
}

interface GPS { fun obtenerUbicacion(): String }
interface Audio { fun reproducirSonido() }

class GPSReal : GPS {
    override fun obtenerUbicacion() = "📍 Ubicación actual: 10.123, -84.456"
}

class AudioReal : Audio {
    override fun reproducirSonido() = println("🎵 Reproduciendo sonido...")
}

// Delegamos ambas interfaces
class CocheSmart(gps: GPS, audio: Audio) : GPS by gps, Audio by audio
