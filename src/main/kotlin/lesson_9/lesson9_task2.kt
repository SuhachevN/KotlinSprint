package org.example.lesson_9

fun main() {
    val ingredients = listOf("мука", "сливки", "яйцо")

    println("В рецепте есть базовые ингредиенты: $ingredients")

    println("Желаете добавить еще? (да/нет)")
    val userAnswer = readln().toString()

    when (userAnswer) {
        "нет" -> {
            println("Хорошо, добавим в другой раз!")
        }
        "да" -> {
            println("Какой ингредиент вы хотите добавить?")
            val newIngredient = readln()

            val allIngredients = ingredients + newIngredient
            println("Теперь в рецепте есть следующие ингредиенты: $allIngredients")

        } else -> {
            println("Некорректный ввод")
        }
    }


}