package com.frank.mvpexam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements MainContract.MvpView, View.OnClickListener {

    private MainPresenter mMainPresenter;
    private Button calcButton;
    private Calculator calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        calculator = new Calculator();
        mMainPresenter = new MainPresenter(this, calculator);
        setContentView(R.layout.main_activity);

        calcButton = findViewById(R.id.calc_buttton);
        calcButton.setOnClickListener(this);
    }

    @Override
    public int getFirstNumber() {
        EditText edit = this.findViewById(R.id.num1);

        return Integer.parseInt(edit.getText().toString());
    }

    @Override
    public int getSecondNumber() {
        EditText edit = this.findViewById(R.id.num2);
        return Integer.parseInt(edit.getText().toString());
    }

    @Override
    public void showResult(int result) {
        TextView textView = findViewById(R.id.result);
        textView.setText(Integer.toString(result));
    }

    @Override
    public void onClick(View view) {
        mMainPresenter.handleCalcButton();
    }
}
