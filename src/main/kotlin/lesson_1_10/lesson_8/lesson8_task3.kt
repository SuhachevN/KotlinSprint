package org.example.lesson_1_10.lesson_8

fun main() {
    val arrayOfIngredients = arrayOf("мука", "яйца", "молоко", "соль", "сахар")

    println("Какой ингредиент вас интересует?")
    val userAnswer = readln()

    val index = arrayOfIngredients.indexOf(userAnswer)

    if (index != -1) {
        println("Ингредиент $userAnswer в рецепте есть.")
    } else {
        println("Такого ингредиента в рецепте нет.")
    }
}