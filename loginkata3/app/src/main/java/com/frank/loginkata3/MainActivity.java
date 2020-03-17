package com.frank.loginkata3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.frank.loginkata3.databinding.ActivityMainBinding;

import static com.frank.loginkata3.BR.viewModel;

public class MainActivity extends AppCompatActivity {

    MainViewModel viewModel;
    ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewModel = new MainViewModel();
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mBinding.setViewModel(viewModel);
    }

    public ActivityMainBinding getBinding() {
        return mBinding;
    }
}
