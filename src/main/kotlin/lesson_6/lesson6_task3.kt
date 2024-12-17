package org.example.lesson_6

fun main() {
    println("Введите количество секунд, которые надо засечь:")
    val seconds = readln().toInt()

    if (seconds > 0) {
        var countedTime = seconds

        println("Таймер запущен на $seconds секунд(ы)...")

        while (countedTime > 0) {
            Thread.sleep(1000)
            println("Осталось секунд: ${countedTime--}")
        }
        println("Время вышло.")
    } else {
        println("Введите данные корректно")
    }
}