package com.example.lessons.lesson26.homework

import java.io.File
fun ex1() {
    File("workspace/task1/example.txt").apply {
        parentFile.mkdirs()
        createNewFile()
        writeText("Hello, Kotlin!")
    }.also {
        println("File is exists: ${it.exists()}")
    }
}

fun ex2() {
    File("workspace/task2/testDir").apply {
        mkdirs()
    }.also {
        println("Directory: ${it.isDirectory}")
        println("Absalut: ${it.absolutePath}")
    }

}

fun ex3() {
    File("workspace/task3/structure")
        .apply { mkdirs() }
        .resolve("myDir")
        .apply {
            mkdirs()
            resolve("subDir1").mkdirs()
            resolve("subDir2").mkdirs()
        }
        .also {
            println("subDir1 exists: ${it.resolve("subDir1").isDirectory}")
            println("subDir2 exists: ${it.resolve("subDir2").isDirectory}")

            println("contents myDir:")
            it.listFiles { file -> file.isDirectory }
                ?.forEach { dir -> println("- ${dir.name}") }
        }
}

fun ex4() {
    File("workspace/task4/temp")
        .apply {
            mkdirs()

            resolve("dir1").mkdirs()
            resolve("dir2").apply {
                mkdirs()
                resolve("nested").mkdirs()
            }

            resolve("file1.txt").writeText("File 1")
            resolve("dir1/file2.txt").writeText("File 2")
            resolve("dir2/nested/file3.txt").writeText("File 3")
        }
        .parentFile
        .also {
            it.deleteRecursively()
            println("Deleted: ${!it.exists()}")
        }
}

fun ex5() {
    File("workspace/task5/config/config.txt")
        .apply {
            parentFile.mkdirs()
            writeText(
                """
                a=1
                b=20
                c=300
                """.trimIndent()
            )
        }
        .readLines()
        .mapNotNull { line ->
            line.substringAfter("=", missingDelimiterValue = "")
                .takeIf { it.isNotEmpty() }
        }
        .forEach { value ->
            println(value)
        }
}
