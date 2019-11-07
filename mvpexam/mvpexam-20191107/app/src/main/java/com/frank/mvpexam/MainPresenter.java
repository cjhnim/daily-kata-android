package com.frank.mvpexam;

public class MainPresenter implements MainContract.Presenter {

    private MainContract.MvpView mvpView;
    private Calculator calculator;

    public MainPresenter(MainContract.MvpView mvpView, Calculator calculator) {
        this.mvpView = mvpView;
        this.calculator = calculator;
    }

    @Override
    public void handleCalcButton() {
        mvpView.showResult(calculator.sum(mvpView.getFirstNumber(),mvpView.getSecondNumber()));
    }
}
