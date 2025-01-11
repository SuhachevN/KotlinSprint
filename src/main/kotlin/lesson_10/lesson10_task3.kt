package org.example.lesson_10

fun main() {
    println("Какова будет длина пароля?")
    val passwordLength = readln().toInt()

    val password = passwordGeneration(passwordLength)

    println("Сгенерированный пароль: $password")
}

fun passwordGeneration(length: Int): String {
    val digits = '0'..'9'
    val specialChars = listOf('!','"', '#', '$', '%', '&', '(', ')', '*', '+', ',', '-', '.', '/')
    val passwordBuilder = StringBuilder()

    for (i in 0 until length) {
        if (i % 2 == 0) {
            passwordBuilder.append(digits.random())
        } else {
            passwordBuilder.append(specialChars.random())
        }
    }
    return passwordBuilder.toString()
}