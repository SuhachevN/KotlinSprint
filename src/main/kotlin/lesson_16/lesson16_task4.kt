package org.example.lesson_16

class Order(private val orderNumber: String) {
    private var status: String = "Новый"

    fun getStatus(): String {
        return status
    }

    private fun changeStatus(newStatus: String) {
        status = newStatus
    }

    fun submitStatusChangeRequest(newStatus: String) {
        println("Заявка отправлена менеджеру на изменение статуса заказа $orderNumber на '$newStatus'.")
        changeStatus(newStatus)
        println("Статус заказа $orderNumber изменён на '$status'.")
    }
}

fun main() {
    val order = Order("1")

    println("Текущий статус заказа: ${order.getStatus()}")

    order.submitStatusChangeRequest("В обработке")
    println("Обновлённый статус заказа: ${order.getStatus()}")

    order.submitStatusChangeRequest("Доставка")
    println("Обновлённый статус заказа: ${order.getStatus()}")
}
