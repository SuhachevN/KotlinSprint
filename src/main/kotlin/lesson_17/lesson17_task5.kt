package org.example.lesson_17

class User(
    private var _login: String,
    private var _password: String
) {
    var login: String
        get() = _login
        set(value) {
            _login = value
            println("Логин успешно изменён на: $value")
        }

    var password: String
        get() = "*".repeat(_password.length)
        set(value) {
            println("Вы не можете изменить пароль")
        }
}

fun main() {
    val user = User("Asteroid", "Destroyer123")

    println("Текущий логин: ${user.login}")
    println("Текущий пароль: ${user.password}")

    user.login = "Galactic"

    user.password = "123123"

    println("Новый логин: ${user.login}")
}
