package com.example.lessons.lesson19.homework

interface Mapper<From, To> {

    fun map(item: From): To

    fun mapList(items: List<From>): List<To> {
        return items.map { map(it) }
    }
}