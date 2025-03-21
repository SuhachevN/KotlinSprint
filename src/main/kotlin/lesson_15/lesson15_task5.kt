package org.example.lesson_15

interface Vehicle {
    fun drive()
}

interface PassengerTransport {
    var currentPassengers: Int
    val maxPassengers: Int

    fun loadPassenger() {
        if (currentPassengers < maxPassengers) {
            currentPassengers++
            println("Пассажир загружен. Текущие пассажиры: $currentPassengers.")
        } else {
            println("Невозможно загрузить больше пассажиров. Максимум: $maxPassengers.")
        }
    }

    fun unloadPassenger() {
        if (currentPassengers > 0) {
            currentPassengers--
            println("Пассажир выгружен. Текущие пассажиры: $currentPassengers.")
        } else {
            println("Нет пассажиров для выгрузки.")
        }
    }
}

class PassengerCar : Vehicle, PassengerTransport {
    override var currentPassengers: Int = 0
    override val maxPassengers: Int = 3

    override fun drive() {
        println("Легковой автомобиль поехал!")
    }
}

class CargoTruck : Vehicle, PassengerTransport {
    override var currentPassengers: Int = 0
    override val maxPassengers: Int = 1
    var currentCargo: Double = 0.0
    val maxCargo: Double = 2.0

    override fun drive() {
        println("Грузовой автомобиль поехал!")
    }

    fun loadCargo(weight: Double) {
        if (currentCargo + weight <= maxCargo) {
            currentCargo += weight
            println("Груз загружен: $weight тонн. Текущий груз: $currentCargo тонн.")
        } else {
            println("Невозможно загрузить больше груза. Максимум: $maxCargo тонн.")
        }
    }

    fun unloadCargo(weight: Double) {
        if (currentCargo >= weight) {
            currentCargo -= weight
            println("Груз выгружен: $weight тонн. Текущий груз: $currentCargo тонн.")
        } else {
            println("Невозможно выгрузить больше груза, чем есть. Текущий груз: $currentCargo тонн.")
        }
    }
}

fun main() {
    val PassengerCar1 = PassengerCar()
    val PassengerCar2 = PassengerCar()
    val cargoTruck = CargoTruck()

    for (i in 1..3) {
        PassengerCar1.loadPassenger()
    }

    for (i in 1..2) {
        PassengerCar2.loadPassenger()
    }

    cargoTruck.loadPassenger()

    cargoTruck.loadCargo(1.0)
    cargoTruck.loadCargo(1.0)


    PassengerCar1.drive()
    PassengerCar2.drive()
    cargoTruck.drive()

    for (i in 1..3) {
        PassengerCar1.unloadPassenger()
    }
    for (i in 1..2) {
        PassengerCar2.unloadPassenger()
    }
    cargoTruck.unloadPassenger()

    cargoTruck.unloadCargo(1.0)
    cargoTruck.unloadCargo(1.0)
}
