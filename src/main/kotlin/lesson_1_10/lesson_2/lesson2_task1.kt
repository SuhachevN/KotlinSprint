package org.example.lesson_1_10.lesson_2

fun main() {
    /*
    val numberOfStudents = 4
    val student1Grade = 3.00f
    val student2Grade = 4.00f
    val student3Grade = 3.00f
    val student4Grade = 5.00f
    val averageGrade = ((student1Grade + student2Grade + student3Grade + student4Grade) / numberOfStudents)
    println(averageGrade)
    */

    // второй вариант поаккуратнее, но я погуглил для решения)

    val grades = listOf(3f, 4f, 3f, 5f)

    val averageGrade = grades.average()

    println("%.2f".format(averageGrade))


}