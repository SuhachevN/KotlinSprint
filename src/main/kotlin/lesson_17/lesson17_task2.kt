package org.example.lesson_17

class Ship(
    private val name: String,
    var averageSpeed: Double,
    var homePort: String
) {
    fun getName(): String {
        return name
    }

    fun attemptToChangeName(newName: String) {
        println("Предупреждение: имя корабля нельзя изменить. Текущее имя: $name")
    }
}

fun main() {
    val ship = Ship("Аврора", 20.0, "Ленинград")

    println("Имя корабля: ${ship.getName()}")
    println("Средняя скорость: ${ship.averageSpeed} узлов")
    println("Порт приписки: ${ship.homePort}")

    ship.attemptToChangeName("Наутилус")
    ship.averageSpeed = 21.0
    ship.homePort = "Котлин"

    println("Обновленная средняя скорость: ${ship.averageSpeed} узлов")
    println("Обновленный порт приписки: ${ship.homePort}")
}
