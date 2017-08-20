package com.pgmail.martsulg.testapplication.AtHome.DZ1;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.pgmail.martsulg.testapplication.R;


public class Dz1Activity extends Activity implements View.OnClickListener {

    public static final String KEY_USERNAME = "KEY_USERNAME";
    public static final String KEY_PASSWORD = "KEY_PASSWORD";

    private Button button;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dz1);
        Log.d("Dz1Activity", "onCreate()");

        final String username = getIntent().getStringExtra(KEY_USERNAME);
        final String password = getIntent().getStringExtra(KEY_PASSWORD);

        final TextView text1 = (TextView) findViewById(R.id.textView);
        if(username != null)
            text1.setText(username);


        text1.setOnClickListener(this);

        final TextView text2 = (TextView) findViewById(R.id.textView2);
        if(username != null)
            text2.setText(password);


        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = (String) button.getText();
                temp = text1.getText().toString();
                text1.setText(text2.getText().toString());
                text2.setText(temp);
            }
        };

        text2.setOnClickListener(listener);


        button = (Button)findViewById(R.id.button);
        button.setText("Switcher");

        button.setOnClickListener (new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                 String temp = (String) button.getText();
                temp = text1.getText().toString();
                text1.setText(text2.getText().toString());
                text2.setText(temp);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Dz1Activity", "onDestroy()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Dz1Activity", "onStart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Dz1Activity", "onStop()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Dz1Activity", "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Dz1Activity", "onPause()");
    }



    @Override
    public void onClick(View view) {
        final String username = getIntent().getStringExtra(KEY_USERNAME);
        final String password = getIntent().getStringExtra(KEY_PASSWORD);
        String temp = (String) button.getText();
        final TextView text1 = (TextView) findViewById(R.id.textView);
        final TextView text2 = (TextView) findViewById(R.id.textView2);

        temp = text1.getText().toString();
        text1.setText(text2.getText().toString());
        text2.setText(temp);
    }
}
