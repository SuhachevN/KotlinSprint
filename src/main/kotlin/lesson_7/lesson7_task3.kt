package org.example.lesson_7

fun main() {
    println("Введите число:")
    val userNumber = readln().toInt()

    if (userNumber >= 0) {
        // Вывод чётных чисел от 0 до введённого числа (включительно)
        for (i in 0..userNumber step 2) {
            println(i)
        }
    } else {
        println("Введите корректное число.")
    }
}

