package org.example.lesson_1_10.lesson_4

fun main() {
    val crewCount = 55
    val hasDamage = false
    val provisionCount = 55
    val isWeatherGood = true

    val canDepart = (!hasDamage && (crewCount >= MIN_CREW) && (crewCount <= MAX_CREW) && (provisionCount > MIN_PROVISIONS) && isWeatherGood == CURRENT_WEATHER) ||
            (hasDamage && (crewCount == RECOMMENDED_CREW) && isWeatherGood == CURRENT_WEATHER && (provisionCount >= MIN_PROVISIONS))

    println(if (canDepart) "Корабль может отправиться в плавание." else "Корабль не может отправиться в плавание.")
}
const val MIN_CREW = 55
const val MAX_CREW = 70
const val MIN_PROVISIONS = 50
const val RECOMMENDED_CREW = 70
const val CURRENT_WEATHER = true
