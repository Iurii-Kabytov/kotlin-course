package com.example.lessons.lesson25.homework

class Person(val name: String, val age: Int) {
    var email: String = ""
}

fun logPerson(person: Person) {
    with(person) {
        println(
            """
            Name: $name
            Age: $age
            Email: $email 
        """.trimIndent()
        )
    }
}

//val person = Person("Anna", 25).also {
//    it.email = "anna@example.com"
//    logPerson(it)
//}

fun main() {
//    println("Name: ${person.name}," +
//            " Age: ${person.age}," +
////            " Email: ${person.email},")
//    }

    val person = Person("Ivan", 40).apply {
        email = "ivan@example.com"
    }

    val employee = with(person) {
        Employee(name, age, position = "Manager").apply {
            email = this@with.email
        }
    }
}
