package com.currency

abstract class Money(
    protected val amount: Int,
    protected val currency: String
) {

    override fun equals(other: Any?): Boolean {
        val money = other as Money
        return amount == money.amount && javaClass == money.javaClass
    }

    abstract fun times(multiplier: Int): Money

    fun currency(): String = currency

    companion object {
        fun dollar(amount: Int): Money = Dollar(amount, "USD")
        fun franc(amount: Int): Money = Franc(amount, "CHF")
    }

}