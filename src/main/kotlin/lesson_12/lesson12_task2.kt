package org.example.lesson_12

class DailyWeather(
    var dayTemp: Int,
    var nightTemp: Int,
    var precipitation: Boolean,
){
    fun displayWeather() {
        println("Дневная температура: $dayTemp")
        println("Ночная температура: $nightTemp")
        println("Наличие осадков: ${if (precipitation) "Да" else "Нет"}")
    }
}
fun main() {
    val todayWeather = DailyWeather(dayTemp = 21, nightTemp = 17, precipitation = true)
    todayWeather.displayWeather()
}