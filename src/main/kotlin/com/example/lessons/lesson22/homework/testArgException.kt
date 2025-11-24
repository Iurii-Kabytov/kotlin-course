package com.example.lessons.lesson22.homework

fun testArgument(arg: Any?) {

    try {
        arg!!
        arg as List<*>
        arg[10]
        arg as Int
        require (arg[10] is String)
        arg.toString().toInt()


        println("Fantastic arg!")
    }
    catch (t: Throwable) {
        when (t) {
            is NullPointerException      -> println("NullPointerException")
            is IndexOutOfBoundsException -> println("IndexOutOfBoundsException")
            is ClassCastException        -> println("ClassCastException")
            is IllegalArgumentException  -> println("IllegalArgumentException")
            is NumberFormatException     -> println("NumberFormatException")
            is IllegalStateException     -> println("IllegalStateException")
            else                         -> println("Unknown exception")
        }
        throw t

    }
}

fun main() {
    testArgument(null)
    testArgument("hello")
    testArgument(5)
}

