package com.frank.android_arch_pattern;

import androidx.databinding.BaseObservable;
import androidx.databinding.Observable;
import androidx.databinding.ObservableField;

public class MainViewModel {

    public ObservableField<String> result = new ObservableField<>();
    public ObservableField<String> number1 = new ObservableField<>();
    public ObservableField<String> number2 = new ObservableField<>();
    public ObservableField<String> number1error = new ObservableField<>("");
    public ObservableField<String> number2error = new ObservableField<>();

    private Calculator calculator;

    public MainViewModel(Calculator calculator) {

        this.calculator = calculator;
        Observable.OnPropertyChangedCallback callback = new Observable.OnPropertyChangedCallback() {
            @Override
            public void onPropertyChanged(Observable sender, int propertyId) {
                if(sender == number1)
                    number1error.set(validate(number1.get()));
                else if(sender == number2)
                    number2error.set(validate(number2.get()));
            }
        };
        number1.addOnPropertyChangedCallback(callback);
        number2.addOnPropertyChangedCallback(callback);
    }

    private String validate(String s) {
        if(isNumeric(s))
            return "";
        else
            return "invalid";
    }

    private boolean isNumeric(String s) {
        return s.isEmpty() || s.matches("[0-9]+");
    }

    public void OnClickCalc() {
        result.set(calculator.getCalcResult(number1.get(), number2.get()));
    }
}
