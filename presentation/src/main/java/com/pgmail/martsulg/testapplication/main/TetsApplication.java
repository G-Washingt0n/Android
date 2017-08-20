package com.pgmail.martsulg.testapplication.main;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * Created by lenovo on 31.07.2017.
 */

public class TetsApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        if(LeakCanary.isInAnalyzerProcess(this)){
            return;
        }
        LeakCanary.install(this);
    }
}
