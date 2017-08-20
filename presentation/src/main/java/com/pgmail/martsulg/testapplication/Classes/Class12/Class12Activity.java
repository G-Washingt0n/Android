package com.pgmail.martsulg.testapplication.Classes.Class12;

import android.app.Activity;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;

import com.pgmail.martsulg.testapplication.Classes.base.BaseActivity;
import com.pgmail.martsulg.testapplication.R;
import com.pgmail.martsulg.testapplication.databinding.ActivityClass12Binding;

/**
 * Created by lenovo on 09.08.2017.
 */

public class Class12Activity extends BaseActivity {

    public static void show(Activity activity){
        Intent intent = new Intent(activity, Class12Activity.class);
        activity.startActivity(intent);
    }


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        Class12ViewModel viewModel = new Class12ViewModel(this);
this.viewModel = viewModel;
        ActivityClass12Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_class12);
        binding.setViewModel(viewModel);
        binding.class12recycleView.setAdapter(viewModel.adapter);
        binding.class12recycleView.setLayoutManager(new LinearLayoutManager(this));
        super.onCreate(savedInstanceState);

    }
}
