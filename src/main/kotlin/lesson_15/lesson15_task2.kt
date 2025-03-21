package org.example.lesson_15

abstract class WeatherStationStats {
    abstract fun getData(): String
}

class Temperature(private val degrees: Double) : WeatherStationStats() {
    override fun getData(): String {
        return "Температура: $degrees°C"
    }
}

class PrecipitationAmount(private val amount: Double) : WeatherStationStats() {
    override fun getData(): String {
        return "Количество осадков: $amount мм"
    }
}

class WeatherServer {
    fun sendData(stats: WeatherStationStats) {
        println("Отправка данных на сервер...")
        when (stats) {
            is Temperature -> println("Получены данные о температуре: ${stats.getData()}")
            is PrecipitationAmount -> println("Получены данные о количестве осадков: ${stats.getData()}")
            else -> println("Неизвестный тип данных.")
        }
    }
}

fun main() {
    val temperatureData = Temperature(21.7)
    val precipitationData = PrecipitationAmount(33.0)

    val weatherServer = WeatherServer()

    weatherServer.sendData(temperatureData)
    weatherServer.sendData(precipitationData)
}
