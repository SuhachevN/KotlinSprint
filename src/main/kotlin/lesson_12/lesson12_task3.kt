package org.example.lesson_12

class CurrentWeather(temperatureDayInKalvin: Int, temperatureNightInKalvin: Int, precip: Boolean,) {
    val dayTemp: Int = temperatureDayInKalvin - 273
    val nightTemp: Int = temperatureNightInKalvin - 273
    val precipitation: Boolean = precip


    fun displayWeather() {
        println("Дневная температура: $dayTemp°C")
        println("Ночная температура: $nightTemp°C")
        println("Наличие осадков: ${if (precipitation) "Да" else "Нет"}")
    }
}

fun main() {
    val todayWeather = CurrentWeather(temperatureDayInKalvin = 297, temperatureNightInKalvin = 291, precip = true)

    todayWeather.displayWeather()
}