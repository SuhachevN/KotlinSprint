package org.example.lesson_5

fun main() {
    println("Введите расстояние поездки в км")
    val travelDistance = readln().toFloat()

    println("Введите расход топлива на 100км в литрах")
    val fuelFlow = readln().toDouble()

    println("Цена за литр топлива в рублях")
    val currentPrice = readln().toDouble()

    val fuel = (travelDistance * fuelFlow) / 100

    val fullPrice = fuel * currentPrice

    println("Необходимо топлива: %.2f литров".format(fuel))
    println("Общая стоимость поездки: %.2f рублей".format(fullPrice))
}