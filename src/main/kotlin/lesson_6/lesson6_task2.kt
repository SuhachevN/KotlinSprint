package org.example.lesson_6

fun main() {
    println("Введите количество секунд, которые надо засечь:")
    val seconds = readln().toInt()

    if (seconds > 0) {
        var countedTime = 0

        println("Таймер запущен на $seconds секунд(ы)...")

        while (countedTime < seconds) {
            Thread.sleep(1000)
            println("${countedTime++}")
        }
        println("Прошло $seconds секунд")
    } else {
        println("Введите данные корректно")
    }
}