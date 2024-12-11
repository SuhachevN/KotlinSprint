package org.example.lesson_5
fun main() {
    println("Введите имя пользователя")
    val inputUserName = readln()

    if (inputUserName != REGISTERED_NAME) {
        println("Пользователь не найден, пожалуйста зарегистрируйтесь")
        return
    }

    println("Введите пароль")
    val inputPassword = readln()

    if (inputPassword == REGISTERED_PASSWORD) {
        println("Добро пожаловать, $inputUserName!")
    } else {
        println("Неверный пароль.")
    }
}
const val REGISTERED_NAME = "Zaphod"
const val REGISTERED_PASSWORD = "PanGalactic"
