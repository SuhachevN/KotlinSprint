package org.example.lesson_7

import kotlin.random.Random

fun main() {
    var isAuthenticated = false

    while (!isAuthenticated) {
        val authCode = Random.nextInt(1000, 10000)
        println("Ваш код авторизации: $authCode")

        print("Введите код для авторизации: ")
        val userInput = readln().toInt()

        if (userInput == authCode) {
            println("Приветствуем! Вы успешно авторизованы!")
            isAuthenticated = true
        } else {
            println("Неверный код! Попробуйте снова.")
        }
    }
}