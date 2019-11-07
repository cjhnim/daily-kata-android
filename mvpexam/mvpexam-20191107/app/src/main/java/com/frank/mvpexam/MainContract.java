package com.frank.mvpexam;

public interface MainContract {
    interface MvpView {
        int getFirstNumber();
        int getSecondNumber();
        void showResult(int result);
    }

    interface Presenter {
        void handleCalcButton();
    }
}
