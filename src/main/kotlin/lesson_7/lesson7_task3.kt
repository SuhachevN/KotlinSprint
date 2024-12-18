package org.example.lesson_7

fun main() {
    println("Введите число:")
    val userNumber = readln().toInt()

    if (userNumber >= 0) {
        for (i in 0..userNumber step 2) {
            println(i)
        }
    } else {
        println("Введите корректное число.")
    }
}