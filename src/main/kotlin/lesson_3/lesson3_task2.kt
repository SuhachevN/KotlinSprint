package org.example.lesson_3

fun main() {
    val name = "Татьяна"
    var surName = "Андреева"
    val patronymic = "Сергеевна"
    var age = 20

    println("$surName $name $patronymic, $age лет")

    surName = "Сидорова"
    age = 22

    println("$name $surName $patronymic, $age года")
}