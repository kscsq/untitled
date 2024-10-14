package com.example.data

import java.math.BigDecimal
import kotlin.time.Duration

data class PaymentRouteResponseDto(
    val routeSteps: List<RouteStep>,      // Список шагов маршрута

    val totalFees: BigDecimal,            // Общая сумма комиссий
    val estimatedTotalTime: Duration,     // Ориентировочное общее время выполнения платежа

    val currency: String,                 // Валюта платежа
    val totalAmount: BigDecimal           // Итоговая сумма (Amount + TotalFees)
)
