package com.frank.mvpexam;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class MainPresenterTest {

    private MainPresenter mainPresenter;

    @Mock
    private MainContract.MvpView mvpView;
    private Calculator calculator;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        calculator = new Calculator();
        mainPresenter = new MainPresenter(mvpView, calculator);
    }

    @Before
    public void tearDown() {

    }

    @Test
    public void input_num1_then_calc() {

        when(mvpView.getFirstNumber()).thenReturn(1);
        when(mvpView.getSecondNumber()).thenReturn(2);

        mainPresenter.handleCalcButton();

        verify(mvpView).showResult(3);
    }

//    @Test
//    public void input_num1_and_num2_then_calc() {
//        int value = 1;
//        int expect = 2;
//
//        mainPresenter.inputNum1(value);
//        mainPresenter.inputNum2(value);
//        int actualResult = mainPresenter.calc();
//
//        assertEquals(expect, actualResult);
//    }

//    @Test
//    public void input_num1_and_num2_then_showResult() {
//        int value1 = 1;
//        int value2 = 2;
//
//        mainPresenter.inputNum1(value1);
//        mainPresenter.inputNum1(value2);
//         mainPresenter.showResult();
//    }
}
