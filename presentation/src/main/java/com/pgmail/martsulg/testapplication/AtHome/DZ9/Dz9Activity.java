package com.pgmail.martsulg.testapplication.AtHome.DZ9;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;

import com.pgmail.martsulg.testapplication.AtHome.base.BaseActivity;
import com.pgmail.martsulg.testapplication.R;
import com.pgmail.martsulg.testapplication.databinding.ActivityDz9Binding;

/**
 * Created by lenovo on 20.08.2017.
 */

public class Dz9Activity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        Dz9ViewModel viewModel = new Dz9ViewModel(this);
        this.viewModel = viewModel;


        ActivityDz9Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_dz9);
        binding.setModel(viewModel);
        binding.dz9recyclerView.setLayoutManager(new LinearLayoutManager(this));
        binding.dz9recyclerView.setAdapter(viewModel.adapter);

        super.onCreate(savedInstanceState);

    }
}
