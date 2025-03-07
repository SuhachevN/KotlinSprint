package org.example.lesson_12

class CurrentWeather(temperatureDayInKalvin: Int, temperatureNightInKalvin: Int, precip: Boolean,) {
    val kelvinToCelsiusConversion = 273
    val dayTemp: Int = temperatureDayInKalvin - kelvinToCelsiusConversion
    val nightTemp: Int = temperatureNightInKalvin - kelvinToCelsiusConversion
    val isPrecipitation: Boolean = precip


    fun displayWeather() {
        println("Дневная температура: $dayTemp°C")
        println("Ночная температура: $nightTemp°C")
        println("Наличие осадков: ${if (isPrecipitation) "Да" else "Нет"}")
    }
}

fun main() {
    val todayWeather = CurrentWeather(temperatureDayInKalvin = 297, temperatureNightInKalvin = 291, precip = true)

    todayWeather.displayWeather()
}