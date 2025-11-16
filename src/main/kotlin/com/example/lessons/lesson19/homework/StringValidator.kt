package com.example.lessons.lesson19.homework

class StringValidator : Validator<String?> {
    override fun validate(item: String?): Boolean {
        return item != null && item.isNotBlank()
    }
}

fun main() {
    val validator = StringValidator()

    println(validator.validate("hello"))
    println(validator.validate(" "))
    println(validator.validate(null))
}