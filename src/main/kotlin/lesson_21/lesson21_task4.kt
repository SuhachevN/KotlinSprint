package org.example.lesson_21

import java.io.File

fun File.prependWord(word: String) {
    val lowerCaseWord = word.lowercase()

    val currentContent = this.readText()

    this.writeText("$lowerCaseWord\n$currentContent")
}

fun main() {
    val filePath = "words.txt"
    val file = File(filePath)

    if (!file.exists()) {
        file.createNewFile()
    }

    file.prependWord("HELLO")
    file.prependWord("WORLD")

    println("Содержимое файла:")
    println(file.readText())
}
