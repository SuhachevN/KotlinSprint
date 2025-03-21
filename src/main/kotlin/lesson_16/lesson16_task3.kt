package org.example.lesson_16

class User(private val login: String, private val password: String,) {
    fun validatePassword(inputPassword: String): Boolean {
        return inputPassword == password
    }

}

fun main() {
    val user = User("galactic1", "destroyer2")

    val inputPassword = readlnOrNull()
    val isPasswordCorrect = user.validatePassword(inputPassword.toString())

    if (isPasswordCorrect) {
        println("Пароль введён корректно.")
    } else {
        println("Пароль неверный.")
    }
}