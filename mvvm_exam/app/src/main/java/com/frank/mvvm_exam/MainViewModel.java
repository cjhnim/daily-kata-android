package com.frank.mvvm_exam;

import androidx.databinding.BaseObservable;
import androidx.databinding.Observable;
import androidx.databinding.ObservableField;

public class MainViewModel extends BaseObservable implements Observable{
    public final ObservableField<String> result = new ObservableField<>("");
    public final ObservableField<String> number1 = new ObservableField<>("");
    public final ObservableField<String> number2 = new ObservableField<>("");
    private Calculator calculator;
    private OnPropertyChangedCallback changedCallback;

    public final ObservableField<String> number1Error = new ObservableField<>("");
    public final ObservableField<String> number2Error = new ObservableField<>("");
    String pattern = "[0-9]+";

    public MainViewModel(Calculator calculator) {
        this.calculator = calculator;
        changedCallback = new OnPropertyChangedCallback() {
            @Override
            public void onPropertyChanged(Observable sender, int propertyId) {
                if(sender == number1)
                    validateNumber(number1, number1Error);
                else if(sender == number2)
                    validateNumber(number2, number2Error);
            }
        };

        number1.addOnPropertyChangedCallback(changedCallback);
        number2.addOnPropertyChangedCallback(changedCallback);
    }

    private void validateNumber(ObservableField<String> number, ObservableField<String> numberError) {
        if(notValid(number))
            numberError.set("invalid input");
        else
            numberError.set("");
    }

    private boolean notValid(ObservableField<String> number) {
        return !number.get().isEmpty() && !number.get().matches(pattern);
    }

    public void resultClick() {
        int n1 = notValid(number1) ?  0 : Integer.parseInt(number1.get());
        int n2 = notValid(number2) ? 0 : Integer.parseInt(number2.get()) ;

        result.set(Integer.toString( calculator.sum(n1,n2)));
    }
}
