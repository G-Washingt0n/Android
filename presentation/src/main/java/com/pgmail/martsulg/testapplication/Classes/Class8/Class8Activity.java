package com.pgmail.martsulg.testapplication.Classes.Class8;

import android.app.Activity;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.pgmail.martsulg.testapplication.Classes.base.BaseActivity;
import com.pgmail.martsulg.testapplication.R;
import com.pgmail.martsulg.testapplication.databinding.ActivityClass8Binding;

/**
 * Created by lenovo on 09.08.2017.
 */

public class Class8Activity extends BaseActivity {

    public static void show(Activity activity){
        Intent intent = new Intent(activity, Class8Activity.class);
        activity.startActivity(intent);
    }


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        Class8ViewModel viewModel = new Class8ViewModel(this);

        ActivityClass8Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_class8);
       // setContentView(R.layout.ativity_class8);
        binding.setViewModel(viewModel);
        this.viewModel = viewModel;

        super.onCreate(savedInstanceState);


    }
}
