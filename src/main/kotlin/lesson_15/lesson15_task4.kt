package org.example.lesson_15

interface Searchable {
    fun searchComponents()
}

open class Product(
    val name: String,
    var quantity: Int
)

class Component(name: String, quantity: Int) : Product(name, quantity)

class Instrument(name: String, quantity: Int) : Product(name, quantity), Searchable {
    private val components: MutableList<Component> = mutableListOf()

    fun addComponent(component: Component) {
        components.add(component)
    }

    override fun searchComponents() {
        println("Выполняется поиск комплектующих для инструмента: $name...")
        if (components.isNotEmpty()) {
            println("Найденные комплектующие для $name:")
            for (component in components) {
                println("- ${component.name} (в наличии: ${component.quantity})")
            }
        } else {
            println("Комплектующие для $name не найдены.")
        }
    }
}

fun main() {
    val violin = Instrument("Скрипка", 5)
    val guitar = Instrument("Гитара", 2)

    val strings = Component("Струны",20)
    val frets = Component("Лады", 8)
    val bow = Component("Смычок", 4)

    violin.addComponent(strings)
    violin.addComponent(bow)
    guitar.addComponent(strings)
    guitar.addComponent(frets)

    violin.searchComponents()
    guitar.searchComponents()

}