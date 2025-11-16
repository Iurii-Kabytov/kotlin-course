package com.example.lessons.lesson19.homework

class ListHolder<T> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getItems(): List<T> {
        return items.toList()
    }


}

fun main() {
    val holder = ListHolder<String>()

    holder.add("a")
    holder.add("b")
    println(holder.getItems())

    val holder2 = ListHolder<Int>()
    holder2.add(7)
    holder2.add(9)
    println(holder2.getItems())
}