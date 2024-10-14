package com.example.data

import java.math.BigDecimal
import kotlin.time.Duration

data class RouteStep(
    val fromEntity: String,           // Отправитель на данном шаге (например, "Банк А")
    val toEntity: String,             // Получатель на данном шаге (например, "Банк B")
    val paymentMethod: String,        // Метод платежа на данном шаге (например, "SWIFT")
    val fees: BigDecimal,             // Комиссия на данном шаге
    val estimatedTime: Duration       // Ориентировочное время прохождения данного шага
)