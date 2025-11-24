package com.example.lessons.lesson21.homework

fun analyzeDataType(value: Any) {
    when (value) {
        is String -> {
            println("String: $value")
        }

        is Number -> {
            println("Number: $value")
        }

        is List<*> -> {
            println("List: ${value.size}")
        }

        is Map<*, *> -> {
            println("Map: ${value.size}")
        }

        else -> {
            println("Unknown type")
        }
    }
}

fun main() {
    analyzeDataType("Hello")
    analyzeDataType(33)
    analyzeDataType(listOf(1, 2, 3))
    analyzeDataType(mapOf("a" to 1, "b" to 2))
    analyzeDataType(3.14f)
    analyzeDataType(true)
}