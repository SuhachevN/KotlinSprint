package org.example.lesson_15

interface Flyable {
    fun fly()
}
interface Swimmable {
    fun swim()
}

class Seagull : Flyable {
    override fun fly() {
        println("Чайка летит.")
    }
}
class Duck : Flyable, Swimmable {
    override fun fly() {
        println("Утка летит.")
    }

    override fun swim() {
        println("Утка плывет.")
    }
}
class Carp : Swimmable {
    override fun swim() {
        println("И карась поплыл...") // Хокку
    }
}

fun main() {
    val seagull = Seagull()
    val duck = Duck()
    val carp = Carp()

    seagull.fly()
    duck.fly()
    duck.swim()
    carp.swim()
}