package com.currency

abstract class Money(protected val amount: Int) {

    override fun equals(other: Any?): Boolean {
        val money = other as Money
        return amount == money.amount && javaClass == money.javaClass
    }

    abstract fun times(multiplier: Int): Money

    companion object {
        fun dollar(amount: Int): Money = Dollar(amount)
        fun franc(amount: Int): Money = Franc(amount)
    }

}