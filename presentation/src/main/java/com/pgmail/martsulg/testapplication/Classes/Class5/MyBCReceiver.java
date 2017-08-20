package com.pgmail.martsulg.testapplication.Classes.Class5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by lenovo on 02.08.2017.
 */

public class MyBCReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        Log.e("FFFFF", "onReceive");
    }
}
