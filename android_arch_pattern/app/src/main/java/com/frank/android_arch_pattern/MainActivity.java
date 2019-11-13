package com.frank.android_arch_pattern;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.frank.android_arch_pattern.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

//    EditText number1;
//    EditText number2;
//    Button calc;
//    TextView result;
    MainViewModel mainViewModel;
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainViewModel = new MainViewModel(new Calculator());
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setViewModel(mainViewModel);

//
//        number1 = findViewById(R.id.number1);
//        number2 = findViewById(R.id.number2);
//        calc = findViewById(R.id.calc_button);
//        result = findViewById(R.id.result);
//        calc.setOnClickListener(this);
    }

//    @Override
//    public void onClick(View view) {
//        mainViewModel.OnClickCalc();
//    }
//    @Override
//    public String getNumber1() {
//        EditText number = findViewById(R.id.number1);
//        return number.getText().toString();
//    }
//
//    @Override
//    public String getNumber2() {
//        EditText number = findViewById(R.id.number2);
//        return number.getText().toString();
//    }
//
//    @Override
//    public void showResult(String result) {
//        this.result.setText(result);
//    }
}
