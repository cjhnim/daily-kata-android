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
}