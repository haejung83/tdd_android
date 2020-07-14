package com.currency

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class FrancTest {

    @Test
    fun franc_equality() {
        assertThat(Franc(5) == Franc(5)).isTrue()
        assertThat(Franc(6) == Franc(6)).isTrue()
        assertThat(Franc(5) == Franc(6)).isFalse()
    }

    @Test
    fun franc_multiplication() {
        val five = Franc(5)
        assertThat(Franc(10)).isEqualTo(five.times(2));
        assertThat(Franc(15)).isEqualTo(five.times(3));
    }

}