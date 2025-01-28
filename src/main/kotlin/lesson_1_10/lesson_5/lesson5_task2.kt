package org.example.lesson_1_10.lesson_5

fun main() {
    println("Введите ваш год рождения")

    val userYearOfBirth = readln().toInt()
    val userAge = CURRENT_YEAR - userYearOfBirth

    val accessCheck = if(userAge >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    } else {
        println("Back to main screen")
    }

    println(accessCheck)

}
const val AGE_OF_MAJORITY = 18
const val CURRENT_YEAR = 2_024