package org.example.lesson_5

fun main() {
    println("Для того, чтобы войти в программу, решите задачу: $NUMBER1 + $NUMBER2")

    val userAnswer = readln().toInt()

    val accessToContent = if (userAnswer == NUMBER1 + NUMBER2) {
        "Добро пожаловать!"
    } else {
        "Доступ запрещен."
    }

    println(accessToContent)

}
const val NUMBER1 = 7
const val NUMBER2 = 9