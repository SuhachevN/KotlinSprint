package org.example.lesson_22

class RegularBook(val name: String, val author: String)

data class DataBook(val name: String, val author: String)

fun main() {

    val book1 = RegularBook("Книга1", "Автор1")
    val book2 = RegularBook("Книга1", "Автор1")

    val dataBook1 = DataBook("Книга2", "Автор2")
    val dataBook2 = DataBook("Книга2", "Автор2")

    println("Сравнение обычных книг:")
    println("regularBook1 == regularBook2: ${book1 == book2}")

    println("Сравнение книг данных:")
    println("dataBook1 == dataBook2: ${dataBook1 == dataBook2}")
}