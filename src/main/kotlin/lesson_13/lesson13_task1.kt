package org.example.lesson_13

class PhoneDirectory (
    private val userName: String,
    private val phoneNumber: Long,
    private val company: String?,) {
    fun displayContact() {
        println("Имя: $userName")
        println("Номер телефона: $phoneNumber")
        println("Компания: ${company ?: "Не Указана"}")
    }
}
fun main() {
    val contact1 = PhoneDirectory(userName = "Петр", phoneNumber = 79990523415, company = null)
    val contact2 = PhoneDirectory(userName = "Каркарыч", phoneNumber = 79123456789, company = "Какая-то компания")

    println("Контакт 1:")
    contact1.displayContact()

    println("\nКонтакт 2:")
    contact2.displayContact()
}