package com.example.lessons.lesson19.homework

fun <K, V> transposition(map: Map<K, V>): Map<V, K> {
    return map.entries.associate { (key, value) -> value to key }
}

fun main() {

    val map1 = mapOf(
        1 to "one",
        2 to "two",
        3 to "three"
    )

    val transposed = transposition(map1)
    println(transposed)
}
