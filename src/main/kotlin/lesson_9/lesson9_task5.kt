package org.example.lesson_9

fun main() {
    val listOfIngredients = mutableSetOf<String>()

    println("Введите 5 ингредиентов по одному:")

    for (i in 1..5) {
        println("ингредиент $i:")
        val ingredient = readln()
        listOfIngredients.add(ingredient)
    }

    val sortedIngredients = listOfIngredients.sorted().toMutableList()

    if (sortedIngredients.isNotEmpty()) {
        sortedIngredients[0] = sortedIngredients[0].replaceFirstChar { it.uppercase() }
    }

    println("Вы ввели следующие ингредиенты: ${sortedIngredients.joinToString(", ")}")
}