package org.example.lesson_9

fun main() {
    val ingredientsForOnePortion = listOf(2, 50, 15)

    println("Сколько порций омлета вы хотите сделать?")
    val userAnswer = readln().toInt()

    val totalEggs = ingredientsForOnePortion[0] * userAnswer
    val totalMilk = ingredientsForOnePortion[1] * userAnswer
    val totalButter = ingredientsForOnePortion[2] * userAnswer

    println("Для $userAnswer порций омлета вам потребуется:")
    println("Яиц: $totalEggs шт.")
    println("Молока: $totalMilk мл")
    println("Сливочного масла: $totalButter гр")
}