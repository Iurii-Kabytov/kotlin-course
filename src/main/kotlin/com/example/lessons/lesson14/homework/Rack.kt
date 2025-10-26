package com.example.lessons.lesson14.homework

import java.awt.List

//Класс Rack (Стеллаж)
//Характеристики:
//Список полок (shelves): хранит полки стеллажа.
//Максимальное количество полок.

class Rack (val maxShelves: Int) {
    private val shelves = mutableListOf<Shelf>()

    fun addShelf(shelf: Shelf): Boolean {
        return when {
            shelves.size >= maxShelves -> {
                false
            }

            shelves.contains(Shelf) -> {
                false
            }

            else -> {
                shelves.add(Shelf)
                return true
            }
        }
    }

    fun removeShelf(index: Int): List<String> {
        return if (index in shelves.indices) {
            val removedShelf = shelves.removeAt(index)
            removedShelf.items
        }
        else {
            emptyList()
        }
    }


}