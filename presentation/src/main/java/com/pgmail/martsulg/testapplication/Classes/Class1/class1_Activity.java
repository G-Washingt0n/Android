package com.pgmail.martsulg.testapplication.Classes.Class1;


import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.pgmail.martsulg.testapplication.R;


public class class1_Activity extends Activity {

    private Button helloButton;
    private int i;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class1);
        Log.d("class1_Activity", "onCreate()");

        helloButton = (Button)findViewById(R.id.hello_button);
        helloButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                i++;
                helloButton.setText("Button" + i);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("class1_Activity", "onDestroy()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("class1_Activity", "onStart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("class1_Activity", "onStop()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("class1_Activity", "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("class1_Activity", "onPause()");
    }
}
