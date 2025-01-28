package org.example.lesson_1_10.lesson_7



fun main() {
    var isAuthenticated = false

    while (!isAuthenticated) {
        val authCode = (1000..10000).random()
        println("Ваш код авторизации: $authCode")

        print("Введите код для авторизации: ")
        val userInput = readln().toInt()

        if (userInput == authCode) {
            println("Приветствуем! Вы успешно авторизованы!")
            isAuthenticated = true
        } else {
            println("Неверный код! Попробуйте снова.")
        }
    }
}