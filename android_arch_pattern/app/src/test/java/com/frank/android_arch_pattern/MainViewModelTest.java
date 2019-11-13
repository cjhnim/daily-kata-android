package com.frank.android_arch_pattern;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainViewModelTest {

    @Test
    public void CanCalculate() {

        MainViewModel mainViewModel = new MainViewModel(new Calculator());

        mainViewModel.number1.set("2");
        mainViewModel.number2.set("3");

        mainViewModel.OnClickCalc();

        assertEquals("5", mainViewModel.result.get());

    }
}