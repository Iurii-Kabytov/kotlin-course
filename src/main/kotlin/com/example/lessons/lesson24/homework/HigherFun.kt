package com.example.lessons.lesson24.homework

fun ex1(arg: Boolean, fn1: (String) -> Unit): Int {
    return 0
}

fun Int.ex2(fn2: Int.(String) -> List<String>): List<String> {
    return this.fn2("value = $this")
}

fun <T1, T2> T1.ex3(fn3: T1.() -> T2): T2 {
    return this.fn3()
}

fun ex4(arg: String): () -> String {
    return { arg }
}

fun <T> T.ex5(): (String) -> T {
    return { this }
}


