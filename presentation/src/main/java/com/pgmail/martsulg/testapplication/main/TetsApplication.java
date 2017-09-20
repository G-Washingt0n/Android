package com.pgmail.martsulg.testapplication.main;

import android.app.Application;

import com.pgmail.martsulg.testapplication.Classes.di.AppComponent;
import com.pgmail.martsulg.testapplication.Classes.di.AppModule;
import com.pgmail.martsulg.testapplication.Classes.di.DaggerAppComponent;
import com.squareup.leakcanary.LeakCanary;

import io.realm.Realm;

/**
 * Created by lenovo on 31.07.2017.
 */

public class TetsApplication extends Application{


    public static AppComponent appComponent;
    @Override
    public void onCreate() {
        super.onCreate();
        if(LeakCanary.isInAnalyzerProcess(this)){
            return;
        }
        LeakCanary.install(this);
        Realm.init(this);


        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule())
                .build();
    }
}
