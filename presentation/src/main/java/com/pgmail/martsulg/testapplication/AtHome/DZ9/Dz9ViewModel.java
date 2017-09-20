package com.pgmail.martsulg.testapplication.AtHome.DZ9;

import android.app.Activity;
import android.databinding.ObservableField;
import android.util.Log;

import com.pgmail.martsulg.testapplication.AtHome.base.BaseViewModel;
import com.pgmail.martsulg.testapplication.domain.entity.Dz9ProfileModel;
import com.pgmail.martsulg.testapplication.domain.interaction.forDz9.Dz9GetProfileListUseCase;

import java.util.List;

import io.reactivex.annotations.NonNull;
import io.reactivex.observers.DisposableObserver;

/**
 * Created by lenovo on 03.09.2017.
 */

public class Dz9ViewModel  implements BaseViewModel{

    public enum STATE {PROGRESS, DATA}

    private Activity activity;

    private Dz9GetProfileListUseCase dz9GetProfileListUseCase = new Dz9GetProfileListUseCase();

    public ProfileAdapter adapter = new ProfileAdapter();

    public Dz9ViewModel(Activity activity) {
        this.activity = activity;
    }

    public ObservableField<STATE> state = new ObservableField<>(STATE.PROGRESS);



    @Override
    public void init() {

    }

    @Override
    public void release() {

    }

    @Override
    public void resume() {
        dz9GetProfileListUseCase.execute(null, new DisposableObserver<List<Dz9ProfileModel>>() {
            @Override
            public void onNext(@NonNull List<Dz9ProfileModel> dz9ProfileModels) {
                Log.e("AAA via Model", "size = " + dz9ProfileModels.size());

                adapter.setItems(dz9ProfileModels);
                state.set(STATE.DATA);

                Log.e("AAA via Model", "adapter size = " + adapter.getItemCount());

            }

            @Override
            public void onError(@NonNull Throwable e) {
                Log.e("AAA items", e.toString());
            }

            @Override
            public void onComplete() {
                Log.e("AAA item","onComplete");
            }
        });


    }

    @Override
    public void pause() {

    }
}
