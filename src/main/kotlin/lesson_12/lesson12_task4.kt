package org.example.lesson_12

class DailyWeather(temperatureDayInKalvin: Int, temperatureNightInKalvin: Int, isPrecip: Boolean,) {
    val kelvinToCelsiusConversion = 273
    val dayTemp: Int = temperatureDayInKalvin - kelvinToCelsiusConversion
    val nightTemp: Int = temperatureNightInKalvin - kelvinToCelsiusConversion
    val precipitation: Boolean = isPrecip

    init {
        displayWeather()
    }
fun displayWeather() {
    println("Дневная температура: $dayTemp°C")
    println("Ночная температура: $nightTemp°C")
    println("Наличие осадков: ${if (precipitation) "Да" else "Нет"}")
}
}
fun main() {
    val todayWeather = DailyWeather(temperatureDayInKalvin = 297, temperatureNightInKalvin = 291, isPrecip = false)
}