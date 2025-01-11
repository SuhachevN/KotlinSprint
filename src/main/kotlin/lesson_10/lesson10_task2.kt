package org.example.lesson_10

fun main() {
    println("Введите логин:")
    val login = readln()

    println("Введите пароль:")
    val password = readln()

    if (isValidLength(login) && isValidLength(password)) {
        println("Добро пожаловать, $login!")
    } else {
        println("Логин или пароль недостаточно длинные.")
    }

}

fun isValidLength(input: String) = input.length >= 4