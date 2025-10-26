package com.example.lessons.lesson14.homework

class Party(
    val location: String,
    val attendees: Int) {

    fun details() {
          println ("$location")
          println("$attendees")

    }
}

fun main() {
    val BirthdayParty = Party("center", 20)
    BirthdayParty.details()
}