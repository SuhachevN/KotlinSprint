package org.example.lesson_13

class ContactInformation(val userName: String,
                  val phoneNumber: Long,
                  val company: String?,)

fun main() {
    val contacts = listOf(
        ContactInformation("Петр", 89924012354, "Первая"),
        ContactInformation("Евгений", 89924012351, null),
        ContactInformation("Сергей", 89924012359, "null"),
        ContactInformation("Ксения", 89924012352, null),
        ContactInformation("Семен", 89924012353, "Вторая")
    )
    val companies = contacts.mapNotNull { it.company }

    println("Список компаний в телефонной книге:")
    for (company in companies) {
        println(company)
    }
}
