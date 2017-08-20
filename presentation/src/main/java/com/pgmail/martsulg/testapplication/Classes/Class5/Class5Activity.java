package com.pgmail.martsulg.testapplication.Classes.Class5;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.support.v4.net.ConnectivityManagerCompat;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.pgmail.martsulg.testapplication.R;

/**
 * Created by lenovo on 02.08.2017.
 */

public class Class5Activity  extends Activity{

    private TextView textView;
    private int i=0;



    private BroadcastReceiver receiver = new BroadcastReceiver(){
        @Override
        public void onReceive(Context context, Intent intent) {
            Log.e("FFFFF", "onReceive");
            i++;
            textView.setText("i = " + i);
        }
    };



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class5);

        Intent intent = new Intent(Class5Activity.this, MyIntentService.class);
        intent.putExtra(MyIntentService.KEY_ACTION,"Zadanie 0");
        startService(intent);

        Intent intent2 = new Intent(Class5Activity.this, MyIntentService.class);
        intent2.putExtra(MyIntentService.KEY_ACTION,"Zadanie 1");
        startService(intent2);
        Intent intent3 = new Intent(Class5Activity.this, MyIntentService.class);
        intent3.putExtra(MyIntentService.KEY_ACTION,"Zadanie 2");
        startService(intent3);





        textView = (TextView) findViewById(R.id.class5TextView);

//        startService(new Intent(this,MyService.class));

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
  //              Intent intent = new Intent(Class5Activity.this, MyService.class);
  //            stopService(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        IntentFilter intentFilter  = new IntentFilter();
        intentFilter.addAction(ConnectivityManager.CONNECTIVITY_ACTION);
        intentFilter.addAction(MyIntentService.MY_ACTION);
        intentFilter.addAction("com.pgmail.martsulg.testapplication.Classes.Class5.MY_ACTION");

        registerReceiver(receiver,intentFilter);
        Intent intent = new Intent(Class5Activity.this, MyService.class);

        bindService(intent, serviceConnection, Context.BIND_AUTO_CREATE);
    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(receiver);
        unbindService(serviceConnection);
    }

    private ServiceConnection serviceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.e("FJDJF", "onServiceConnected()");
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {
            Log.e("FJDJF", "onServiceDisconnected()");
        }
    };
}
