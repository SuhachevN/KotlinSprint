package org.example.lesson_20

fun main() {
    val elements = listOf("Элемент 1", "Элемент 2", "Элемент 3", "Элемент 4", "Элемент 5", "Элемент 6", "Элемент 7", "Элемент 8")

    val actions: List<() -> Unit> = elements.map { element ->
        { println("Нажат элемент $element") }
    }

    for (index in actions.indices) {
        if (index % 2 == 1) {
            actions[index]()
        }
    }
}
