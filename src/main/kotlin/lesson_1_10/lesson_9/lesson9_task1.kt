package org.example.lesson_1_10.lesson_9

fun main() {
    val ingredients = listOf("мука", "соль", "яйцо", "молоко", "сливки")

    println("В рецепте есть следующие ингредиенты: $ingredients")

    var count = 1

    for (i in ingredients) {
        println("Ингредиент ${ count++ }: $i")
    }
}