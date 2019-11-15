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

    @Test
    public void number_is_validate() {

        MainViewModel mainViewModel = new MainViewModel(new Calculator());

        mainViewModel.number1.set("2");

        assertEquals("", mainViewModel.number1error.get());
    }

    @Test
    public void blank_is_validate() {

        MainViewModel mainViewModel = new MainViewModel(new Calculator());

        mainViewModel.number1.set("");

        assertEquals("", mainViewModel.number1error.get());
    }

    @Test
    public void null_is_validate() {

        MainViewModel mainViewModel = new MainViewModel(new Calculator());

        assertEquals("", mainViewModel.number1error.get());
    }

    @Test
    public void alphabet_is_invalidate() {

        MainViewModel mainViewModel = new MainViewModel(new Calculator());
        mainViewModel.number1.set("abc");

        assertEquals("invalid", mainViewModel.number1error.get());
    }

    @Test
    public void another_alphabet_is_also_invalidate() {

        MainViewModel mainViewModel = new MainViewModel(new Calculator());
        mainViewModel.number1.set("abcd");

        assertEquals("invalid", mainViewModel.number1error.get());
    }

    @Test
    public void invalid_after_valid() {

        MainViewModel mainViewModel = new MainViewModel(new Calculator());
        mainViewModel.number1.set("123");
        mainViewModel.number1.set("abcd");

        assertEquals("invalid", mainViewModel.number1error.get());
    }

    @Test
    public void number2_is_same() {

        MainViewModel mainViewModel = new MainViewModel(new Calculator());
        mainViewModel.number2.set("abcd");

        assertEquals("invalid", mainViewModel.number2error.get());
    }
}