package com.example.lessons.lesson19.homework

interface Validator<T> {
    fun validate(item: T): Boolean
}
