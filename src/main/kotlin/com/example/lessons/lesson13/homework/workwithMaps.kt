package com.example.lessons.lesson13.homework

fun main() {
    //Дан словарь с именем и временем выполнения каждого автоматизированного теста в секундах.
    //Определите среднее время выполнения теста.
    val testTimes = mapOf("Test1" to 12, "Test2" to 8, "Test3" to 10)
    println(testTimes.values.average())


    //Имеется словарь с метаданными автоматизированных тестов,
    //где ключи — это имена тестовых методов а значения - строка с метаданными.
    //Выведите список всех тестовых методов.
    val autoTests = mapOf("A" to "One", "B" to "Two", "C" to "Three")
    println(autoTests.keys)

    //В изменяемый словарь с данными о прохождении тестов добавьте новый тест и его результат.
    val testResults = mutableMapOf("TestA" to "passed", "TestB" to "failed")
    testResults.put("TestC", "skipped")

    //Посчитайте количество успешных тестов в словаре с результатами
    //(ключ - название, значение - результат из passed, failed, skipped).
    val passedCount = testResults.count { it.value == "passed" }

    //Удалите из изменяемого словаря с баг-трекингом запись о баге,
    //который был исправлен (ключ - название, значение - статус исправления).
    val bugs = mutableMapOf("Bug1" to "fixed", "Bug2" to "in process")
    bugs.remove(key = "Bug1")

    //Для словаря с результатами тестирования веб-страниц
    //(ключ — URL страницы, значение — статус ответа),
    // выведите сообщение о странице и статусе её проверки.
    val pages = mapOf("url1" to 200, "url2" to 404)
    pages.forEach { (url, status) -> println("page $url - status $status") }


    //Найдите в словаре с названием и временем ответа сервисов только те,
    //время ответа которых превышает заданный порог.
    val services = mapOf("A" to 1.5, "B" to 3.2, "C" to 0.9)
    services.filterValues { it > 1.5 }


    //В словаре хранятся результаты тестирования API
    // (ключ — endpoint, значение — статус ответа в виде строки).
    // Для указанного endpoint найдите статус ответа,
    // если endpoint отсутствует, предположите, что он не был протестирован.
    val apiResults = mapOf("log1" to "200", "log2" to "404")
    apiResults.getOrDefault("log3", "not tested")

    //Из словаря, содержащего конфигурации тестового окружения
    //(ключ — название параметра конфигурации, значение - сама конфигурация),
    //получите значение для "browserType". Ответ не может быть null.
    val configTest = mapOf("browserType" to "FF", "envTest" to "Ch")
    configTest.getValue("browserType")


    //Создайте копию неизменяемого словаря с данными о версиях тестируемого ПО, добавив новую версию.
    val version1 = mapOf("1.0" to "A", "1.1" to "B")
    val newVersion = version1 + ("1.2" to "C")


    //Используя словарь с настройками тестирования для различных мобильных устройств
    //(ключ — модель устройства, значение - строка с настройками),
    //получите настройки для конкретной модели или верните настройки по умолчанию.
    val Settings = mapOf("Mi" to "Android", "iPhone" to "iOS")
    Settings.getOrElse("Galaxy") { "Default settings" }


    //Проверьте, содержит ли словарь с ошибками тестирования
    //(ключ - код ошибки, значение - описание ошибки) определенный код ошибки.
    val errorTest = mapOf(404 to "Not Found", 200 to "Server")
    errorTest.containsKey(404)

    //Дан неизменяемый словарь, где ключи — это идентификаторы тестовых сценариев в формате "TestID_Version",
    //а значения — статусы выполнения этих тестов ("Passed", "Failed", "Skipped").
    //Отфильтруйте словарь, оставив только те сценарии,
    //идентификаторы которых соответствуют определённой версии тестов, то-есть в ключе содержится требуемая версия.
    val scenTest = mapOf("Test1_v1" to "Passed", "Test2_v2" to "Failed", "Test3_v1" to "Skipped")
    val version = "v1"
    scenTest.filterKeys { it.contains(version) }

    //У вас есть словарь, где ключи — это названия функциональных модулей приложения,
    //а значения — результаты их тестирования. Проверьте, есть ли модули с неудачным тестированием.


    //Добавьте в изменяемый словарь с настройками тестовой среды настройки из другого словаря.
    val env1 = mutableMapOf("OS" to "iphone", "Browser" to "Chrome")
    val env2 = mapOf("UE" to "Unity")
    env1.putAll(env2)

    //Объедините два неизменяемых словаря с данными о багах.
    val bugs1 = mapOf("BUG1" to "in process")
    val bugs2 = mapOf("BUG2" to "fixed")
    val bugs3 = bugs1 + bugs2

    //Очистите изменяемый словарь с временными данными о последнем прогоне автоматизированных тестов.
    val timeData = mutableMapOf("Run" to "123", "Status" to "Done")
    timeData.clear()


}