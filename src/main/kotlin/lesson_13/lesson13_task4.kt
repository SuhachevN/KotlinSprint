package org.example.lesson_13

class ContactInfoNew(
    private val name: String,
    private val phoneNumber: Long,
    private val company: String?) {
    fun displayContact() {
        println("Имя: $name, Номер телефона: $phoneNumber, Компания: ${company ?: "<не указана>"}")
    }
}
fun main() {
    val contacts = mutableListOf<ContactInfoNew>()

    while (true) {
        println("Введите имя контакта (или 'выход' для выхода):")
        val name = readLine() ?: break
        if (name.lowercase() == "выход") break

        println("Введите номер телефона в формате +7..:")
        val phoneInput = readLine() ?: ""
        val phoneNumber = phoneInput.toLongOrNull()

        if (phoneNumber == null) {
            println("Номер телефона не был введён или введён неправильно. Запись не добавлена.")
            continue
        }
        println("Введите название компании (можно оставить пустым):")
        val company = readLine()?.takeIf { it.isNotBlank() }

        contacts.add(ContactInfoNew(name, phoneNumber, company))

        println("Контакт успешно добавлен!")
    }

    println("\nСписок всех контактов:")
    for (contact in contacts) {
        contact.displayContact()
    }
}