package org.example.lesson_8

fun main() {
    val viewsPerDay = arrayOf(100, 150, 200, 250, 300, 350, 400)

    var viewsPerWeek = 0

    for (i in viewsPerDay) {
         viewsPerWeek += i
    }

    println("Просмотров рекламы за неделю: $viewsPerWeek")
}