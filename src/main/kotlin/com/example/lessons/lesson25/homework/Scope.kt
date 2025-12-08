package com.example.lessons.lesson25.homework

fun timeTracker(action: () -> List<Int>): Long {
    val start = System.currentTimeMillis()
    action()
    val end = System.currentTimeMillis()
    return end - start
}

fun main() {
    val myFunction = {
        val list = List(10_000_000) { (0..10_000).random() }
        list.sorted()
    }

    val time = timeTracker(myFunction)
    println("Time: $time ms")
}
