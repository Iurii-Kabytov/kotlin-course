package com.example.lessons.lesson14.homework

//Мероприятие: концерт. Создайте класс, который будет представлять концерт.
//У него должны быть свойства “группа”, “место проведения”, “стоимость”, “вместимость зала”.
//Также приватное поле “проданные билеты”.
//Добавьте метод, который выводит информацию о концерте и метод “купить билет”,
//который увеличивает количество проданных билетов на один.

class Concert(
    val group: String,
    val location: String,
    val price: Double,
    val capacity: Int) {

    private var soldTickets: Int = 0

    fun showInfo() {
        println(group)
        println(location)
        println(price)
        println(capacity)
        println(soldTickets)

    }

    fun buyTicket() {
        if (soldTickets < capacity) {
            soldTickets++
            println("ticket purchased, sold $soldTickets from $capacity")
        }
        else {
            println("no tickets")
        }
    }
}

fun main() {
    val concert = Concert("U2", "Wien", 10.5, 2)
    concert.showInfo()

    concert.buyTicket()
    concert.buyTicket()
    concert.buyTicket()

    concert.showInfo()
}