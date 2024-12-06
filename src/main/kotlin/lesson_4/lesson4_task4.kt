package org.example.lesson_4

fun main() {
    val day = 5
    val isHandAndAbsDay = day % 2 != 0
    val isLegsAndBackDay = day % 2 == 0

    println ("""
         Упражнения для рук:   $isHandAndAbsDay
         Упражнения для ног:   $isLegsAndBackDay
         Упражнения для спины: $isLegsAndBackDay
         Упражнения для пресса:$isHandAndAbsDay
        """.trimIndent())
}