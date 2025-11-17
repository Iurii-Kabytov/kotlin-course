package com.example.lessons.lesson20.homework

fun String.encrypt(base: Int): String {
    return map { ch ->
        (ch.code + base).toChar()
    }.joinToString("")
}

fun String.decrypt(base: Int): String {
    return map { ch ->
        (ch.code - base).toChar()
    }.joinToString("")
}

fun main() {
    val original = "hello its me, im so"
    val shift = 3

    val encrypt = original.encrypt(shift)
    val decrypt = encrypt.decrypt(shift)

    println("Original:  $original")
    println("Encrypted: $encrypt")
    println("Decrypted: $decrypt")
}