package org.example.lesson_1_10.lesson_2
fun main () {
    val timeOfDeparture = "09:39"
    val travelTime = 457

    val timeOfDepartureHours = 9
    val timeOfDepartureMinutes = 39

    val minutesInHours = 60

    val totalTravelTime = timeOfDepartureHours * minutesInHours + timeOfDepartureMinutes + travelTime

    val arrivalHours = totalTravelTime / minutesInHours
    val arrivalMinutes = totalTravelTime % minutesInHours

    println("$arrivalHours:$arrivalMinutes")
}
