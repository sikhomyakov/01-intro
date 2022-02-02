package ru.netology

fun main() {
    val price = 22_000
    val standardDiscount = 100
    val fivePercentDiscount = (price * 0.05).toInt()
    val regularCustomer: Boolean = true

    val total = discount(price, standardDiscount, fivePercentDiscount)

    if (regularCustomer) {
        val regularCustomerDiscount = total * 0.01
        val result = (total - regularCustomerDiscount).toInt()
        println("Сумма вашего заказа со скидками: $result руб.")
    } else {
        println("Сумма вашего заказа со скидками: $total руб.")
    }

}

private fun discount(price: Int, standardDiscount: Int, fivePercentDiscount: Int): Int =

    when {
        price <= 1000 -> {
            price
        }
        price in 1001..10_000 -> {
            price - standardDiscount
        }
        price > 10_000 -> {
            price - fivePercentDiscount
        }
        else -> price
    }