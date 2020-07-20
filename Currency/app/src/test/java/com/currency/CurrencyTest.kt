package com.currency

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class CurrencyTest {

    @Test
    fun dollar_equality() {
        assertThat(Dollar(5) == Dollar(5)).isTrue()
        assertThat(Dollar(5) == Dollar(6)).isFalse()
    }

    @Test
    fun dollar_multiplication() {
        val five: Money = Money.dollar(5)
        assertThat(five.times(2)).isEqualTo(Dollar(10))
        assertThat(five.times(3)).isEqualTo(Dollar(15))
    }

    @Test
    fun franc_equality() {
        assertThat(Franc(5) == Franc(5)).isTrue()
        assertThat(Franc(5) == Franc(6)).isFalse()
    }

    @Test
    fun franc_multiplication() {
        val five: Money = Money.franc(5)
        assertThat(five.times(2)).isEqualTo(Franc(10));
        assertThat(five.times(3)).isEqualTo(Franc(15));
    }

    @Test
    fun dollar_franc_equality() {
        assertThat(Money.dollar(5) == Money.dollar(5)).isTrue()
        assertThat(Money.dollar(5) == Money.dollar(6)).isFalse()

        assertThat(Money.franc(5) == Money.franc(5)).isTrue()
        assertThat(Money.franc(5) == Money.franc(6)).isFalse()

        assertThat(Money.franc(5) == Money.dollar(5)).isFalse()
    }

    @Test
    fun dollar_franc_currency() {
        assertThat(Money.dollar(1).currency()).isEqualTo("USD")
        assertThat(Money.franc(1).currency()).isEqualTo("CHF")
    }

    @Test
    fun money_franc_equality() {
        assertThat(Money(10, "CHF")).isEqualTo(Franc(10))
    }

}