package com.example.lessons.lesson16.homework.CartOfGoods

class Cart {
    private val items = mutableMapOf<Int,Int>()
    fun addToCart(itemID: Int) {
        items[itemID] = items.getOrDefault(itemID, 0) + 1

    }

    fun addToCart(itemId: Int, amount: Int) {
        items[itemId] = items.getOrDefault(itemId, 0) + amount
    }

   //Принимает словарь из id и количества и добавляет всё в корзину

    fun addToCart(map: Map<Int, Int>) {
        map.forEach { addToCart(it.key, it.value) }

//        for ((id, amount) in map) {
//            items[id] = items.getOrDefault(id, 0) + amount
//        }
    }

    //Принимает список из id (добавляет по одной единице).

    fun addToCart(list: List<Int>) {
        list.forEach { addToCart(it) }

//        for (id in list) {
//            items[id] = items.getOrDefault(id, 0) + 1
//        }
    }

    override fun toString(): String {
        val countIDitems = items.size
        val countAmount = items.values.sum()
        val List: String = items.map { "ID ${it.key} Q-ty ${it.value}" }
            .joinToString("\n")
        return List


    }


}