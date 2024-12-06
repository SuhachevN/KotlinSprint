package org.example.lesson_4

fun main() {
    val isSunny = true
    val isTentOpen = true
    val airHumidity = 20
    val currentSeason = "зима"

    val conditionCheck = (isSunny && isTentOpen) && (airHumidity == 20) && (currentSeason != "зима")

    println ("Благоприятные ли сейчас условия для роста бобовых? $conditionCheck")
}