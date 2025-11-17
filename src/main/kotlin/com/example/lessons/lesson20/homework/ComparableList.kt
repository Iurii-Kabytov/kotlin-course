package com.example.lessons.lesson20.homework

fun <T : Comparable<T>> MutableList<T>.sort(direction: Boolean): List<T> {
    if (direction) {
        sort()
    }
    else {
        sortDescending()
    }
    return this.toList()

}

fun main() {
    val numbers = mutableListOf(5, 1, 9, 3)

    val dir = numbers.sort(true)
    println(dir)

    val desc = numbers.sort(false)
    println(desc)
}