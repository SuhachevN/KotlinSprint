package org.example.lesson_16

class Circle(private val radius: Double) {

    fun calculateCircumference(): String {
        val circumference = TWO * PI * radius
        return String.format("%.1f", circumference)
    }

    fun calculateArea(): Double {
        return PI * radius * radius
    }
}

fun main() {
    val circle = Circle(5.0)

    val circumference = circle.calculateCircumference()
    val area = circle.calculateArea()

    println("Длина окружности: $circumference")
    println("Площадь круга: $area")
}
private const val PI = 3.14
private const val TWO = 2