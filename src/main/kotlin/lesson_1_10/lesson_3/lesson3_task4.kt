package org.example.lesson_1_10.lesson_3

fun main() {
    val from1 = "E2"
    val to1 = "E4"
    val moveNum1 = '1'

    println("$from1-$to1;$moveNum1")

    val from2 = "D2"
    val moveNum2 = moveNum1 + 1

    val letter = from2[0]
    val number = from2[1].digitToInt()

    val to2 = "$letter${number + 1}"

    println("$from2-$to2;$moveNum2")

}