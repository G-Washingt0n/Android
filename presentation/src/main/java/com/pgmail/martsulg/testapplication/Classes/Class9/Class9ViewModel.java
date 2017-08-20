package com.pgmail.martsulg.testapplication.Classes.Class9;

import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.util.Log;

import com.pgmail.martsulg.testapplication.Classes.base.BaseViewModel;
import com.pgmail.martsulg.testapplication.domain.entity.ProfileId;
import com.pgmail.martsulg.testapplication.domain.entity.ProfileModel;
import com.pgmail.martsulg.testapplication.domain.interaction.filesForClass9.ProfileUseCase;
import com.pgmail.martsulg.testapplication.domain.interaction.filesForClass9.SaveProfileUseCase;

import io.reactivex.annotations.NonNull;
import io.reactivex.observers.DisposableObserver;

/**
 * Created by lenovo on 09.08.2017.
 */

public class Class9ViewModel implements BaseViewModel {

    public enum STATE {PROGRESS, DATA}

    public ObservableField<String> name = new ObservableField<>("Rubenio");
    public ObservableField<String> surname = new ObservableField<>("Huliganio");

    public ObservableInt age = new ObservableInt(33);
    public ObservableField<STATE> state = new ObservableField<>(STATE.PROGRESS);

    public ProfileUseCase useCase = new ProfileUseCase();

    public SaveProfileUseCase saveProfileUseCase = new SaveProfileUseCase();

    @Override
    public void init() {

    }

    @Override
    public void release() {

    }

    @Override
    public void resume() {

        ProfileId profileId = new ProfileId();
        profileId.setId("123");
        useCase.execute(profileId, new DisposableObserver<ProfileModel>() {
            @Override
            public void onNext(@NonNull ProfileModel profile) {

                name.set(profile.getName());
                surname.set(profile.getSurname());
                age.set(profile.getAge());

                state.set(STATE.DATA);
            }

            @Override
            public void onError(@NonNull Throwable e) {
                Log.e("AAA", "error = ",e);
            }

            @Override
            public void onComplete() {

            }
        });




    }

    @Override
    public void pause() {
        useCase.dispose();
    }


}
