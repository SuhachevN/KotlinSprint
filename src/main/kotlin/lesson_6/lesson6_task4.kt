package org.example.lesson_6

import kotlin.random.Random

fun main() {
    var numberOfAttempts = 5
    val secretNumber = Random.nextInt(1, 10)
    println("Угадай случайное число от 1 до 9. У тебя есть $numberOfAttempts попыток!")

    while (numberOfAttempts > 0) {
        println("ВВедите ваше число:")
        val userNumber = readln().toInt()

        if (userNumber == secretNumber) {
            println("Это была великолепная игра!")
            break
        } else {
            numberOfAttempts--
            println("Неугадал! Попробуй еще. У тебя осталось $numberOfAttempts попытки.")
        }
    }
    println("Было загадано число $secretNumber.")
}