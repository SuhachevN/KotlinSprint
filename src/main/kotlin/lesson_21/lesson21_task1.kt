package org.example.lesson_21

fun String.vowelExtension(): Int {
    val vowels = "aeiouAEIOUуеыаоэяиюУЕЫАОЭЯИЮ"
    return this.count { it in vowels }
}

fun main() {
    val num1 = "hello"
    val num2 = "Привет"
    val num3 = "Сияет"
    val num4 = "extension"

    println("Количество гласных в '$num1': ${num1.vowelExtension()}")
    println("Количество гласных в '$num2': ${num2.vowelExtension()}")
    println("Количество гласных в '$num3': ${num3.vowelExtension()}")
    println("Количество гласных в '$num4': ${num4.vowelExtension()}")

}