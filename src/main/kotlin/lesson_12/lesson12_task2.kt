package org.example.lesson_12

class DailyWeather(
    var dayTemp: Int,
    var nightTemp: Int,
    var isPrecipitation: Boolean,
){
    fun displayWeather() {
        println("Дневная температура: $dayTemp")
        println("Ночная температура: $nightTemp")
        println("Наличие осадков: ${if (isPrecipitation) "Да" else "Нет"}")
    }
}
fun main() {
    val todayWeather = DailyWeather(dayTemp = 21, nightTemp = 17, isPrecipitation = true)
    todayWeather.displayWeather()
}