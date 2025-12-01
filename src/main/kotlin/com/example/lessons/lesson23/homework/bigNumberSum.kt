package com.example.lessons.lesson23.homework

fun numberSum(number: Long): Int {
    require(number > 0)
    return number.toString().sumOf { it.digitToInt() }
}

val numberSum1 = fun(number: Long): Int {
    require(number > 0)
    return number.toString().sumOf { it.digitToInt() }
}

val numberSum2: (Long) -> Int = { number ->
    require(number > 0)
    number.toString().sumOf { it.digitToInt() }
}

val numberSum3 = { number: Long ->
    require(number > 0)
    number.toString().sumOf { it.digitToInt() }
}

fun main() {
    val numbers = listOf(
        5L,
        123L,
        999999L,
        1002003L
    )
    val number = 12345L

    numbers.forEach { println("$it → ${numberSum(it)}") }
    numbers.forEach { println("$it → ${numberSum3(it)}") }

    println("$number → ${numberSum2(number)}")

}