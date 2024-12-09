package org.example.lesson_5

fun main() {
    println("Угадайте 2 числа в диапазоне от 0 до 42 и выиграйте приз!")

    println("Введите первое число")
    val userNumber1 = readln().toInt()

    println("Введите второе число")
    val userNumber2 = readln().toInt()

    if ((userNumber1 == WIN_NUMBER1  && userNumber2 == WIN_NUMBER2) ||
        (userNumber1 == WIN_NUMBER2 && userNumber2 == WIN_NUMBER1)) {
        println("Поздравляю, вы выиграли главный приз!")
    } else if ((userNumber1 == WIN_NUMBER1 || userNumber1 == WIN_NUMBER2) ||
        (userNumber2 == WIN_NUMBER1 || userNumber2 == WIN_NUMBER2)) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
    }


}
const val WIN_NUMBER1 = 24
const val WIN_NUMBER2 = 13