package org.example.lesson_20

class Character(val name: String, val hasKey: Boolean) {
    fun printStatus() {
        println("Персонаж $name: ${if (hasKey) "ключ у игрока" else "ключ еще не найден"}")
    }
}

fun main() {
    val player1 = Character("Наруто", hasKey = false)
    val player2 = Character("Саске", hasKey = true)

    val checkDoor: (Character) -> String = { player ->
        if (player.hasKey) {
            "Игрок открыл дверь"
        } else {
            "Дверь заперта"
        }
    }

    player1.printStatus()
    println(checkDoor(player1))
    println()
    player2.printStatus()
    println(checkDoor(player2))
}