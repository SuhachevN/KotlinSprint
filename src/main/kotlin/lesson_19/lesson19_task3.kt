package org.example.lesson_19

class Spaceship() {
    fun takeOff() {
        println("Корабль взлетает")
    }
    // TODO требуется логика проверки исправности

    fun landing() {
        println("Корабль приземляется")
    }

    fun shoot() {
        throw NotImplementedError("Метод 'shoot()' еще не реализован.")
    }
}

fun main() {
    val spaceship = Spaceship()

    spaceship.takeOff()
    spaceship.landing()
    spaceship.shoot()
}
