package com.frank.mvvm_exam;

import androidx.databinding.ObservableField;

public class MainViewModel {
    public final ObservableField name = new ObservableField<>();

    public MainViewModel() {
        name.set("John");
    }

    public void nameClick() {
        name.set("Click!!");
    }
}
