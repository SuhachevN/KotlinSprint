package org.example.lesson_18

open class Die(private val sides: Int) {
    open fun roll() {
        val result = (1..sides).random()
        println("Выброшено $result на $sides-гранной кости")
    }
}
class FourSidedDie : Die(sides = 4) {
    override fun roll() {
        super.roll()
    }
}

class SixSidedDie : Die(sides = 6) {
    override fun roll() {
        super.roll()
    }
}

class EightSidedDie : Die(sides = 8) {
    override fun roll() {
        super.roll()
    }
}

fun main() {
    val dice: List<Die> = listOf(FourSidedDie(), SixSidedDie(), EightSidedDie())

    for (die in dice) {
        die.roll()
    }
}