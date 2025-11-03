package com.example.lessons.lesson16.homework.Figure

class Triangle(val height: Double, val base: Double): Shape() {
    override fun area(): Double = 0.5 * height * base
}