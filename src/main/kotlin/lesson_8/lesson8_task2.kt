package org.example.lesson_8

fun main() {
    val arrayOfIngredients = arrayOf("мука", "яйца", "молоко", "соль", "сахар")

    println("Какой ингредиент вас интересует?")
    val userAnswer = readln()

    var found = false

    for (ingredient in arrayOfIngredients) {
        if (ingredient == userAnswer) {
            found = true
            break
        }
    }

    if (found) {
        println("Ингредиент $userAnswer в рецепте есть.")
    } else {
        println("Такого ингредиента в рецепте нет.")
    }
}