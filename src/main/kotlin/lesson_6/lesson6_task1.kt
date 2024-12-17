package org.example.lesson_6

fun main() {

    println("Придумайте логин:")
    val registeredLogin = readln()

    println("Придумайте пароль:")
    val registeredPassword = readln()

    println("Вы успешно зарегистрировались!")

    while (true) {
        println("Введите логин для авторизации")
        val login = readln()

        println("Введите пароль для авторизации")
        val password = readln()

        if (login == registeredLogin && password == registeredPassword) {
            println("Авторизация прошла успешно")
            break
        } else {
            println("Неверный логин или пароль. Попробуйте снова.")
        }
    }
}
