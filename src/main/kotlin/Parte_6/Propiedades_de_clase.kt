package org.Parte_6

/*
Los objetos son útiles para almacenar datos en tu programa. Las clases permiten declarar un conjunto
de características para un objeto. Al crear objetos a partir de una clase, ahorras tiempo y esfuerzo,
ya que no tienes que declarar estas características cada vez.

Se puede declarar propiedades sin val o var dentro de paréntesis, pero estas propiedades no serán
accesibles después de que se haya creado una instancia.
*/

// Clase que representa un contacto en una libreta de direcciones
class Contacto(
    val id: Int,                                // Propiedad de solo lectura (val)
    var email: String = "example@gmail.com",    // Propiedad mutable (var) con valor por defecto
    var phone: String? = null                   // Propiedad opcional (nullable)
) {
    // Propiedad de solo lectura declarada dentro del cuerpo de la clase
    val categoria: String = "work"

    // Propiedad calculada: no almacena valor, sino que lo calcula al acceder
    val contactInfo: String
        get() = "[$id] $email (${categoria.uppercase()})"

    // Propiedad mutable con getter y setter personalizados
    var alias: String = "Sin alias"
        get() = field.uppercase()               // cada vez que se lee, devuelve el valor en mayúsculas
        set(value) {
            field = if (value.isNotBlank()) value.trim() else "Sin alias"
        }

    // Propiedad con inicialización diferida (lazy)
    val formattedId: String by lazy {
        "C-${id.toString().padStart(4, '0')}"
    }

    // Método miembro que imprime la información del contacto
    fun printContact() {
        println("ID: $formattedId")
        println("Email: $email")
        println("Teléfono: ${phone ?: "No especificado"}")
        println("Categoría: $categoria")
        println("Alias: $alias")
        println("Resumen: $contactInfo")
    }
}

fun instanciaContacto() {
    // Crear una instancia de Contacto usando valores por defecto
    val contact1 = Contacto(id = 1)
    contact1.printContact()

    println("\n--- Modificando propiedades ---")
    contact1.email = "nuevoemail@empresa.com"
    contact1.phone = "555-1234"
    contact1.alias = "   juanito   "            // setter lo limpiará y lo formateará

    contact1.printContact()

    println("\n--- Creando otro contacto ---")
    val contact2 = Contacto(id = 2, email = "maria@correo.com", phone = "555-6789")
    contact2.alias = "maria"
    contact2.printContact()
}
