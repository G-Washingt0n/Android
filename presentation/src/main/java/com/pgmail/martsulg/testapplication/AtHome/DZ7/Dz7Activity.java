package com.pgmail.martsulg.testapplication.AtHome.DZ7;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.pgmail.martsulg.testapplication.R;
import com.pgmail.martsulg.testapplication.databinding.ActivityDz7Binding;

/**
 * Created by lenovo on 18.08.2017.
 */

public class Dz7Activity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final ActivityDz7Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_dz7);

        User user = new User("George","Martsul",20,"men");
        binding.setUser(user);
        binding.setViewModel(new ProfileViewModel());
    }
}
