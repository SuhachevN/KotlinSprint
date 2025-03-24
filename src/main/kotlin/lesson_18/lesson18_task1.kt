package org.example.lesson_18

class Order(private val orderNumber: Int) {
    private val products: MutableList<String> = mutableListOf()

    fun addProduct(product: String) {
        products.add(product)
    }

    fun addProduct(productList: List<String>) {
        products.addAll(productList)
    }

    fun displayOrderInfo() {
        when (products.size) {
            0 -> println("В заказе нет товаров.")
            1 -> println("Заказан товар: ${products[0]}")
            else -> println("Заказаны следующие товары: ${products.joinToString(", ")}")
        }
    }
}

fun main() {
    val order1 = Order(1)
    order1.addProduct("мыло")
    order1.displayOrderInfo()

    val order2 = Order(2)
    order2.addProduct("зубная паста")
    order2.displayOrderInfo()

    val order3 = Order(3)
    order3.addProduct(listOf("Мыло", "Шампунь", "Гель для душа"))
    order3.displayOrderInfo()
}
