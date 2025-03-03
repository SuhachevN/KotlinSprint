package org.example.lesson_1_10.lesson_6

import kotlin.random.Random

fun main() {
    val maxAttempts = 3
    var attempts = 0
    var isAuthenticated = false

    println("Добро пожаловать! Для доступа к контенту решите простой математический пример. У вас есть 3 попытки")

    while (attempts < maxAttempts) {
        val num1 = Random.nextInt(1,10)
        val num2 = Random.nextInt(1,10)

        println("сколько будет $num1 + $num2?")
        val userAnswer = readln().toInt()

        if (userAnswer == num1 + num2) {
            println("Добро пожаловать!")
            isAuthenticated = true
            break
        } else {
            println("Неверный ответ. Попробуйте снова.")
            attempts++
        }
    }
    if (!isAuthenticated) {
        println("Доступ запрещен.")
    }

}