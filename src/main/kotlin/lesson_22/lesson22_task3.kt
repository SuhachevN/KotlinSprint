package org.example.lesson_22

data class Hero(val name: String, val level: Int, val age: Int)

fun main() {
    val hero = Hero("Наруто", 100, 16)

    val (name, level, age) = hero

    println("Имя: $name")
    println("Уровень: $level")
    println("Возраст: $age")
}