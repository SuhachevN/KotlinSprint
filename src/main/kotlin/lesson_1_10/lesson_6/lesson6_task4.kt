package org.example.lesson_1_10.lesson_6

fun main() {
    var numberOfAttempts = 5
    val secretNumber = (1..9).random()
    println("Угадай случайное число от 1 до 9. У тебя есть $numberOfAttempts попыток!")

    while (numberOfAttempts > 0) {
        println("ВВедите ваше число:")
        val userNumber = readln().toInt()

        if (userNumber == secretNumber) {
            println("Это была великолепная игра!")
            break
        } else {
            numberOfAttempts--
            println("Не угадал! Попробуй еще. У тебя осталось $numberOfAttempts попытки.")
        }
    }
    println("Было загадано число $secretNumber.")
}