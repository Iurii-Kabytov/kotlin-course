package com.example.lessons.lesson14.homework

class Emotion(val type: String, val intensity: Int) {
    fun express(){
        val description = when (type) {
            "happy" -> "smiling"
            "sad" -> "sighs"
            "angry" -> "screams"
            else -> "unknown feeling"
        }

        println("$type $intensity/10")
        println("$description${if (intensity > 7) " to much" else " "}")
    }
}

fun main() {
    val e1 = Emotion("happy", 5)
    val e2 = Emotion("sad", 2)
    val e3 = Emotion("angry", 9)

    e1.express()
    e2.express()
    e3.express()
}