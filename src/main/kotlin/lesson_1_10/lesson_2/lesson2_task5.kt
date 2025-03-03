package org.example.lesson_1_10.lesson_2

import kotlin.math.pow

fun main () {
    val principal = 70000
    val rate = 16.7
    val time = 20
    val partOfFormula1 = 1
    val partOfFormula2 = 100

    val amount = principal * (partOfFormula1 + rate / partOfFormula2).pow(time)

    println( "%.3f".format(amount))
}