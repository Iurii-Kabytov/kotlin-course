package com.example.lessons.lesson14.homework

//Создать систему управления складским пространством с использованием классов
//"Стеллаж" и "Полка стеллажа".
//Характеристики:
//Вместимость полки (capacity): максимальная сумма букв всех названий предметов, которые могут быть размещены на полке.
//Список предметов (items): хранит названия предметов на полке.

class Shelf(val capacity: Int) {
    //максимальная сумма букв всех названий предметов
    private val items = mutableListOf<String>()

    //Добавление Предмета (addItem):
    //Принимает название предмета.
    //Проверяет, поместится ли предмет на полку, учитывая длину его названия и текущее заполнение полки.
    //Возвращает true и добавляет предмет, если есть место. В противном случае возвращает false.

    fun addItem(itemName: String): Boolean {
        if (canAccomodate(itemName)) {
            items.add(itemName)
            return true
        }
        else {
            return false
        }

    }

//Удаление Предмета (removeItem):
//Принимает название предмета.
//Удаляет предмет, если он найден на полке.
//Возвращает true, если предмет был удален, и false, если такой предмет не найден.

    fun removeItem(itemName: String): Boolean {
        if (items.contains(itemName)) {
            items.remove(itemName)
            return true
        } else return false
    }

    fun canAccomodate(itemName: String): Boolean {
        val spaceUsed = items.sumOf { it.length }
        if (itemName + spaceUsed <= capacity) {
            return true
        }
        else {
            return false
        }
    }

    fun containsItem(itemName: String): Boolean {
        return items.contains(itemName)
    }

    fun getItems(): List<String> {
        return items.toList()

    }

}







