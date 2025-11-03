package com.example.lessons.lesson16.homework.Animals

class Cat(): Animal() {
    override fun makeSound() {
        println("${YELLOW}Meow${RESET}")
    }
}