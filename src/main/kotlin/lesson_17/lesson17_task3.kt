package org.example.lesson_17

class Folder(
    private val name: String,
    private var fileCount: Int,
    private var isSecret: Boolean,
    ) {
    val folderName: String
        get() = if (isSecret) {
            "скрытая папка"
        } else {
            name
        }

    val getFileCount: Int
        get() = if (isSecret) {
            0
        } else {
            fileCount
        }
}

fun main() {
    val secretFolder = Folder("Секретная папка", 5, true)
    val defaultFolder = Folder("папка", 10, false)

    println("Имя папки: ${secretFolder.folderName}")
    println("Количество файлов: ${secretFolder.getFileCount}")
    println()
    println("Имя папки: ${defaultFolder.folderName}")
    println("Количество файлов: ${defaultFolder.getFileCount}")
}
