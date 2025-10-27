package com.example.lessons.lesson15.homework

//Геометрические Фигуры
//Базовый класс: Геометрическая Фигура
//Производные классы: Многоугольник, Круг
//Дополнительное разветвление для Многоугольник: Треугольник, Четырехугольник

open class GeoFigures(val name: String)

open class Polygon(name: String, val angles: Int): GeoFigures(name) {

    open fun describe() {
        println("this is a polygon - $name with $angles angels")
    }
}

class Circle(val radius: Double): GeoFigures("Circle") {

    fun circleArea(): Double {
        val P = 3.14
        return P * radius * radius

    }
}

class Tringle(
    val sideA: Int,
    val sideB: Int,
    val sideC: Int): Polygon("Tringle", 3)

class Rectangle(
    val sideA: Int,
    val sideB: Int,
    val sideC: Int,
    val sideD: Int): Polygon("Rectangle", 4) {

    fun RectangleArea(): Int {
        return sideA * sideB
    }
}


fun main() {
    val circle1 = Circle(3.2)
    println(circle1.circleArea())

    val Rectangle1 = Rectangle(4,2,4,2)
    println(Rectangle1.RectangleArea())
}

