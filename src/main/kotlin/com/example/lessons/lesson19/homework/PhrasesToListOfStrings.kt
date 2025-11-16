package com.example.lessons.lesson19.homework

class PhrasesToListOfStrings : Mapper<String, List<String>> {

    override fun map(item: String): List<String> {
        return item.split(" ")
    }

    override fun mapList(items: List<String>): List<List<String>> {
        return items.map { map(it) }
    }
}

fun main() {
    val mapper = PhrasesToListOfStrings()

    val phrase = mapper.map("aaa bbbb ccc")
    println(phrase)
}