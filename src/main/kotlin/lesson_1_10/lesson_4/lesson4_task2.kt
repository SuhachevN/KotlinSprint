package org.example.lesson_1_10.lesson_4

fun main() {
    val cargoNum1Weight = 20
    val cargoNum1Capacity = 80

    val cargoNum2Weight = 50
    val cargoNum2Capacity = 100

    "Груз с весом $cargoNum1Weight кг и объемом $cargoNum1Capacity л " +
            "соответствует категории 'Average': ${cargoNum1Weight > MIN_WEIGHT && cargoNum1Weight <= MAX_WEIGHT && cargoNum1Capacity < MAX_CAPACITY}"

    "Груз с весом $cargoNum2Weight кг и объемом $cargoNum2Capacity л " +
            "соответствует категории 'Average': ${cargoNum2Weight > MIN_WEIGHT && cargoNum2Weight <= MAX_WEIGHT && cargoNum2Capacity < MAX_CAPACITY}"
}
const val MIN_WEIGHT = 35
const val MAX_WEIGHT = 100
const val MAX_CAPACITY = 100
