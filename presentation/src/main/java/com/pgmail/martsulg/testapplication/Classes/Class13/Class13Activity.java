package com.pgmail.martsulg.testapplication.Classes.Class13;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

import com.pgmail.martsulg.testapplication.R;

/**
 * Created by lenovo on 21.08.2017.
 */

public class Class13Activity extends FragmentActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class13);

        if(savedInstanceState==null){
            showFragment(getSupportFragmentManager(), new Class13Fragment());

        }

        findViewById(R.id.class13button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showFragment(getSupportFragmentManager(), Class13Fragment.newInstance(getSupportFragmentManager(),"kakoi-to tam string"));
            }
        });

        findViewById(R.id.class13button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showFragment(getSupportFragmentManager(), new Class13SecondFragment());

            }
        });

    }

    public static void showFragment(FragmentManager fragmentManager, Fragment fragment){
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.class13container,fragment, fragment.getClass().getName());
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }
}
