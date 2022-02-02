package ru.netology

fun main() {
    val price = 22_000
    val standardDiscount = 100
    val fivePercentDiscount = (price * 0.05).toInt()
    val regularCustomer = true

    val total = if (price <= 1000) price else if (price in 1001..10_000) price - standardDiscount
    else if (price > 10_000) price - fivePercentDiscount else price

    if (regularCustomer) {
        val regularCustomerDiscount = total * 0.01
        val regularCustomerTotal = (total - regularCustomerDiscount).toInt()
        println("Сумма вашего заказа со скидками: $regularCustomerTotal руб.")
    } else {
        println("Сумма вашего заказа со скидками: $total руб.")
    }

}