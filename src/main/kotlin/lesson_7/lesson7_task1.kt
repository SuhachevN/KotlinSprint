package org.example.lesson_7

import kotlin.random.Random

fun main() {
    val letters = 'a'..'z'
    val digits = '0'..'9'

    var password = ""

    for (i in 0 until 6) {
        if (i % 2 == 0) {

            password += letters.random()
        } else {

            password += digits.random()
        }
    }

    println(password)
}