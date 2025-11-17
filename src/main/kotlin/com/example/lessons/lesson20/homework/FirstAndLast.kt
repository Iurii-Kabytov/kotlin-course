package com.example.lessons.lesson20.homework

fun Array<Int>.firstAndLast(): Pair<Int?, Int?> {
    return if (this.isEmpty()) {
        Pair(null, null)
    } else {
        Pair(this.first(), this.last())
    }
}

fun main() {
    val arr1 = arrayOf(1, 2, 3, 4)
    val arr2 = emptyArray<Int>()

    println(arr1.firstAndLast())
    println(arr2.firstAndLast())
}