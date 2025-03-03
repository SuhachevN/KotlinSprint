package org.example.lesson_1_10.lesson_7

fun main() {
    println("Введите количество секунд для таймера:")

    val seconds = readln().toInt()

    if (seconds > 0) {
        for (i in seconds downTo 1) {
            println("Осталось $i секунд...")
            Thread.sleep(1000)
        }

        println("Время вышло.")
    } else {
        println("Введите корректное количество секунд.")
    }
}