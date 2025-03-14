package org.example.lesson_13

class ContactInfoBook(
    val name: String,
    val phoneNumber: Long,
    val company: String?
)

fun main() {
    val contacts = mutableListOf<ContactInfoBook>()

    while (true) {
        println("Введите имя контакта (или 'выход' для выхода):")
        val name = readLine() ?: break
        if (name.lowercase() == "выход") break

        println("Введите номер телефона:")
        val phoneInput = readLine()

        val phoneNumber: Long
        try {
            phoneNumber = phoneInput!!.toLong()
        } catch (e: NumberFormatException) {
            println("Ошибка: '${e::class.simpleName}'. Введённый номер телефона некорректен. Попробуйте снова.")
            continue
        } catch (e: NullPointerException) {
            println("Ошибка: Введённый номер телефона не должен быть пустым.")
            continue
        }

        println("Введите название компании (можно оставить пустым):")
        val company = readLine()?.takeIf { it.isNotBlank() }

        contacts.add(ContactInfoBook(name, phoneNumber, company))
        println("Контакт успешно добавлен!")
    }

    println("\nСписок всех контактов:")
    for (contact in contacts) {
        println("Имя: ${contact.name}, Номер телефона: ${contact.phoneNumber}, Компания: ${contact.company ?: "<не указана>"}")
    }
}