package com.pgmail.martsulg.testapplication.Classes.Class14;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.pgmail.martsulg.testapplication.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by lenovo on 04.09.2017.
 */

public class Class14Activity extends Activity {

    @BindView(R.id.class14Button)
    Button button;
    @BindView(R.id.class14editText)
    EditText text;


    SharedPreferences preferences;
public static final String SHARED_PREF_NAME = "filename";
    public static final String KEY_NAME = "keyname";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class14);
        ButterKnife.bind(this);

        preferences = getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        button.setText("bbbbuttttton");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //сохраняем текст из text в SharedPreference
                preferences.edit()
                        .putString(KEY_NAME,String.valueOf(text.getText()))
                        .apply();
            }
        });

        // берем данные из SharedPreference которые сохранили и задаем их в text
        String data = preferences.getString(KEY_NAME, null);
        if(data!= null) text.setText(data);
    }
}
