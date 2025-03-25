package org.example.lesson_19

enum class Categories{
    CLOTHING,
    STATIONERY,
    MISCELLANEOUS;

    fun getCategoryName() : String {
        return when (this) {
            CLOTHING -> "одежда"
            STATIONERY -> "Канцелярские товары"
            MISCELLANEOUS -> "Разное"
        }
    }
}

class ProductDescription(val name: String, val id: Int, val category: Categories) {
    fun displayInfo() {
        println("Товар: $name (ID: $id) - Категория: ${category.getCategoryName()}")
    }
}

fun main() {
    val products = listOf(
        ProductDescription("Джинсы", 1, Categories.CLOTHING),
        ProductDescription("Ручка", 2, Categories.STATIONERY),
        ProductDescription("Пластилин",3, Categories.MISCELLANEOUS)
    )

        for (product in products) {
            product.displayInfo()
        }
}