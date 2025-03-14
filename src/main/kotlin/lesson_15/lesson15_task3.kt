package org.example.lesson_15

abstract class User(val username: String) {
    abstract fun readMessage()
    abstract fun writeMessage(message: String)

    abstract fun displayRole()
}

class RegularUser(username: String) : User(username) {
    private val messages: MutableList<String> = mutableListOf()

    override fun readMessage() {
        println("$username читает сообщения на форуме.")
    }

    override fun writeMessage(message: String) {
        messages.add(message)
        println("$username написал сообщение: \"$message\"")
    }

    override fun displayRole() {
        println("$username - обычный пользователь")
    }
}

class Admin(username: String) : User(username) {
    private val messages: MutableList<String> = mutableListOf()

    override fun readMessage() {
        println("$username читает сообщения на форуме.")
    }

    override fun writeMessage(message: String) {
        messages.add(message)
        println("$username написал сообщение: \"$message\"")
    }

    override fun displayRole() {
        println("$username - администратор")
    }

    fun deleteMessage(message: String) {
        println("$username удалил сообщение: \"$message\"")
    }

    fun deleteUser(user: User) {
        println("$username удалил пользователя: ${user.username}")
    }
}

fun main() {
    val user1 = RegularUser("Семен")
    val admin1 = Admin("Сергей")

    user1.displayRole()
    admin1.displayRole()

    user1.readMessage()
    user1.writeMessage("Привет всем!")

    admin1.readMessage()
    admin1.writeMessage("Привет, Семен бан")
    admin1.deleteMessage("Привет всем!")
    admin1.deleteUser(user1)
}
