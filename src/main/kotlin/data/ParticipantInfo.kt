package data

data class ParticipantInfo(
    val country: String,        // Страна (например, "Россия")
    val paymentMethod: String,  // Метод платежа (например, "Банковский перевод", "Кредитная карта")
    val bankCode: String?,      // Код банка (если применимо)
    val accountNumber: String?  // Номер счета (если применимо)
)