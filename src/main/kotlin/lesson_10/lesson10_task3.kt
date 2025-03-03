package org.example.lesson_10

fun main() {
    println("Какова будет длина пароля?")
    val passwordLength = readln().toInt()

    val password = generatePassword(passwordLength)

    println("Сгенерированный пароль: $password")
}

fun generatePassword(length: Int): String {
    val digits = '0'..'9'
    val specialChars = (33..47).map { it.toChar() }
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