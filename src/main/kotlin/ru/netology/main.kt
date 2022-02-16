package ru.netology

import kotlin.math.roundToInt

fun main() {
    val amount = 10001
    val price = 100
    val regularCustomer = true

    val totalStandardDiscount = (if (amount > 10_000) price * 0.95
    else if (amount >= 1001 && price <= 10_000) price - 100 else price).toDouble()
    val total = if (regularCustomer) totalStandardDiscount * 0.99 else totalStandardDiscount
    println("Сумма вашего заказа со скидками: ${total.toInt()} руб. ${(total * 100).roundToInt() % 100} коп.")
}