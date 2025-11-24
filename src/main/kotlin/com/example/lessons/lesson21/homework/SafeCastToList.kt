package com.example.lessons.lesson21.homework

fun safeCastToList(value: Any): Int {
    val list = value as? List<*>
    return list?.size ?: -1
}

fun main() {
    println(safeCastToList(listOf(1, 2, 3)))
    println(safeCastToList("Not a list"))
}