package com.currency

class Dollar(var amount: Int) {

    fun times(multiplier: Int): Dollar {
        return Dollar(amount * multiplier)
    }

    override fun equals(other: Any?): Boolean {
        val dollar = other as Dollar
        return amount == dollar.amount
    }
   
}