package org.example.lesson_2

import kotlin.math.pow

fun main () {
    val principal = 70000
    val rate = 16.7 / 100
    val time = 20

    val amount = principal * (1 + rate).pow(time)

    println( "%.3f".format(amount))
}