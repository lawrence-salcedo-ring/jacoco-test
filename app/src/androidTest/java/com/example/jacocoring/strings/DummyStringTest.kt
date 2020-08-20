package com.example.jacocoring.strings

import org.junit.Test


class DummyStringTest {

    @Test
    fun convert() {
        val dummyString = DummyString()
        assert("DUMMY" == dummyString.convert("dummy"))
    }
}