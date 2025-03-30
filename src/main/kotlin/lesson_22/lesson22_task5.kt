package org.example.lesson_22

import java.time.LocalDateTime

data class GalacticGuide(
    val name: String,
    val description: String,
    val eventDateTime: LocalDateTime,
    val distanceFromEarth: Double,
)

fun main() {
    val alphaCentauri = GalacticGuide(
        name = "Alpha Centauri",
        description = "Система из трех звезд, ближайшая к Земле звезда.",
        eventDateTime = LocalDateTime.of(2023, 12, 1, 14, 30),
        distanceFromEarth = DISTANCE_TO_ALPHA_CENTAURI,
    )

    val name = alphaCentauri.component1()
    val description = alphaCentauri.component2()
    val eventDateTime = alphaCentauri.component3()
    val distanceFromEarth = alphaCentauri.component4()

    println("Название: $name")
    println("Описание: $description")
    println("Дата и время события: $eventDateTime")
    println("Расстояние от Земли: $distanceFromEarth световых годов")
}

const val DISTANCE_TO_ALPHA_CENTAURI = 4.37