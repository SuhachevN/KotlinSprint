package org.example.lesson_18

open class Tamagochi(val name: String) {
    open fun eat() {
        println("$name -> кушает")
    }

    open fun sleep() {
        println("$name -> спит")
    }
}

class Fox(name: String) : Tamagochi(name) {
    override fun eat() {
        println("$name -> кушает ягоды")
    }

    override fun sleep() {
        super.sleep()
    }
}

class Dog(name: String) : Tamagochi(name) {
    override fun eat() {
        println("$name -> грызет косточки")
    }

    override fun sleep() {
        super.sleep()
    }
}

class Cat(name: String) : Tamagochi(name) {
    override fun eat() {
        println("$name -> ест рыбку")
    }

    override fun sleep() {
        super.sleep()
    }
}

fun main() {
    val ListOfAnimals: List<Tamagochi> = listOf(
        Fox("Лиса"),
        Dog("Собака"),
        Cat("Кошка")
    )

    for (animal in ListOfAnimals) {
        animal.eat()
        animal.sleep()
    }
}