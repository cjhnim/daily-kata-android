package com.frank.hellotab;


import androidx.databinding.ObservableField;

public class PageViewModel {
    public ObservableField<String> title = new ObservableField<>();
    public PageViewModel(int i) {
        title.set("Page " + i);
    }
}
