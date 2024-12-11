package org.example.lesson_5

fun main() {
    println("Введите ваш вес в килограммах")
    val userWeight = readln().toDouble()

    println("Введите ваш рост в сантиметрах")
    val userGrowthCm = readln().toFloat()

    val userGrowthM = userGrowthCm / CENTIMETERS_IN_METERS

    val bmi = userWeight / (userGrowthM * userGrowthM)

    val category = when {
        bmi < 18.5 -> "Недостаточная масса тела"
        bmi in 18.5..24.9 -> "Нормальная масса тела"
        bmi in 25.0..29.9 -> "Избыточная масса тела"
        bmi in 30.0..34.9 -> "ожирение I-й степени"
        bmi in 35.0..39.9 -> "ожирение II-й степени"
        bmi >= 40 -> "ожирение III-й степени, суперожирение"

        else -> "неизвестная степень"
    }

    println("Ваш ИМТ: %.2f".format(bmi))
    println("Категория: $category")
}
const val CENTIMETERS_IN_METERS = 100