package org.example.lesson_16

class Circle(private val radius: Double) {
    private val pi = 3.14
    private val two = 2.0

    fun calculateCircumference(): String {
        val circumference = two * pi * radius
        return String.format("%.1f", circumference)
    }

    fun calculateArea(): Double {
        return pi * radius * radius
    }
}

fun main() {
    val circle = Circle(5.0)

    val circumference = circle.calculateCircumference()
    val area = circle.calculateArea()

    println("Длина окружности: $circumference")
    println("Площадь круга: $area")
}
