package com.pgmail.martsulg.testapplication.Classes.Class9;

import android.app.Activity;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.pgmail.martsulg.testapplication.Classes.base.BaseActivity;
import com.pgmail.martsulg.testapplication.R;
import com.pgmail.martsulg.testapplication.databinding.ActivityClass9Binding;

/**
 * Created by lenovo on 09.08.2017.
 */

public class Class9Activity extends BaseActivity {

    public static void show(Activity activity){
        Intent intent = new Intent(activity, Class9Activity.class);
        activity.startActivity(intent);
    }


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        Class9ViewModel viewModel = new Class9ViewModel();
        this.viewModel = viewModel;

        ActivityClass9Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_class9);
        binding.setViewModel(viewModel);

        super.onCreate(savedInstanceState);

    }
}
