package com.example.lessons.lesson16.homework.Animals

open class Animal() {
    open fun makeSound(){
        println("This animal makes no sound")

    }
}
const val RED = "\u001B[31m"
const val GREEN = "\u001B[32m"
const val YELLOW = "\u001B[33m"
const val RESET = "\u001B[0m"

fun main() {
    val a : Animal = Animal()
    val b : Animal = Dog()
    val c : Animal = Cat()
    val d : Animal = Bird()

//    a.makeSound()
//    b.makeSound()
//    c.makeSound()
//    d.makeSound()

    val animalList : List<Animal> = listOf(
        Animal(), Dog(), Cat(), Bird()
    )
    for (a in animalList) {
        a.makeSound()
    }
}