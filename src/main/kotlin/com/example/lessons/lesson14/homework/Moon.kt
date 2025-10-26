package com.example.lessons.lesson14.homework

// Природное явление: луна. Создайте объект Moon, который будет представлять Луну.
// Добавьте свойства isVisible (Boolean), чтобы отображать, видна ли Луна в данный момент,
// и phase (String), чтобы отображать текущую фазу Луны (например, "Full Moon", "New Moon").
// Добавьте метод showPhase(), который выводит текущую фазу Луны.

object Moon {
    var isVisible : Boolean = true
    var phase : String = "Full Moon"

    fun showPhase(){
        if (isVisible) {
            println("$phase")
        }
            else {
                println("no Moon")
            }
    }
}

fun main() {
    Moon.showPhase()
}