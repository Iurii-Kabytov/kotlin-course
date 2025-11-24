package com.example.lessons.lesson21.homework

fun getStringLengthOrZero(value: Any?): Int {
    return (value as? String)?.length ?: 0
}


fun main() {
    println(getStringLengthOrZero("Hello"))
    println(getStringLengthOrZero(123))
    println(getStringLengthOrZero(null))
}