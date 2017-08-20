package com.pgmail.martsulg.testapplication.Classes.Class5;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.IntDef;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by lenovo on 02.08.2017.
 */

public class MyService extends Service {

    public void onReceive(){

        String state = "off";


        Intent intent = new Intent();
        intent.setAction("com.pgmail.martsulg.testapplication.Classes.Class5.MY_ACTION");
        intent.putExtra("state", state);
        sendBroadcast(intent);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("FJDJF", "onCreate()");
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.e("FJDJF", "onBind()");
        return null;
    }

    @Override
    public boolean onUnbind(Intent intent) {
        Log.e("FJDJF", "onUnbind()");
        return super.onUnbind(intent);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        Log.e("FJDJF", "onStartCommand()");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        Log.e("FJDJF", "onDestroy");
        super.onDestroy();
    }
}
