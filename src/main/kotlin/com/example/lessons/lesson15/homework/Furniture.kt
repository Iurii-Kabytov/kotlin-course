package com.example.lessons.lesson15.homework

open class Furniture(val name: String, val material: String) {
    open fun description() {
        println("Furniture: $name, Material: $material")

    }

    open class Tables(
        name: String,
        material: String,
        val legs: Int): Furniture(name, material) {
        open fun tableDescription(){
            println("Table $name, material: $material, legs quantity $legs")
        }
    }

    open class Chairs(
        name: String,
        material: String,
        val backrest: Boolean): Furniture(name, material) {

    }

    class officeTables(
        name: String,
        material: String,
        legs: Int,
        val boxes: Int): Tables(name, material, legs) {

        fun officeTableDescription() {
            println("Office table $name, material: $material, has $legs legs, and $boxes boxes")
        }
    }

}

fun main() {
    val officeTable1 = Furniture.officeTables("Studio", "oak", 4, 2)
    println(officeTable1.officeTableDescription())
}