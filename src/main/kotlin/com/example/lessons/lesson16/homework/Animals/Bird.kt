package com.example.lessons.lesson16.homework.Animals

class Bird(): Animal() {
    override fun makeSound() {
        println("${GREEN}Tweet${RESET}")
    }
}