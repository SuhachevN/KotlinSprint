package org.example.lesson_5

fun main() {
    println("Введите ваш вес в килограммах")
    val userWeight = readln().toDouble()

    println("Введите ваш рост в сантиметрах")
    val userGrowthCm = readln().toFloat()

    val userGrowthM = userGrowthCm / 100

    val IMT = userWeight / (userGrowthM * userGrowthM)

    val category = when {
        IMT < 18.5 -> "Недостаточная масса тела"
        IMT in 18.5..24.9 -> "Нормальная масса тела"
        IMT in 25.0..29.9 -> "Избыточная масса тела"
        else -> "Ожирение"
    }

    println("Ваш ИМТ: %.2f".format(IMT))
    println("Категория: $category")
}