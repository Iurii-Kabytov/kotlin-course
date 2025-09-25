package com.example.lessons.lesson7.homework

//Прямой диапазон
//Напишите цикл for, который выводит числа от 1 до 5.
fun main() {
    for (i in 1..5) {
        println(i)
    }

//Напишите цикл for, который выводит четные числа от 1 до 10.

    for (i in 1..10) {
        if (i % 2 == 0) {
            println(i)
        }
    }


//Создайте цикл for, который выводит числа от 5 до 1.

    for (i in 5 downTo 1) {
        println(i)
    }


//Создайте цикл for, который выводит числа от 10 до 1, уменьшая их на 2.

    for (i in 10 downTo 1) {
        println(i - 2)
    }


//С шагом (step)
//Используйте цикл for с шагом 2 для вывода чисел от 1 до 9.

    for (i in 1..9 step 2) {
        println(i)
    }

//Напишите цикл for, который выводит каждое третье число в диапазоне от 1 до 20.

    for (i in 1..20) {
        if (i % 3 == 0)
            println(i)
    }

//Использование до (until)
//Создайте числовую переменную 'size'.
//Используйте цикл for с шагом 2 для вывода чисел от 3 до size не включая size.
    val size: Int = 15
    for (i in 3 until size) {
        println(i)
    }

//Цикл while
//Создайте цикл while, который выводит квадраты чисел от 1 до 5.

    var counter = 0
    while (++counter <= 5) {
        println(counter * counter)
    }


//Напишите цикл while,
//который уменьшает число от 10 до 5. После этого вывести результат в консоль

    var counter2 = 10
    while (--counter2 >= 5) {
        println(counter2)
    }


//Цикл do while
//Используйте цикл do while, чтобы вывести числа от 5 до 1.
    var counter3 = 5
    do {
        println(counter3--)
    } while (counter3 >= 1)


//Создайте цикл do while, который повторяется, пока счетчик меньше 10, начиная с 5.

    var counter4 = 5
    do {
        println(counter4)
    } while (++counter4 < 10)


//Использование break
//Напишите цикл for от 1 до 10 и используйте break, чтобы выйти из цикла при достижении 6.

    for (i in 1..10) {
        if (i == 6) break
        println(i)
    }


//Создайте цикл while, который бесконечно выводит числа, начиная с 1,
// но прерывается при достижении 10.

    var counter5 = 0
    while (counter5 <= counter5++) {
        if (counter5 == 10) break
        println(counter5)
    }


//Использование continue
//В цикле for от 1 до 10 используйте continue, чтобы пропустить четные числа.

    for (i in 1..10) {
        if (i % 2 == 0) continue
        println(i)
    }


//Напишите цикл while, который выводит числа от 1 до 10, но пропускает числа, кратные 3.
    var counter6 = 0
    while (counter6++ < 10) {
        if (counter6 % 3 == 0) continue
        println(counter6)
    }
}