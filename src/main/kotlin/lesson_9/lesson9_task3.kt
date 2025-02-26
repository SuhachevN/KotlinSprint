package org.example.lesson_9

fun main() {
    val ingredientsForOnePortion = listOf(2, 50, 15)

    println("Сколько порций омлета вы хотите сделать?")
    val userAnswer = readln().toInt()

    val totalIngredients = ingredientsForOnePortion.map { it * userAnswer }

    println("На $userAnswer порций вам понадобится:")
    println("Яиц: ${totalIngredients[0]} шт.")
    println("Молока: ${totalIngredients[1]} мл")
    println("Сливочного масла: ${totalIngredients[2]} гр")
}