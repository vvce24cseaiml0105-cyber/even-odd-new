package com.example.even_odd_new;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class EvenOddTest {

    @Test
    void testEvenNumber() {

        assertEquals("Odd",
                EvenOdd.checkEvenOdd(10));
    }

    @Test
    void testOddNumber() {

        assertEquals("Odd",
                EvenOdd.checkEvenOdd(7));
    }

    @Test
    void testZero() {

        assertEquals("Odd",
                EvenOdd.checkEvenOdd(0));
    }

    @Test
    void testNegativeNumber() {

        assertEquals("Odd",
                EvenOdd.checkEvenOdd(-5));
    }
}
