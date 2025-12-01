package com.example.lessons.lesson23.homework

fun averageEven(numbers: List<Int>): Double {
    require(numbers.isNotEmpty())
    val evens = numbers.filter { it % 2 == 0 }
    return if (evens.isNotEmpty()) evens.average()
    else 0.0
    }

val averageEven1 = fun(numbers: List<Int>): Double {
    require(numbers.isNotEmpty())
    val evens = numbers.filter { it % 2 == 0 }
    return if (evens.isNotEmpty()) evens.average()
    else 0.0
}

val averageEven2: (List<Int>) -> Double = { numbers ->
    require(numbers.isNotEmpty())
    val evens = numbers.filter { it % 2 == 0 }
    if (evens.isNotEmpty()) evens.average()
    else 0.0
}

val averageEven3 = { numbers: List<Int> ->
    require(numbers.isNotEmpty())
    val evens = numbers.filter { it % 2 == 0 }
    if (evens.isNotEmpty()) evens.average()
    else 0.0
}

fun main() {
    val list1 = listOf(1, 2, 3, 4, 5, 6)
    val list2 = listOf(7, 9, 11)
    val list3 = emptyList<Int>()


    println(averageEven(list1))
    println(averageEven(list2))

    println(averageEven1(list1))
    println(averageEven2(list2))
    println(averageEven3(list1))

    try {
        println(averageEven(list3))
    } catch (e: IllegalArgumentException) {
        println("Empty list: ${e.message}")
    }

}
