package com.example.lessons.lesson15.homework

open class Education(val name: String, val city: String) {
    open fun info() {
        println("Educational institution $name, city $city")
    }

    open class School(name: String, city: String, val schoolNo: Int) : Education(name, city) {
        open fun schoolInfo() {
            println("$name School nom.$schoolNo in $city")
        }
    }

    open class University(
        name: String,
        city: String,
        val faculties: Int): Education(name, city) {

    }

    class TechnicalUniversity(
        name: String,
        city: String,
        faculties: Int,
        val labs: Int): University(name, city, faculties) {

        fun Labs() {
            println(" $name Technical University, $city has $labs laboratories ")
        }

    }

    class MedicalUniversity(
        name: String,
        city: String,
        faculties: Int,
        val hospitals: Int): University(name, city, faculties) {

    }


}

fun main() {
val TechnicalUniversity1 = Education.TechnicalUniversity(
    "STU", "Bratislava", 7, 10)
    println(TechnicalUniversity1.Labs())
}