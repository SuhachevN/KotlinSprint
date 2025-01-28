package org.example.lesson_11

fun main() {
    val user1 = User(
        id = 1,
        login = "asteroid",
        password = "destroyer",
        mail = "asteroid_destroyer@gmail.com",
    )

    val user2 = User(
        id = 2,
        login = "galactic",
        password = "absorber",
        mail = "galactic_absorber@gmail.com"
    )

    println(user1.id)
    println(user1.login)
    println(user1.password)
    println(user1.mail)
    println()
    println(user2.id)
    println(user2.login)
    println(user2.password)
    println(user2.mail)
}