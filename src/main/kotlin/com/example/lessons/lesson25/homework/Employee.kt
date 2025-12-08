package com.example.lessons.lesson25.homework

class Employee(val name: String, val age: Int, val position: String) {
    var email: String = ""
    var department: String = "General"
}

fun main() {
    val employee = Employee("Petr", 30, "Developer").apply {
        email = "petr@example.com"
        department = "Engineering"

    }
    println("Name: ${employee.name}," +
            " Age: ${employee.age}," +
            " Position: ${employee.position}," +
            " Email: ${employee.email}," +
            " Department: ${employee.department}")
}