package com.pgmail.martsulg.testapplication.Classes.Class5;

import android.app.IntentService;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.annotation.Nullable;
import android.support.annotation.StringDef;
import android.util.Log;

/**
 * Created by lenovo on 02.08.2017.
 */

public class MyIntentService extends IntentService{

    public static final String KEY_ACTION = "KEY_ACTION";
    public static final String MY_ACTION = "com.pgmail.martsulg.testapplication.Classes.Class5.MY_ACTION";


    public MyIntentService() {
        super("MyIntentService");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {

        String action = intent.getStringExtra(KEY_ACTION);
        Log.e("AAAAA","OnHandleIntent() action = " + action);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent intentReceiver = new Intent(MY_ACTION); // == intentReceiver.setAction(MY_ACTION);
        sendBroadcast(intentReceiver);

    }
}
