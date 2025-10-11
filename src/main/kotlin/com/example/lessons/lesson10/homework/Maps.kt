package com.example.lessons.lesson10.homework

import java.security.Key
import kotlin.collections.component1
import kotlin.coroutines.CoroutineContext

fun main() {

    val a1 = mapOf<Int, Int>()

    val a2 = mapOf<Float, Double>(4.44f to 1.1, 3.33f to 2.2, 5.5f to 3.3)

    val a3 = mutableMapOf<Int, String>(1 to "a", 2 to "b")

    a3[3] = "c"
    println(a3)

//Используя словарь из предыдущего задания, извлеките значение, используя ключ.
//Попробуй получить значение с ключом, которого в словаре нет.

    val value1 = a3[2]
    println("$value1")

    val value2 = a3[5]
    println("$value2")

//Удалите определенный элемент из изменяемого словаря по его ключу.

    a3.remove(key = 3)

//Создайте словарь (ключи Double, значения Int) и выведи в цикле результат деления ключа на значение.
// Не забудь обработать деление на 0 (в этом случае выведи слово “бесконечность”)

    val a4 = mapOf<Double, Int>(1.1 to 3, 2.2 to 5, 3.3 to 0)
    for ((key, value) in a4) {
        if (value == 0) {
            println("infinity")
        } else {
            println(key / value)
//            val res = key / value
//            println("$res")
        }

    }

//Измените значение для существующего ключа в изменяемом словаре.

    a3[2] = "y"
    println(a3[2])

//Создайте два словаря и объедините их в третьем изменяемом словаре через циклы.

    val a5 = mapOf(2 to "mam", 3 to "dad")
    val a6 = mutableMapOf(4 to "bbb", 5 to "ccc")
    val a7 = mutableMapOf<Int, String>()
    for ((key, value) in a5) {
        a7[key] = value
    }
    for ((key, value) in a6) {
        a7[key] = value
    }
    println(a7)


    //Создайте словарь, где ключами являются строки, а значениями - списки целых чисел.
    // Добавьте несколько элементов в этот словарь.

    val a8 = mutableMapOf<String, List<Int>>()
    a8["one"] = listOf<Int>(1, 2, 3)
    a8["two"] = listOf<Int>(11, 22, 33)
    for ((key, value) in a8) {
        println(value)
    }

    //Создай словарь, в котором ключи - это целые числа, а значения - изменяемые множества строк.
    //Добавь данные в словарь.
    //Получи значение по ключу (это должно быть множество строк) и добавь в это множество ещё строку.
    // Распечатай полученное множество.

    val a9 = mutableMapOf<Int, MutableSet<String>>()
    a9[2] = mutableSetOf("yks", "kaks")
    a9[4] = mutableSetOf("kolm", "nel")
    val mySet = a9[4]
    mySet?.add("vis")
    println(a9)

    //Создай словарь, где ключами будут пары чисел.
    //Через перебор найди значение
    //у которого пара будет содержать цифру 5 в качестве первого или второго значения.

    val a10 = mapOf(
        Pair(1, 2) to 1,
        Pair(5, 6) to 3,
        Pair(10, 5) to 5
    )
    for ((pair, value) in a10) {
        if (pair.first == 5 || pair.second == 5) {
            println(value)

        }
    }

//Словарь библиотека: Ключи - автор книги, значения - список книг
    val a11 = mutableMapOf<String, MutableList<String>>()
    a11["pushkin"] = mutableListOf("RL", "EvOng")


//Справочник растений: Ключи - типы растений (например, "Цветы", "Деревья"),
// значения - списки названий растений

    val a12 = mutableMapOf<String, MutableList<String>>()
    a12["trees"] = mutableListOf("maple", "oak")

//Четвертьфинала: Ключи - названия спортивных команд, значения - списки игроков каждой команды

    val a13 = mutableMapOf<String, MutableList<String>>()
    a13["Lpl"] = mutableListOf<String>("MS", "JK")

//Курс лечения: Ключи - даты, значения - список препаратов принимаемых в дату


//Словарь путешественника: Ключи - страны, значения - словари из городов со списком интересных мест.

}