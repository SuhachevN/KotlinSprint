package org.example.lesson_5
import kotlin.random.Random
fun main() {
    val winningNumbers = List(3) { Random.nextInt(0, 43) }

    println("Введите 3 числа от 0 до 42:")
    val guessedNumbers = List(3) { readln().toInt() }

    val matches = winningNumbers.intersect(guessedNumbers).size

    when (matches) {
        3 -> println("Поздравляем! Вы угадали все числа и выиграли джекпот!")
        2 -> println("Поздравляем! Вы угадали два числа и получаете крупный приз!")
        1 -> println("Поздравляем! Вы угадали одно число и получаете утешительный приз.")
        0 -> println("К сожалению, вы не угадали ни одного числа.")
    }

    println("Выигрышные числа: $winningNumbers")
}