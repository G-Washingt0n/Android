package com.pgmail.martsulg.testapplication.Classes.di;

import com.pgmail.martsulg.testapplication.Classes.Class17.UI;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by lenovo on 11.09.2017.
 */
@Component(modules = {AppModule.class})
@Singleton
public interface AppComponent {

    public void inject(UI ui);

}
