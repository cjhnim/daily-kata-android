package com.frank.android_arch_pattern;

import androidx.databinding.Observable;
import androidx.databinding.ObservableField;

public class MainViewModel{

    public ObservableField<String> number1 = new ObservableField<>();
    public ObservableField<String> number2 = new ObservableField<>();
    public ObservableField<String> result = new ObservableField<>();
    private Calculator calculator;

    public MainViewModel(Calculator calculator) {
        this.calculator = calculator;
    }

    public void OnClickCalc() {
        result.set(calculator.getCalcResult(number1.get(), number2.get()));
    }
}
