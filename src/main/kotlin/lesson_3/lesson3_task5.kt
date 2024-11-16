package org.example.lesson_3

fun main() {
    val input = "D2-D4;0"

    val parts = input.split(";")
    val moveDetails = parts[0]
    val moveNumber = parts[1].toInt()

    val position = moveDetails.split("-")

    val from = position[0]
    val to = position[1]

    println("Откуда: $from")
    println("Куда: $to")
    println("Номер хода: $moveNumber")
}