package org.example.lesson_17

class Package(
    val packageNumber: Int,
    private var _currentLocation: String,
) {
    var currentLocation: String
        get() = _currentLocation
        set(value) {
            _currentLocation = value
            movementCount++
        }

    var movementCount: Int = 0
        private set
}

fun main() {
    val packageItem = Package(1, "Склад 1")

    println("Номер посылки: ${packageItem.packageNumber}")
    println("Текущая локация: ${packageItem.currentLocation}")
    println("Количество перемещений: ${packageItem.movementCount}")

    packageItem.currentLocation = "Пункт обработки №1"
    println("\nПосылка перемещена.")

    println("Номер посылки: ${packageItem.packageNumber}")
    println("Текущая локация: ${packageItem.currentLocation}")
    println("Количество перемещений: ${packageItem.movementCount}")

    packageItem.currentLocation = "Пункт обработки №2"
    println("\nПосылка перемещена.")

    println("Номер посылки: ${packageItem.packageNumber}")
    println("Текущая локация: ${packageItem.currentLocation}")
    println("Количество перемещений: ${packageItem.movementCount}")
}
