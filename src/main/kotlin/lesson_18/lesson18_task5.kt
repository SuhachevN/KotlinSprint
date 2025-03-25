package org.example.lesson_18

class Screen {
    fun drawCircle(x: Int, y: Int): String {
        return "Нарисован круг с координатами ($x, $y)"
    }

    fun drawCircle(x: Float, y: Float): String {
        return "Нарисован круг с координатами ($x, $y)"
    }

    fun drawSquare(x: Int, y: Int): String {
        return "Нарисован квадрат с координатами ($x, $y)"
    }

    fun drawSquare(x: Float, y: Float): String {
        return "Нарисован квадрат с координатами ($x, $y)"
    }

    fun drawPoint(x: Int, y: Int): String {
        return "Нарисована точка с координатами ($x, $y)"
    }

    fun drawPoint(x: Float, y: Float): String {
        return "Нарисована точка с координатами ($x, $y)"
    }
}

fun main() {
    val screen = Screen()

    println(screen.drawCircle(3, 4))
    println(screen.drawCircle(3.3f, 4.4f))
    println()
    println(screen.drawSquare(5, 6))
    println(screen.drawSquare(5.5f, 6.6f))
    println()
    println(screen.drawPoint(1, 2))
    println(screen.drawPoint(1.1f, 2.2f))
}
