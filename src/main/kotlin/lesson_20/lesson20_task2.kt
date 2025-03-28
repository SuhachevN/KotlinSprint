package org.example.lesson_20

class Player(
    val name: String,
    var currentHp: Int,
    val maxHp: Int,
) {
    fun printStatus() {
        println("Персонаж $name: текущее хп - $currentHp, максимальное хп - $maxHp")
    }
}

fun main() {
    val player = Player("Наруто", 50, 100)
    player.printStatus()

    val healPotion: (Player) -> Unit = { it ->
        it.currentHp = it.maxHp
        println("Персонаж ${it.name} использовал лечебное зелье")
    }

    healPotion(player)
    player.printStatus()
}