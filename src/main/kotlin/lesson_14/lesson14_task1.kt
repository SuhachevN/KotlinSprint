package org.example.lesson_14

open class SuperShip(
    val name: String,
    val speed: Int,
    val capacity: Int,
    val isIceBreak: Boolean = false,
) {
    open fun displayInfo() {
        println("Корабль: $name, скорость: $speed миль в час, вместимость: $capacity")
    }
}

class CargoShip(
    name: String = "Грузовой корабль",
    speed: Int = 40,
    capacity: Int = 600,
) : SuperShip(name, speed, capacity) {
    override fun displayInfo() {
        println("Грузовой Корабль: $name, Скорость: $speed узлов, Грузоподъемность: $capacity тонн")
    }
}

class Liner(
    name: String = "Лайнер",
    speed: Int = 110,
    capacity: Int = 1000,
) : SuperShip(name, speed, capacity) {
    override fun displayInfo() {
        println("Лайнер: $name, Скорость: $speed миль в час, Вместимость: $capacity пассажиров")
    }
}

class Icebreaker(
    name: String = "Ледокол",
    speed: Int = 30,
    capacity: Int = 200,
) : SuperShip(name, speed, capacity, isIceBreak = true) {
    override fun displayInfo() {
        println("Ледокол: $name, Скорость: $speed миль в час, Вместимость: $capacity тонн")
    }
}


fun main() {
    val cargoShip = CargoShip(name = "Бисмарк")
    val icebreaker = Icebreaker(name = "Наутилус-1")
    val liner = Liner(name = "Аврора")

    cargoShip.displayInfo()
    println()
    icebreaker.displayInfo()
    println(icebreaker.isIceBreak)
    println()
    liner.displayInfo()
}