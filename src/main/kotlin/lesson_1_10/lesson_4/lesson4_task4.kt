package org.example.lesson_1_10.lesson_4

fun main() {
    val day = 5
    val isHandAndAbsDay = day % 2 != 0


    println ("""
         Упражнения для рук:   $isHandAndAbsDay
         Упражнения для ног:   ${!isHandAndAbsDay}
         Упражнения для спины: ${!isHandAndAbsDay}
         Упражнения для пресса:$isHandAndAbsDay
        """.trimIndent())
}