package org.example.lesson_4

fun main() {
    val isSunny = IS_WEATHER_TODAY_SUNNY
    val isTentOpen = IS_TENT_OPEN
    val airHumidity = AIR_HUMIDITY
    val currentSeason = SEASON

    val isConditionsCorrect = isSunny && isTentOpen && airHumidity == 20 && currentSeason != SEASON

    println("Благоприятные ли условия сейчас для роста бобовых? $isConditionsCorrect")
}
const val AIR_HUMIDITY = 20
const val SEASON = "зима"
const val IS_WEATHER_TODAY_SUNNY = true
const val IS_TENT_OPEN = true