package org.example.lesson_12

class DailyWeather(temperatureDayInKalvin: Int, temperatureNightInKalvin: Int, isPrecip: Boolean,) {
    private val kelvinToCelsiusConversion = 273
    private val dayTemp: Int = temperatureDayInKalvin - kelvinToCelsiusConversion
    private val nightTemp: Int = temperatureNightInKalvin - kelvinToCelsiusConversion
    private val isPrecipitation: Boolean = isPrecip

    init {
        displayWeather()
    }
private fun displayWeather() {
    println("Дневная температура: $dayTemp°C")
    println("Ночная температура: $nightTemp°C")
    println("Наличие осадков: ${if (isPrecipitation) "Да" else "Нет"}")
}
}
fun main() {
    val todayWeather = DailyWeather(temperatureDayInKalvin = 297, temperatureNightInKalvin = 291, isPrecip = false)
}