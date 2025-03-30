package org.example.lesson_21

fun Map<String, Int>.maxCategory(): String? {
    return this.maxByOrNull { it.value }?.key
}

fun main() {
    val skills = mapOf(
        "Бег" to 15,
        "Сила" to 20,
        "Интеллект" to 18,
        "Мудрость" to 20,
        "Ловкость" to 20,
    )

    val maxSkill = skills.maxCategory()

    if (maxSkill != null) {
        println("Навык с максимальным количеством очков опыта: $maxSkill")
    } else {
        println("Нет навыков.")
    }
}