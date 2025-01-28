package org.example.lesson_1_10.lesson_8

fun main() {
    val arrayOfIngredients = arrayOf("мука", "яйца", "соль", "перец", "молоко")

    for (i in arrayOfIngredients) {
        println("Ингредиент ${arrayOfIngredients.indexOf(i) + 1}: $i")
    }

    println("Какой ингредиент вы хотите заменить?")
    val userAnswer = readln().toString()

    val index = arrayOfIngredients.indexOf(userAnswer)

    if (index == -1) {
        println("Такого ингредиента в списке нет.")
    } else {
        println("На какой ингредиент вы хотите заменить $userAnswer?")
        val newIngredient = readln().toString()

        arrayOfIngredients[index] = newIngredient

        println("Готово! Вы сохранили следующий список: ${arrayOfIngredients.joinToString(", ")}")
    }
}