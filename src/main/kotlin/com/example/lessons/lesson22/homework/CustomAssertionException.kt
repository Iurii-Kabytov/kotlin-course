package com.example.lessons.lesson22.homework

class CustomAssertionException(message: String) : AssertionError(message)

fun main() {
    throw CustomAssertionException("My custom AssertionErrorException")
}