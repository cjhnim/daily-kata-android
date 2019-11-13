package com.frank.android_arch_pattern;

public class Calculator {
    public Calculator() {
    }

    public String getCalcResult(String number1, String number2) {
        return Integer.toString(Integer.parseInt(number1) + Integer.parseInt(number2));
    }
}
