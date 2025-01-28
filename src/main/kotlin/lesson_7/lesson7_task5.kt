package org.example.lesson_7

import kotlin.random.Random

fun main() {
    println("Введите длину пароля (не менее 6 символов):")
    val length = readln().toInt()

    if (length < 6) {
        println("Длина пароля должна быть не менее 6 символов.")
        return
    }

    val lowerCaseLetters = ('a'..'z').toList()
    val upperCaseLetters = ('A'..'Z').toList()
    val digits = ('0'..'9').toList()

    val passwordChars = mutableListOf<Char>()

    passwordChars.add(lowerCaseLetters.random())
    passwordChars.add(upperCaseLetters.random())
    passwordChars.add(digits.random())

    for (i in 3 until length) {
        when (Random.nextInt(3)) {
            0 -> passwordChars.add(lowerCaseLetters.random())
            1 -> passwordChars.add(upperCaseLetters.random())
            2 -> passwordChars.add(digits.random())
        }
    }

    passwordChars.shuffle()

    val password = passwordChars.joinToString("")

    println("Сгенерированный пароль: $password")
}