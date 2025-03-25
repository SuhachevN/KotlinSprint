package org.example.lesson_19

enum class Aquarium(private val displayName: String) {
    GUPPY("Гуппи"),
    ANGELFISH("Скалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок");

    fun show() {
    println(displayName)
    }
}

fun main() {
    println("Доступные виды рыб для аквариума:")
    for (fish in Aquarium.entries) {
        fish.show()
    }
}

