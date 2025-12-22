package com.example.lessons.lesson28.homework

import java.time.Instant
import java.time.LocalDate
import java.time.Period
import java.time.ZoneId

val nowTimestamp = Instant.now()
println("Current time stamp (Instant): $nowTimestamp")

val birthday = LocalDate.of(1976, 3, 30)
println("Date of birth: $birthday")


val today = LocalDate.now(ZoneId.systemDefault())
val period = Period.between(birthday, today)
println("Years from birth: ${period.years}")