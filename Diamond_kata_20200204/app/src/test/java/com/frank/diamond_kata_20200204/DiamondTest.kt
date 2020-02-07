package com.frank.diamond_kata_20200204

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class DiamondTest {
    @Test
    fun A_is_A() {

        val diamond = Diamond('A')

        val expectedResult = "A\n"
        assertEquals(expectedResult, diamond.print())
    }

    @Test
    fun B_is_ABBA() {
        val diamond = Diamond('B')
        val expectedResult =
                    " A\n" +
                    "B B\n" +
                    " A\n"
        assertEquals(expectedResult, diamond.print())
    }

    @Test
    fun C_is_ABBCCBBA() {
        val diamond = Diamond('C')
        val expectedResult =
                    "  A\n" +
                    " B B\n" +
                    "C   C\n" +
                    " B B\n" +
                    "  A\n"
        assertEquals(expectedResult, diamond.print())
    }

    @Test
    fun D_is_ABBCCDDCCBBA() {
        val diamond = Diamond('D')
        val expectedResult =
                    "   A\n" +
                    "  B B\n" +
                    " C   C\n" +
                    "D     D\n" +
                    " C   C\n" +
                    "  B B\n" +
                    "   A\n"
        assertEquals(expectedResult, diamond.print())
    }
}
