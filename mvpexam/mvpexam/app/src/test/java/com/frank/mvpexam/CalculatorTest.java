package com.frank.mvpexam;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void calcTest() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.sum(1,2));
    }
}