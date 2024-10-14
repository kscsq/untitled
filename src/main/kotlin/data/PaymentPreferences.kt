package com.example.data

data class PaymentPreferences(
    val fastestRoute: Boolean,                    // Предпочтение быстрого маршрута
    val lowestFees: Boolean,                      // Предпочтение минимальных комиссий
    val preferredIntermediaries: List<String>?    // Предпочтительные посредники (если есть)
)