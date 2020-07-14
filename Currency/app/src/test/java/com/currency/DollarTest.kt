package com.currency

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class DollarTest {

    @Test
    fun franc_equality() {
        assertThat(Dollar(5) == Dollar(5)).isTrue()
        assertThat(Dollar(6) == Dollar(6)).isTrue()
        assertThat(Dollar(5) == Dollar(6)).isFalse()
    }

    @Test
    fun dollar_times() {
        val five = Dollar(5)
        assertThat(five.times(2)).isEqualTo(Dollar(10))
        assertThat(five.times(3)).isEqualTo(Dollar(15))
    }

    @Test
    fun dollar_equality() {
        assertThat(Dollar(5) == Dollar(5)).isTrue()
        assertThat(Dollar(5) == Dollar(6)).isFalse()
    }

}