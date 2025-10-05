package com.example.lessons.lesson8.homework

fun main() {

    val originalString = "it is not possible to do in one day"
    val replaceString = originalString.replace("not possible",
        "definitely possible, just takes time")
        println(replaceString)


val originalString2 = "I`m not sure in success of this project"
val replaceString2 = when {
    originalString2.startsWith(prefix = "I`m not sure") ->
        "${originalString2} but my intuition says otherwise"

    else -> originalString2
}
    println(replaceString2)


    val originalString3 = "A disaster occurred on server"
    val replaceString3 = when {
        originalString3.contains("A disaster") ->
            originalString3.replace("A disaster", "interesting event")
        else -> originalString3
    }
    println(replaceString3)


    val originalString4 = "this code works without any problems"
    val replaceString4 = when {
        originalString4.endsWith("problems") ->
            originalString4.replace("without any problems",
                "with couple of interesting challenges on the way")

        else -> originalString4
    }
    println(replaceString4)


    val originalString5 = "Luck "
        val replaceString5 = when {
        originalString5.contains(" ") -> {
            originalString5
        }

        else -> {
            "Sometimes $originalString5 but not always"
        }
          //  "${originalString5} but not always"
    }
    println(replaceString5)
}


