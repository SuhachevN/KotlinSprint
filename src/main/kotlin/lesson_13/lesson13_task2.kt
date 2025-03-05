package org.example.lesson_13

class ContactInfo(val userName: String,
                  val phoneNumber: Long,
                  val company: String? = null,) {
    fun displayContact() {
        println("Имя: $userName, Номер: $phoneNumber, Компания: ${company ?: "не Указано"}" )
    }
}
fun main() {
    val contactInfo1 = ContactInfo("Сайтама", 89962157007)
    val contactInfo2 = ContactInfo("Spike Spiegel", 89924012357, "Space Cowboy")

    println("Контакт 1:")
    contactInfo1.displayContact()

    println("\nКонтакт 2:")
    contactInfo2.displayContact()
}