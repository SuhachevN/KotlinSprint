package org.example.lesson_17

class Ship(
    private var _name: String,
    var averageSpeed: Double,
    var homePort: String
) {
    var name: String
        get() = _name
        set(value) {
            println("Предупреждение: имя корабля нельзя изменить. Текущее имя: $_name")
        }

    init {
        _name = name
    }
}

fun main() {
    val ship = Ship("Аврора", 20.0, "Ленинград")

    println("Имя корабля: ${ship.name}")
    println("Средняя скорость: ${ship.averageSpeed} узлов")
    println("Порт приписки: ${ship.homePort}")

    ship.averageSpeed = 21.0
    ship.homePort = "Котлин"

    println("Обновленная средняя скорость: ${ship.averageSpeed} узлов")
    println("Обновленный порт приписки: ${ship.homePort}")
}
