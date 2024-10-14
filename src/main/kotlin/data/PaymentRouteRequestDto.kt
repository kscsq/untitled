package data

import com.example.data.PaymentPreferences
import java.math.BigDecimal

data class PaymentRouteRequestDto(
    val amount: BigDecimal, // Сумма платежа
    val currency: String,   // Валюта платежа (например, "USD", "EUR")

    val sender: ParticipantInfo,    // Информация об отправителе
    val recipient: ParticipantInfo, // Информация о получателе

    val preferences: PaymentPreferences // Предпочтения клиента
)