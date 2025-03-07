package org.example.lesson_12

class Weather {
    val dayTemperature: Int
    val nightTemperature: Int
    val precipitation: Boolean

    constructor(dayTemperature: Int, nightTemperature: Int, precipitation: Boolean) {
        this.dayTemperature = dayTemperature
        this.nightTemperature = nightTemperature
        this.precipitation = precipitation
    }

    fun displayWeather() {
        println("Дневная температура: $dayTemperature, Ночная температура: $nightTemperature, Наличие осадков: ${if (precipitation) "Да" else "Нет"}")
    }
}

fun main() {
    val weather1 = Weather(dayTemperature = 22, nightTemperature = 17, precipitation = false)
    val weather2 = Weather(dayTemperature = 24, nightTemperature = 16, precipitation = true)

    println("Погода первого дня:")
    weather1.displayWeather()

    println("\nПогода второго дня:")
    weather2.displayWeather()
}