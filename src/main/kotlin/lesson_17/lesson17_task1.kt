package org.example.lesson_17

class Quiz(private val question: String,
           answer: String,
    ) {
    fun getQuestion(): String {
        return question
    }

    var answer: String = answer
        get() = field
        set(value) {
            field = value
        }
}

fun main() {
    val quizObject = Quiz("Какой сейчас месяц", "Март")

    println("Вопрос: ${quizObject.getQuestion()}")
    println("Ответ: ${quizObject.answer}")

    quizObject.answer = "Не знаю"
    println("Обновленный ответ: ${quizObject.answer}")
}