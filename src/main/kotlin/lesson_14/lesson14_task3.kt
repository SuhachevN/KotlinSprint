package org.example.lesson_14

abstract class Figure(val color: String) {
    abstract fun area(): Double
    abstract fun perimeter(): Double
    val partOfPerimeterFormula = 2
}

class Circle(color: String, val radius: Double) : Figure(color) {
    override fun area(): Double {
        return Math.PI * radius * radius
    }

    override fun perimeter(): Double {

        return partOfPerimeterFormula * Math.PI * radius
    }
}
class Rectangle(color: String, val width: Double, val height: Double) : Figure(color) {
    override fun area(): Double {
        return width * height
    }

    override fun perimeter(): Double {
        return partOfPerimeterFormula * (width + height)
    }
}

fun main() {
    val figures = listOf<Figure>(
        Circle("black", 5.0),
        Rectangle("white", 4.0, 6.0),
        Circle("white", 3.0),
        Rectangle("black", 2.0, 3.0)
    )

    val blackPerimeterSum = figures.filter { it.color == "black" }
        .sumOf { it.perimeter() }

    val whiteAreaSum = figures.filter { it.color == "white" }
        .sumOf { it.area() }

    println("Сумма периметров всех черных фигур: %.2f".format(blackPerimeterSum))
    println("Сумма площадей всех белых фигур: %.2f".format(whiteAreaSum))
}
