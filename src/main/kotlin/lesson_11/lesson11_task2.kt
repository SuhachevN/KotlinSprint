package org.example.lesson_11

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val mail: String,
    var bio: String? = null
) {
    fun printInfo() {
        println("Айди пользователя: $id")
        println("Имя пользователя: $login")
        println("Пароль: $password")
        println("Почта: $mail")
        println("О себе: ${bio ?: "Не указано"}")

    }

    fun updateBio() {
        println("Введите информацию о себе:")
        bio = readln()
        println("Информация <О себе> обновлена.")
    }

    fun changePassword() {
        println("Чтобы изменить пароль на новый, введите текущий пароль:")
        val currentPassword = readln()

        if (currentPassword == password) {
            println("Введите новый пароль:")
            password = readln()
            println("Пароль успешнo изменен.")
        } else {
            println("Неверный текущий пароль. Пароль не изменен.")
        }
    }
}

fun main() {
    val user = User2(
        id = 1,
        login = "asteroid",
        password = "destroyer",
        mail = "asteroid_destroyer@gmail.com",
        bio = "Не указано"
    )

    println("Текущая информация о пользователе:")
    user.printInfo()

    user.updateBio()
    user.changePassword()

    println("Обновленная информация о пользователе:")
    user.printInfo()
}
