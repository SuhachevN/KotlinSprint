package org.example.lesson_1_10.lesson_4

fun main() {
    val bookedToday = NUMBER_OF_TABLES
    val bookedTomorrow = 9

    val availableToday = bookedToday < NUMBER_OF_TABLES
    val availableTomorrow = bookedTomorrow < NUMBER_OF_TABLES

    println("Доступность столиков на сегодня: $availableToday")
    println("Доступность столиков на сегодня: $availableTomorrow")


}
const val NUMBER_OF_TABLES = 13