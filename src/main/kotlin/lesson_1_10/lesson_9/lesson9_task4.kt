package org.example.lesson_1_10.lesson_9

fun main() {
    println("Введите пять ингредиентов, разделяя их запятой и пробелом")
    val userAnswer = readln()

    val listOfIngredients = userAnswer.split(", ").toMutableList()

    val sortedIngredients = listOfIngredients.sorted()

    println("Ваш список ингредиентов: $sortedIngredients")
}