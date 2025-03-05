package org.example.lesson_1_10.lesson_10

import kotlin.random.Random

fun main() {
    var userWins = 0
    while (true) {
        if (playRound()) {
            userWins++
        }

        println("Хотите бросить кости еще раз? да/нет")
        val continueGame = readln()

        if (continueGame != "да") {
            println("Игра окончена. Вы выиграли у компьютера $userWins раз.")
            break
        }
    }
}

fun playRound(): Boolean {
    val userRoll = diceRoll()
    println("Вы бросили кости и получили: $userRoll")

    val computerRoll = diceRoll()
    println("Компьютер бросил кости и получил: $computerRoll")

    return when {
        userRoll > computerRoll -> {
            println("Вы победили в этом раунде!")
            true
        }
        userRoll < computerRoll -> {
            println("Компьютер победил в этом раунде!")
            false
        }
        else -> {
            println("Это ничья!")
            false
        }
    }
}

fun diceRoll(): Int = Random.nextInt(1, 7)