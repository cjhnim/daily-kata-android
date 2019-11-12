package com.frank.mvvm_exam;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainViewModelTest {

    private MainViewModel viewModel;

    @Before
    public void setUp() throws Exception {
        viewModel = new MainViewModel(new Calculator());
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void canCalculate() {
        viewModel.number1.set("1");
        viewModel.number2.set("2");
        viewModel.resultClick();
        assertEquals("3", viewModel.result.get());
    }

    @Test
    public void InvalidNumber() {

        viewModel.number1.set("abcd");
        assertEquals("invalid input", viewModel.number1Error.get());
    }

    @Test
    public void ValidNumber() {

        viewModel.number1.set("123");
        assertEquals("", viewModel.number1Error.get());
    }

    @Test
    public void ValidNumberAfterInvalid() {
        viewModel.number1.set("abc");
        viewModel.number1.set("123");
        assertEquals("", viewModel.number1Error.get());
    }

    @Test
    public void Blank_ShouldValid() {
        viewModel.number1.set("abc");
        viewModel.number1.set("");
        assertEquals("", viewModel.number1Error.get());
    }

    @Test
    public void InvalidNumberOfNumber2() {

        viewModel.number2.set("abcd");
        assertEquals("invalid input", viewModel.number2Error.get());
    }

    @Test
    public void WhenInvalidInput_Then_ShouldNotCalculate() {
        viewModel.number1.set("abcd");
        viewModel.number2.set("abcd");
        viewModel.resultClick();

        assertEquals("0", viewModel.result.get());
    }
}