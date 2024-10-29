package org.example.lesson_2
fun main () {
    val totalCrystalOre = 7
    val totalIronOre = 11
    val totalPercent = 100
    val buffPercent = 20

    val bonusCrystals = (totalCrystalOre * buffPercent) / totalPercent
    val bonusIrons = (totalIronOre * buffPercent) / totalPercent

    println(bonusCrystals)
    println(bonusIrons)
}