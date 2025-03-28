package org.example.lesson_20

class Robot {
    private var modifier: ((String) -> String)? = null
    private val phrases = listOf(
        "Привет",
        "Как дела",
        "Чем занимаешься",
        "Занят сегодня?",
        "О чем думаешь?"
    )

    fun say() {
        val phrase = phrases.random()
        val modifiedPhrase = modifier?.invoke(phrase) ?: phrase
        println(modifiedPhrase)
    }

    fun setModifier(modifier: (String) -> String) {
        this.modifier = modifier
    }
}

fun main() {
    val robot = Robot()

    robot.say()

    robot.setModifier { phrase ->
        phrase.split(" ").reversed().joinToString(" ")
    }

    robot.say()
}
