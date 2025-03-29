package org.example.lesson_21

class Player(
    val name: String,
    var currentHp: Int,
    val maxHp: Int,
)

fun Player.isHealthy(): Boolean {
    return currentHp == maxHp
}

fun main() {
    val player1 = Player("Наруто", 100, 100)
    val player2 = Player("Саске", 50, 100)

    println("is ${player1.name} full HP: ${player1.isHealthy()}")
    println("is ${player2.name} full HP: ${player2.isHealthy()}")
}
