package org.example.lesson_22

class RegularBookNew(val name: String, val author: String)

data class DataBookNew(val name: String, val author: String)

fun main() {
    val regularBook = RegularBookNew("Бесы", "Фёдор Достоевский")
    val dataBook = DataBookNew("Звезды смотрят вниз", "Арчибальд Кронин")

    println("Экземпляр обычного класса: $regularBook") // Реализуется метод toString(), который по сути просто выводит инфу о том, как объект устроен в памяти (для понятного вывода нужно переопределять toString()
    println("Экземпляр класса данных: $dataBook") // метод toString() выводит строку, содержащую имена и значения всех свойств объекта в удобочитаемом формате (дата класс автоматически генерирует методы, в т.ч. toString())
}