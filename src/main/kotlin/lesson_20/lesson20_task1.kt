package org.example.lesson_20
fun main() {
    val splashScreen: (String) -> String = { userName: String -> "C наступающим новым годом, $userName!" }

    val userName = "user"

    val greetingMessage = splashScreen(userName)
    println(greetingMessage)
}