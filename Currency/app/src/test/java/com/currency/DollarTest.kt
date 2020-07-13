package com.currency

import com.google.common.truth.Truth.assertThat
import junit.framework.Assert.assertEquals
import org.junit.Test

class DollarTest {

    @Test
    fun dollar_times() {
        val five = Dollar(5)
        var product = five.times(2)
        assertEquals(10, product.amount)
        product = five.times(3)
        assertEquals(15, product.amount)
    }

    @Test
    fun dollar_equality() {
        assertThat(Dollar(5) == Dollar(5)).isTrue()
        assertThat(Dollar(5) == Dollar(6)).isFalse()
    }

}