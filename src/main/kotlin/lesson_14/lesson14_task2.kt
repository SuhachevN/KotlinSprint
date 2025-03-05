package org.example.lesson_14

open class MainShip(
    val name: String,
    val speed: Int,
    val capacity: Int,
    val iceBreak: Boolean = false,
) {
    open fun displayInfo() {
        println("Корабль: $name, скорость: $speed миль в час, вместимость: $capacity")
    }
    open fun loadCargo() {
        println("$name не имеет специфического способа погрузки.")
    }
}

class Freighter(
    name: String = "Грузовой корабль",
    speed: Int = 40,
    capacity: Int = 600,
) : MainShip(name, speed, capacity) {
    override fun displayInfo() {
        println("Грузовой Корабль: $name, Скорость: $speed узлов, Грузоподъемность: $capacity тонн")
    }

    override fun loadCargo() {
        println("$name активирует погрузочный кран для загрузки.")
    }
}

class Liner1(
    name: String = "Лайнер",
    speed: Int = 110,
    capacity: Int = 1000,
) : MainShip(name, speed, capacity) {
    override fun displayInfo() {
        println("Лайнер: $name, Скорость: $speed миль в час, Вместимость: $capacity пассажиров")
    }

    override fun loadCargo() {
        println("$name выдвигает горизонтальный трап со шкафута для погрузки.")
    }

}

class Icebreaker1(
    name: String = "Ледокол",
    speed: Int = 30,
    capacity: Int = 200,
) : MainShip(name, speed, capacity, iceBreak = true) {
    override fun displayInfo() {
        println("Ледокол: $name, Скорость: $speed миль в час, Вместимость: $capacity тонн")
    }

    override fun loadCargo() {
        println("$name открывает ворота со стороны кормы для погрузки.")
    }
}

fun main() {
    val cargoShip = Freighter(name = "Victory")
    val icebreaker = Icebreaker1(name = "queen anne's revenge")
    val liner = Liner1(name = "Лузитания")

    cargoShip.displayInfo()
    cargoShip.loadCargo()
    println()

    icebreaker.displayInfo()
    icebreaker.loadCargo()
    println(icebreaker.iceBreak)
    println()

    liner.displayInfo()
    liner.loadCargo()
}