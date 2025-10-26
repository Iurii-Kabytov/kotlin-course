package com.example.lessons.lesson14.homework

//Покупка: продукт. Создайте дата класс для продукта,
// который будет представлять продукт в магазине.
// У него должны быть свойства “название”, “цена”, “количество”.

data class Product(val name: String, val price: Double, val quantity: Int)

fun main() {
    val product = Product("apple", 2.35, 40)
    println(product)
}
