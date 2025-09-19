package com.example.lessons.lesson5.homework

fun main() {
 // example 1
        val baseIntensity: Double = 3.0
        val coefficient: Double? = null
        val baseCoefficient = 0.5
        val resultIntensity = baseIntensity * (coefficient ?: baseCoefficient)

// example 2
        val defaultCost: Double = 50.0
        val cost: Double? = null
        val deliveryCost = 5.0
        val insuranceCoefficient = 0.005
        val insuranceCost = insuranceCoefficient * (cost ?: defaultCost)
        val totalCost: Double = deliveryCost + insuranceCost

// example 3
    val pressure: String? = null
    val attentionMessage = "Attention, pressure is lost"
    val pressureForLab = val pressure ?: attentionMessage
}