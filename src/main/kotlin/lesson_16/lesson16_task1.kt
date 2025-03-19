package org.example.lesson_16

import kotlin.random.Random

 class Dice {
    private val value: Int = Random.nextInt(1, 7)

    fun showValue() {
        println("Значение кубика: $value")
    }
}


fun main() {
    val dice = Dice()
    dice.showValue()
}
