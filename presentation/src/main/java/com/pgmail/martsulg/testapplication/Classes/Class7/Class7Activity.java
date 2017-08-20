package com.pgmail.martsulg.testapplication.Classes.Class7;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.databinding.ObservableField;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.pgmail.martsulg.testapplication.R;
import com.pgmail.martsulg.testapplication.databinding.ActivityClass7Binding;

/**
 * Created by lenovo on 07.08.2017.
 */

public class Class7Activity extends Activity {

    public ObservableField<String> myText = new ObservableField<>("Ура, все работает");
    private Thread thread;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityClass7Binding binding = DataBindingUtil.setContentView(this,
                R.layout.activity_class7);
        binding.setActivity(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        thread = new Thread(new Runnable() {
                            @Override
                            public void run() {
                                for(int i=0;i<3;i++){
                                    final int a = i;
                                    try {
                                        Thread.sleep(2000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    runOnUiThread(new Runnable() {
                                        @Override
                        public void run() {
                            myText.set(String.valueOf(a));
                        }
                    });
                }
            }
        });
        thread.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

}
