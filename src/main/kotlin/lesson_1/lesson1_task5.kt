package org.example.lesson_1

fun main() {
    val totalSecondsInSpace = 6480
    val totalSecondsInMinute = 60
    val totalSecondsInHour = 3600
    val hours = totalSecondsInSpace / totalSecondsInHour
    val minutes = (totalSecondsInSpace % totalSecondsInHour) / totalSecondsInMinute
    val seconds = totalSecondsInSpace % totalSecondsInMinute


    println("%02d:%02d:%02d".format(hours, minutes, seconds))
}