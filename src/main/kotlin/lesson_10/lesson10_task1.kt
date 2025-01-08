package org.example.lesson_10

import kotlin.random.Random

fun main() {
    val playerRoll = rollDice()
    val pcRoll = rollDice()

    println("Игрок бросил кости и получил: $playerRoll")
    println("Компьютер бросил кости и получил: $pcRoll")

    val resultMessage = when {
        playerRoll > pcRoll -> "Победило человечество!"
        pcRoll > playerRoll -> "Победила машина!"
        else -> "Победила дружба!"
    }

    println(resultMessage)
}

fun rollDice(): Int = Random.nextInt(1,7)