package com.pgmail.martsulg.testapplication.Classes.di;

import com.pgmail.martsulg.testapplication.Classes.Class17.Gson;
import com.pgmail.martsulg.testapplication.Classes.Class17.OkHttp;
import com.pgmail.martsulg.testapplication.Classes.Class17.Rest;
import com.pgmail.martsulg.testapplication.Classes.Class17.SharedPrefs;
import com.pgmail.martsulg.testapplication.Classes.Class17.UseCase1;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by lenovo on 11.09.2017.
 */
@Module
public class AppModule {

    @Provides
    @Singleton //если надо чтобы был синглтон
    public UseCase1 provideUseCase1(Rest rest, SharedPrefs sharedPrefs){

        return new UseCase1(rest,sharedPrefs);
    }

    @Provides
    public OkHttp provideOkHttp(){

        return new OkHttp();
    }

    @Provides
    public Rest provideRest(OkHttp OkHttp, Gson gson){

        return new Rest(OkHttp, gson);
    }

    @Provides
    public SharedPrefs provideSharedPefs(){

        return new SharedPrefs();
    }

    @Provides
    public Gson provideGson(){
        return new Gson();
    }

}
