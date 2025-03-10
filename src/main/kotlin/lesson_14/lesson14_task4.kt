package org.example.lesson_14

open class CelestialBody(
    val name: String,
    val hasAtmosphere: Boolean,
    val isSuitableForPlanting: Boolean,
) {
    open fun displayInfo() {
        println("Небесное тело: $name, Атмосфера: $hasAtmosphere, Пригодно для высадки: $isSuitableForPlanting")
    }
}

class Planet(
    name: String,
    hasAtmosphere: Boolean,
    isSuitableForPlanting: Boolean,
) : CelestialBody(name, hasAtmosphere, isSuitableForPlanting) {
    val satellites: MutableList<Satellite> = mutableListOf()

    fun addSatellite(satellite: Satellite) {
        satellites.add(satellite)
    }

    fun displaySatellites() {
        if (satellites.isNotEmpty()) {
            println("Спутники планеты $name:")
            satellites.forEach { println(" - ${it.name}, Атмосфера: ${it.hasAtmosphere}, Пригоден для высадки: ${it.isSuitableForPlanting}") }
        } else {
            println("У планеты $name нет спутников.")
        }
    }
}

class Satellite(
    name: String,
    hasAtmosphere: Boolean,
    isSuitableForPlanting: Boolean,
) : CelestialBody(name, hasAtmosphere, isSuitableForPlanting)

fun main() {
    val earth = Planet("Земля", hasAtmosphere = true, isSuitableForPlanting = true)
    val jupiter = Planet("Юпитер", hasAtmosphere = true, isSuitableForPlanting = false)

    val satellite1 = Satellite("Луна", hasAtmosphere = false, isSuitableForPlanting = false)
    val satellite2 = Satellite("Фобос", hasAtmosphere = false, isSuitableForPlanting = false)
    val satellite3 = Satellite("Ганимед", hasAtmosphere = false, isSuitableForPlanting = true)
    val satellite4 = Satellite("Ио", hasAtmosphere = false, isSuitableForPlanting = true)

    earth.addSatellite(satellite1)
    earth.addSatellite(satellite2)

    jupiter.addSatellite(satellite3)
    jupiter.addSatellite(satellite4)

    earth.displayInfo()
    earth.displaySatellites()

    jupiter.displayInfo()
    jupiter.displaySatellites()
}