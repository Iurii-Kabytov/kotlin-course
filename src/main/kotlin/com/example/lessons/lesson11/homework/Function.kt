package com.example.lessons.lesson11.homework

fun main() {

    Msg(message = "bcksjb")
    sayHello()
    println(avrg(listOf(1, 3, 5)))
    println(getNulstringInt(null, 0))
}
    fun sayHello() {
        println("hi")
    }


    fun sum(a: Int, b: Int): Int {
        return a + b
    }


    fun Msg(message: String) {
        println("$message")
    }

//Принимает список целых чисел и возвращает среднее значение типа Double.

    fun avrg(numbers: List<Int>): Double {
        var sum = 0
        var count = 0

        for (num in numbers) {
            sum += num
            count++
        }
        return if (count > 0) {
            sum.toDouble() / count
        } else {
            0.0
        }
    }

//Принимает nullable строку и возвращает её длину в виде nullable целого числа
//и доступна только в текущем файле.

     private fun Length(abc: String?): Int? {
            return abc?.length
     }

//Не принимает аргументов и возвращает nullable вещественное число.
     fun nullArg(): Double? {
       return null
     }



//Принимает nullable список целых чисел,
//не возвращает значения и доступна только в текущем файле.
     private fun nullList(numbers: List<Int>?) {
         println(numbers)
     }

//Принимает целое число и возвращает nullable строку.

     fun IntList(arg: Int): String? {
         return arg.toString()
     }

//Не принимает аргументов и возвращает список nullable строк.
     fun returnNulList(): List<String?> {
    return listOf("hdbjs", null, "jhdl")
}

//Принимает nullable строку и nullable целое число и возвращает nullable булево значение.

     fun getNulstringInt(arg1: String?, arg2: Int?): Boolean? {
         return if (arg1 != null && arg2 != null) {
             arg1.length == arg2
         }
         else null
     }

//Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его, умноженное на 2.

     fun multiplyByTwo(arg: Int): Int {
         return arg * 2
     }

//Создайте функцию isEven,
//которая принимает целое число и возвращает true, если число чётное, и false в противном случае.

      fun isEven(arg: Int): Boolean {
          return arg % 2 == 0
      }