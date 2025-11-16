package com.example.lessons.lesson19.homework

fun <T> getMiddleElement(list: List<T>): T? {
        if (list.size % 2 == 0) return null
    val middleIndex = list.size / 2
    return list[middleIndex]
}

fun main() {
    val a = listOf(1, 2, 3, 4)
    println(getMiddleElement(a))

    val b = listOf("a", "b", "c")
    println(getMiddleElement(b))
}