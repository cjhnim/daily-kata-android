package com.frank.android_arch_pattern;

public interface MainContract {
    interface View {
        String getNumber1();
        String getNumber2();
        void showResult(String result);
    }

    interface Presenter {
        void OnClickCalc();
    }
}
