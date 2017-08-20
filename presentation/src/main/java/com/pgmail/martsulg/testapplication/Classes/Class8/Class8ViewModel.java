package com.pgmail.martsulg.testapplication.Classes.Class8;

import android.app.Activity;
import android.content.Intent;
import android.databinding.ObservableField;
import android.os.AsyncTask;
import android.util.Log;

import com.pgmail.martsulg.testapplication.Classes.Class5.Class5Activity;
import com.pgmail.martsulg.testapplication.Classes.base.BaseViewModel;
import com.pgmail.martsulg.testapplication.domain.interaction.filesForClass9.ProfileUseCase;

/**
 * Created by lenovo on 09.08.2017.
 */

public class Class8ViewModel  implements BaseViewModel {

    public Activity activity;

    public Class8ViewModel(Activity activity) {
        this.activity = activity;
    }

    public ObservableField<String> helloText = new ObservableField<>("Hello");


    private ProfileUseCase useCase = new ProfileUseCase();

    @Override
    public void init() {

    }

    @Override
    public void release() {
    }

    @Override
    public void resume() {

    }

    @Override
    public void pause() {

    }

    public void onSuperButtonClick(){
        Log.e("AAAAA", "Click");
        Intent intent = new Intent( activity, Class5Activity.class);
        activity.startActivity(intent);
    }


    public class MyAsyncTAsk extends AsyncTask<Void, Integer, String>{

        @Override
        protected void onPreExecute() {
            // выполняется в UI потоке перед методом doInBackground сразу как вызвали start
            super.onPreExecute();

        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
            //Выполняется в UI потоке, нужно самостоятельно вызывать из doInBackground
        }

        @Override
        protected String doInBackground(Void... voids) {
            // тут все выполняется в отдельном потоке... затем передаются данные в onpostExecute()
            publishProgress(20); //вызов метода onProgressUpdate
            return "";
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            //тут уже идет выполнение в UI потоке, входная s передается из doInBackground
        }

    }
}
