package org.example.lesson_1_10.lesson_10

fun main() {
    val token = org.example.lesson_1_10.lesson_10.authorize(
        org.example.lesson_1_10.lesson_10.VALID_LOGIN,
        org.example.lesson_1_10.lesson_10.VALID_PASSWORD
    )

    if (token != null) {
        println("Вы успешно авторизованы. Токен доступа: $token")
        val cart = org.example.lesson_1_10.lesson_10.getCart(token)
        println("Содержимое корзины: ${cart ?: "Не удалось получить корзину."}")
    } else {
        println("Ошибка авторизации. Проверьте логин и пароль.")
    }
}

fun authorize(login: String, password: String): String? {
    return if (login == org.example.lesson_1_10.lesson_10.VALID_LOGIN && password == org.example.lesson_1_10.lesson_10.VALID_PASSWORD) {
        org.example.lesson_1_10.lesson_10.generateToken()
    } else {
        null
    }
}

fun generateToken(): String {
    val chars = ('A'..'Z') + ('a'..'z') + ('0'..'9')
    return (1..32).map { chars.random() }.joinToString("")
}

fun getCart(token: String): List<String>? {
    return if (token.length == 32) org.example.lesson_1_10.lesson_10.CART_ITEMS else null
}
val CART_ITEMS = listOf("Товар A", "Товар B", "Товар C")
const val VALID_LOGIN = "user123"
const val VALID_PASSWORD = "password123"
