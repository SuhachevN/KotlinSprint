package org.example.lesson_1_10.lesson_8

fun main() {
    println("Введите нужное количество ингредиентов:")
    val userAnswer = readln().toInt()

    val ingredients = Array(userAnswer) { "" }

    for (i in 0 until userAnswer) {
        println("Введите ингредиент ${i + 1}:")
        ingredients[i] = readln()
    }

    val ingredientsString = ingredients.joinToString(", ")

    println("Вы ввели следующие ингредиенты: $ingredientsString")
}