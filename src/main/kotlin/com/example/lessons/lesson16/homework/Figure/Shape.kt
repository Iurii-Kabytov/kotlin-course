package com.example.lessons.lesson16.homework.Figure

abstract class Shape() {
    open fun area(): Double {
        return 0.0

    }
}

fun main() {
    val shapes: List<Shape> = listOf(
        Circle(5.3),
        Square(4.0),
        Triangle(3.0, 8.0)
    )
    for (shape in shapes) {
        println("Area = ${shape.area()}")
    }
}