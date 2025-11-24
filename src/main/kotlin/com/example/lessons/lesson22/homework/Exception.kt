package com.example.lessons.lesson22.homework

////NullPointerException
//val text: String? = null
//val length = text!!.length
//
////IndexOutOfBoundsException
//val list = listOf(1, 2, 3)
//val value = list[5]
//
////ClassCastException
//val obj: Any = "Hello"
//val number = obj as Int
//
////IllegalArgumentException
//fun sqrtOf(x: Int): Double {
//    require(x >= 0)
//    return kotlin.math.sqrt(x.toDouble())
//}
//
////NumberFormatException
//val num = "123abc".toInt()
//
////IllegalStateException
//val iterator = listOf(1, 2).iterator()
//iterator.next()
//iterator.next()
//iterator.next()
//
////OutOfMemoryError
//val hugeList = MutableList(Int.MAX_VALUE) { 0 }
//
////StackOverflowError
//fun boom(): Int = boom()
//boom()

fun main() {

    // NullPointerException
    try {
        val text: String? = null
        val length = text!!.length
    }
    catch (e: NullPointerException) {
        println("Caught NullPointerException: ${e.message}")
    }

    // IndexOutOfBoundsException
    try {
        val list = listOf(1, 2, 3)
        val value = list[5]
    }
    catch (e: IndexOutOfBoundsException) {
        println("Caught IndexOutOfBoundsException: ${e.message}")
    }

    // ClassCastException
    try {
        val obj: Any = "Hello"
        val number = obj as Int
    }
    catch (e: ClassCastException) {
        println("Caught ClassCastException: ${e.message}")
    }

    // IllegalArgumentException
    try {
        fun sqrtOf(x: Int): Double {
            require(x >= 0)
            return kotlin.math.sqrt(x.toDouble())
        }
        sqrtOf(-10)
    }
    catch (e: IllegalArgumentException) {
        println("Caught IllegalArgumentException: ${e.message}")
    }

    // NumberFormatException
    try {
        val num = "123abc".toInt()
    }
    catch (e: NumberFormatException) {
        println("Caught NumberFormatException: ${e.message}")
    }

    // IllegalStateException
    try {
        val iterator = listOf(1, 2).iterator()
        iterator.next()
        iterator.next()
        iterator.next()
    }
    catch (e: IllegalStateException) {
        println("Caught IllegalStateException: ${e.message}")
    }

    // OutOfMemoryError
    try {
        val huge = ByteArray(Int.MAX_VALUE)
    }
    catch (e: OutOfMemoryError) {
        println("Caught OutOfMemoryError: ${e.message}")
    }

    // StackOverflowError
    try {
        fun boom(): Int = boom()
        boom()
    }
    catch (e: StackOverflowError) {
        println("Caught StackOverflowError: ${e.message}")
    }
}



