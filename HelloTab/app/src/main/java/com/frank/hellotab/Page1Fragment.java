package com.frank.hellotab;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.frank.hellotab.databinding.Page1Binding;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

public class Page1Fragment extends Fragment {

    Page1Binding binding;
    PageViewModel viewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstaceState) {
        viewModel = new PageViewModel(1);
        binding = DataBindingUtil.inflate(inflater, R.layout.page1, container, false);
        binding.setViewModel(viewModel);
//        return inflater.inflate(R.layout.page1, container,  false);
        return binding.getRoot();
    }
}
