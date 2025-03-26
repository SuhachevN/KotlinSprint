package org.example.lesson_19


enum class Gender {
    MALE,
    FEMALE;
}

class Person(val name: String, val gender: Gender)

fun main() {
    val people = mutableListOf<Person>()

    println("Введите информацию о 5 людях в формате: Имя Пол")
    println("Например: 'Иван М' или 'Анна Ж'")
    println("Доступные значения для пола: М, Ж")

    for (i in 1..5) {
        val input = readLine() ?: ""
        val parts = input.split(" ")

        if (parts.size == 2) {
            val name = parts[0]
            val gender = when (parts[1].uppercase()) {
                "М" -> Gender.MALE
                "Ж" -> Gender.FEMALE
                else -> {
                    println("Ошибка: неверное значение пола. Пожалуйста, используйте М или Ж.")
                    continue
                }
            }
            people.add(Person(name, gender))
        } else {
            println("Ошибка: неверный формат ввода. Используйте: Имя Пол")
        }
    }

    println("\nСписок людей в картотеке:")
    for (person in people) {
        println("${person.name} - ${person.gender}")
    }
}
