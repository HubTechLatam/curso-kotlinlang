package org.parte_3

fun listas() {
    // Read only list
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println(readOnlyShapes)
    // [triangle, square, circle]

    // Mutable list with explicit type declaration
    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    println(shapes)
    // [triangle, square, circle]

    println("The first item in the list is: ${readOnlyShapes[0]}")
    // The first item in the list is: triangle
    println("The first item in the list is: ${readOnlyShapes.first()}")
    // The first item in the list is: triangle
    println("The last item in the list is: ${readOnlyShapes.last()}")
    // The last item in the list is: triangle
    println("This list has ${readOnlyShapes.count()} items")
    // This list has 3 items
    println("circle" in readOnlyShapes)
    // true

    // Add "pentagon" to the list
    shapes.add("pentagon")
    println(shapes)
    // [triangle, square, circle, pentagon]

    // Remove the first "pentagon" from the list
    shapes.remove("pentagon")
    println(shapes)
    // [triangle, square, circle]

}