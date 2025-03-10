package org.example.lesson_14

data class Message(
    val id: Int,
    val author: String,
    val text: String,
    val parentMessageId: Int? = null
)

class Chat {
    private val messages = mutableListOf<Message>()
    private var nextId = 1

    fun addMessage(text: String, author: String) {
        val message = Message(id = nextId++, author = author, text = text)
        messages.add(message)
    }

    fun addThreadMessage(parentMessageId: Int, text: String, author: String) {
        val parentMessage = messages.find { it.id == parentMessageId }
        if (parentMessage != null) {
            val childMessage = Message(id = nextId++, author = author, text = text, parentMessageId = parentMessageId)
            messages.add(childMessage)
        } else {
            println("Ошибка: родительское сообщение с ID $parentMessageId не найдено.")
        }
    }

    fun printChat() {
        val groupedMessages = messages.groupBy { it.parentMessageId }

        for ((parentId: Int?, group) in groupedMessages) {
            group.forEach { message ->
                if (message.parentMessageId == null) {
                    println("${message.author}: ${message.text} (ID: ${message.id})")
                } else {
                    println("\t${message.author}: ${message.text} (ID: ${message.id})")
                }
            }
        }
    }
}

fun main() {
    val chat = Chat()
    chat.addMessage("Привет!", "Антон")
    chat.addMessage("Как дела?", "Андрей")

    chat.addThreadMessage(1, "Здарова!", "Сергей")
    chat.addThreadMessage(2, "Отлично", "Гордей")
    chat.addThreadMessage(1, "Привет)", "Яша")
    chat.addThreadMessage(1, "Ку", "Данил")
    chat.addThreadMessage(1, "Приветик", "Маша")
    chat.addThreadMessage(2, "Супер, ты как?", "Дима")

    chat.printChat()
}
