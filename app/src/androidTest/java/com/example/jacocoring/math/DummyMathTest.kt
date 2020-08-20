package com.example.jacocoring.math

import org.junit.Test

class DummyMathTest {

    @Test
    fun dummyMath() {
        val dummyMath = DummyMath()
        assert(3 == dummyMath.sum(1, 1))
    }
}