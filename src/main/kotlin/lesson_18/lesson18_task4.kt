package org.example.lesson_18

open class Box {
    open fun surfaceArea(): Double {
        return 0.0
    }
}

class RectangularBox(
    private val length: Double,
    private val width: Double,
    private val height: Double
) : Box() {
    override fun surfaceArea(): Double {
        return TWO * (length + width + length * height + width * height)
    }
}

class Cube(private val edgeLength: Double) : Box() {
    override fun surfaceArea(): Double {
        return SIX * edgeLength * edgeLength
    }
}

fun main() {
    val boxes: List<Box> = listOf(
        RectangularBox(2.5, 4.5,5.5),
        Cube(6.0)
    )

    for (box in boxes) {
        println("Площадь поверхности посылки: ${box.surfaceArea()}")
    }
}

const val TWO = 2
const val SIX = 6