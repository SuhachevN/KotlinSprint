package org.example.lesson_16

class Player(
    private val name: String,
    private var health: Int,
    private var attackPower: Int,
) {
    fun takeDamage(damage: Int) {
        if (health > 0) {
            health -= damage
            println("$name получает $damage урона. Осталось здоровья: $health")

            if (health <= 0) {
                handleDeath()
            }
        } else {
            println("$name мёртв и не может получать урон.")
        }
    }

    fun heal(healAmount: Int) {
        if (health > 0) {
            health += healAmount
            println("$name исцеляется на $healAmount. Текущие здоровье: $health")
        } else {
            println("$name мёртв и не может быть исцелен.")
        }
    }

    private fun handleDeath() {
        println("$name умирает!")
        health = 0
        attackPower = 0
    }

    fun getHealth(): Int {
        return health
    }

}

fun main() {
    val player = Player("Герой", 100, 20)

    player.takeDamage(30)
    player.heal(10)
    player.takeDamage(80)
    player.heal(100)

    println("Здоровье игрока после файта: ${player.getHealth()}")
}
