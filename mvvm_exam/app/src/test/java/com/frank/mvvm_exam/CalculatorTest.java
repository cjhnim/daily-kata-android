package com.frank.mvvm_exam;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void sum() {
        Calculator calculator = new Calculator();
        assertEquals(5,calculator.sum(2,3));
    }

}