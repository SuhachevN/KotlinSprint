package org.example.lesson_4

fun main() {
    val isSunny = true
    val isTentOpen = true
    val airHumidity = 20
    val currentSeason = "зима"

    val isConditionsCorrect = (isSunny == IS_WEATHER_TODAY_SUNNY) &&
            (isTentOpen == IS_TENT_OPEN) &&
            (airHumidity == AIR_HUMIDITY) &&
            (currentSeason != SEASON)

    println("Благоприятные ли условия сейчас для роста бобовых? $isConditionsCorrect")
}
const val AIR_HUMIDITY = 20
const val SEASON = "зима"
const val IS_WEATHER_TODAY_SUNNY = true
const val IS_TENT_OPEN = true