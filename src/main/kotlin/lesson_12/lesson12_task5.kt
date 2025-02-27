package org.example.lesson_12

import kotlin.random.Random

class Weather(kelvinDay: Int, kelvinNight: Int, val precipitation: Boolean) {
    val dayTemp: Int = kelvinDay - 273
    val nightTemp: Int = kelvinNight - 273
}

fun List<Int>.averageOrNull(): Double? {
    return if (isEmpty()) null else this.sum().toDouble() / this.size
}

fun main() {
    val weatherData = mutableListOf<Weather>()

    repeat(30) {
        val kelvinDay = Random.nextInt(273, 300)
        val kelvinNight = Random.nextInt(260, 280)
        val hasPrecipitation = Random.nextBoolean()
        weatherData.add(Weather(kelvinDay, kelvinNight, hasPrecipitation))
    }

    val dayTemps = weatherData.map { it.dayTemp }
    val nightTemps = weatherData.map { it.nightTemp }
    val daysWithPrecipitation = weatherData.count { it.precipitation }

    val averageDayTemp = dayTemps.averageOrNull() ?: 0.0
    val averageNightTemp = nightTemps.averageOrNull() ?: 0.0

    println("Средняя дневная температура: ${String.format("%.2f", averageDayTemp)}°C")
    println("Средняя ночная температура: ${String.format("%.2f", averageNightTemp)}°C")
    println("Количество дней с осадками: $daysWithPrecipitation")
}
