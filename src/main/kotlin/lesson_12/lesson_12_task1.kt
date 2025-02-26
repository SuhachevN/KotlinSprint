package org.example.lesson_12

class Weather() {

    var dayTemperature: Int = 1
    var nightTemperature: Int = 2
    var precipitation: Boolean = false

    fun displayWeather() {
        println("Дневная температура: $dayTemperature")
        println("Ночная температура: $nightTemperature")
        println("Наличие осадков: ${if (precipitation) "Да" else "Нет"}")
    }
}

fun main() {
    val Weather1 = Weather()
    val Weather2 = Weather()

    Weather1.dayTemperature = 22
    Weather1.nightTemperature = 17
    Weather1.precipitation = false

    Weather2.dayTemperature = 24
    Weather2.nightTemperature = 16
    Weather2.precipitation = true

    println("Погода первого дня:")
    Weather1.displayWeather()

    println("\nПогода второго дня:")
    Weather2.displayWeather()
}