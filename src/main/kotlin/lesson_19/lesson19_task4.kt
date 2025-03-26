package org.example.lesson_19

enum class Ammo(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20);
}

class Tank {
    private var currentAmmo: Ammo? = null

    fun equip(ammo: Ammo) {
        currentAmmo = ammo
        println("Танк вооружен патронами типа: ${ammo.name}")
    }

    fun shoot() {
        if (currentAmmo != null) {
            println("Выстрел! Нанесен урон: ${currentAmmo!!.damage}")
        } else {
            println("Танк не заряжен! Нельзя произвести выстрел.")
        }
    }
}

fun main() {
    val tank = Tank()

    tank.shoot()

    tank.equip(Ammo.BLUE)
    tank.shoot()

    tank.equip(Ammo.GREEN)
    tank.shoot()

    tank.equip(Ammo.RED)
    tank.shoot()
}
