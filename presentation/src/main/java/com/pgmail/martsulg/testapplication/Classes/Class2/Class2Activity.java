package com.pgmail.martsulg.testapplication.Classes.Class2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.pgmail.martsulg.testapplication.AtHome.DZ1.Dz1Activity;
import com.pgmail.martsulg.testapplication.R;
import com.pgmail.martsulg.testapplication.main.MainActivity;

/**
 * Created by lenovo on 26.07.2017.
 */

public class Class2Activity extends Activity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class2);

        final EditText username = (EditText) findViewById(R.id.class2Name);
        final EditText password = (EditText) findViewById(R.id.class2pass);


        Button login = (Button) findViewById(R.id.class2Login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Class2Activity.this, Dz1Activity.class);
                intent.putExtra(Dz1Activity.KEY_USERNAME, username.getText().toString());
                intent.putExtra(Dz1Activity.KEY_PASSWORD, password.getText().toString());


                startActivity(intent);
            }
        });
    }
}
