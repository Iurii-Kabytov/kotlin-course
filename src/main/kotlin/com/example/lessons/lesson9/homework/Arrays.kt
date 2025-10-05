package com.example.lessons.lesson9.homework

fun main() {
    val numbers: Array<Int> = arrayOf(1, 2, 3, 4,5)

    val emptyArray: Array<String?> = Array(size = 10) {null}

    //Создайте массив из 5 элементов типа Double и заполните его значениями,
    //являющимися удвоенным индексом элемента.

    val doubleArray: Array<Double> = arrayOf(2.23, 3.33, 4.44, 5.55, 7.77)
    for (i in doubleArray.indices) {
        doubleArray[i] = doubleArray[i] * doubleArray[i]

    }
    //Создайте массив из 5 элементов типа Int. Используйте цикл,
    //чтобы присвоить каждому элементу значение, равное его индексу, умноженному на 3.

    val a4: Array<Int> = arrayOf(2, 4, 6, 8, 10)
    for (i in a4.indices) {
        a4[i] = i * 3
    }

    //Создайте массив из 3 nullable строк. Инициализируйте его одним null значением и двумя строками.
    val a5: Array<String?> = arrayOf("Hello", null, "Kot")


    //Создайте массив целых чисел и скопируйте его в новый массив в цикле.
    val original = arrayOf(1, 2, 3, 4, 5)

    val copy = Array(original.size) { 0 }

        for (i in original.indices) {
        copy[i] = original[i]
    }

//Создайте массив целых чисел. Найдите индекс элемента со значением 5.
//Если значения 5 нет в массиве, печатаем -1. Реши задачу через цикл while.

    val numbers2 = arrayOf(3, 7, 2, 5, 9)
    var index = 0
    var foundIndex = -1

    while (index < numbers2.size) {
        if (numbers2[index] == 5) {
            foundIndex = index
            break
        }
        index++
    }
    println(foundIndex)


    //Создайте массив целых чисел.
    //Используйте цикл для перебора массива и вывода каждого элемента в консоль.
    //Напротив каждого элемента должно быть написано “чётное” или “нечётное”.

    val numbers3 = arrayOf(1, 4, 7, 10, 13)

    for (i in numbers3.indices) {
        if (numbers3[i] % 2 == 0) {
            println("${i} - even")
        } else {
            println("${i} - odd")
        }
    }

    //Работа со списками List
    //Создайте пустой неизменяемый список целых чисел.

    val list1: List<Int> = listOf()

    //Создайте неизменяемый список строк, содержащий три элемента (например, "Hello", "World", "Kotlin").

    val list2: List<String> = listOf("Hello", "World", "Kotlin")

    //Создайте изменяемый список целых чисел и инициализируйте его значениями от 1 до 5.

    val list3 = mutableListOf<Int>(1, 2, 3, 4, 5)

    //Имея изменяемый список целых чисел, добавьте в него новые элементы (например, 6, 7, 8).

    val list4 = mutableListOf<Int>(1, 2, 3, 4, 5)
    list4.add(6)
    list4.add(7)
    list4.add(8)


    //Имея изменяемый список строк, удалите из него определенный элемент (например, "World").

    val list5 = mutableListOf<String>("Hello", "World", "Kotlin")
    list5.remove("World")


    //Создайте список целых чисел и используйте цикл для вывода каждого элемента на экран.

    val list6: List<Int> = listOf(3, 5, 7)
           for (i in list6.indices) {
        println("${list6[i]}")
    }

    //Создайте список строк и получите из него второй элемент, используя его индекс.

    val list7 = listOf("Hello", "World", "Kotlin")
    val secondEl = list7 [1]
    println(secondEl)

    //Имея изменяемый список чисел,
    //измените значение элемента на определенной позиции
    //(например, замените элемент с индексом 2 на новое значение).

    val list8 = mutableListOf(5, 7, 11, 15)
    list8[2] = 14
    println("$list8")


    //Создайте два списка строк и объедините их в один новый список, содержащий элементы обоих списков. Реши задачу с помощью циклов.
    //Создайте список целых чисел и найдите в нем минимальный и максимальный элементы используя цикл.
    //Имея список целых чисел, создайте новый список, содержащий только четные числа из исходного списка используя цикл.


}


