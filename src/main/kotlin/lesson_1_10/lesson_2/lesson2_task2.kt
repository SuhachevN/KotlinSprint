package org.example.lesson_1_10.lesson_2

fun main() {
    val numberOfEmployees = 50
    val employeePaycheck = 30000
    val numberOfInterns = 30
    val internPayCheck = 20000

    val expensesOnSalaries =  numberOfEmployees * employeePaycheck
    val totalExpenses = expensesOnSalaries + numberOfInterns * internPayCheck
    val averagePaycheck = totalExpenses / (numberOfEmployees + numberOfInterns)

    println("$expensesOnSalaries")
    println("$totalExpenses")
    println("$averagePaycheck")
}