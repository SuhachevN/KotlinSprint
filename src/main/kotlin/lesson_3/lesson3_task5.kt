package org.example.lesson_3

fun main() {
    val inputString = "D2-D4;0"

    val moveData = inputString.substringBefore(";")
    val moveNumber = inputString.substringAfter(";")

    val fromSquare = moveData.substringBefore("-")
    val toSquare = moveData.substringAfter("-")

    println("Откуда: $fromSquare")
    println("Куда: $toSquare")
    println("Номер хода: $moveNumber")
}