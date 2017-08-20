package com.pgmail.martsulg.testapplication.Classes.Class12;

import android.app.Activity;
import android.databinding.ObservableField;
import android.util.Log;

import com.pgmail.martsulg.testapplication.Classes.base.BaseViewModel;
import com.pgmail.martsulg.testapplication.domain.entity.ProfileModel;
import com.pgmail.martsulg.testapplication.domain.interaction.GetProfileListUseCase;

import java.util.List;

import io.reactivex.annotations.NonNull;
import io.reactivex.observers.DisposableObserver;

/**
 * Created by lenovo on 09.08.2017.
 */

public class Class12ViewModel implements BaseViewModel {

    public enum STATE {PROGRESS, DATA}
    public ObservableField<STATE> state = new ObservableField<>(STATE.PROGRESS);

    private Activity activity;

    public Class12ViewModel(Activity activity) {
        this.activity = activity;
    }

    private GetProfileListUseCase getProfileListUseCase = new GetProfileListUseCase();
    public ProfileAdapter adapter = new ProfileAdapter(activity);


    @Override
    public void init() {

    }

    @Override
    public void release() {

    }

    @Override
    public void resume() {

        getProfileListUseCase.execute(null, new DisposableObserver<List<? extends ProfileModel>>() {
            @Override
            public void onNext(@NonNull List<? extends ProfileModel> profileModels) {
             Log.e("AAA items = " + profileModels.size(), "");
            }

            @Override
            public void onError(@NonNull Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });
    }

    @Override
    public void pause(){

    }


}
