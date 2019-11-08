package com.frank.mvvm_exam;

import androidx.databinding.ObservableField;

public class MainViewModel {
    public final ObservableField<String> result = new ObservableField<>();
    public final ObservableField<String> number1 = new ObservableField<>();
    public final ObservableField<String> number2 = new ObservableField<>();
    private Calculator calculator;

    public MainViewModel(Calculator calculator) {
        this.calculator = calculator;
        result.set("");
        number1.set("");
        number2.set("");
    }

    public void resultClick() {
        int n1 = Integer.parseInt(number1.get());
        int n2 = Integer.parseInt(number2.get());
        result.set(Integer.toString( calculator.sum(n1,n2)));

    }
}
