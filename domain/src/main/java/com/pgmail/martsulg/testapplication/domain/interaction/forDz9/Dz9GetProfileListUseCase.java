package com.pgmail.martsulg.testapplication.domain.interaction.forDz9;

import android.util.Log;

import com.pgmail.martsulg.data.entity.Dz9Profile;
import com.pgmail.martsulg.testapplication.domain.entity.Dz9ProfileModel;
import com.pgmail.martsulg.testapplication.domain.interaction.base.UseCase;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function;

/**
 * Created by lenovo on 05.09.2017.
 */

public class Dz9GetProfileListUseCase extends UseCase<Dz9Profile,List<Dz9ProfileModel>> {
    @Override
    protected Observable<List<Dz9ProfileModel>> buildUseCase(Dz9Profile dz9Profile) {

        List<Dz9Profile> listReference = new ArrayList();

        listReference.add(new Dz9Profile("https://cs8.pikabu.ru/post_img/2016/03/08/5/1457422233170790895.png"));
        listReference.add(new Dz9Profile("http://cs619118.vk.me/v619118754/19564/m8yp5t8CI7U.jpg"));
        listReference.add(new Dz9Profile("http://zainetom.ru/wp-content/uploads/2015/11/113.jpg"));

        return Observable.just(listReference)
                .delay(3, TimeUnit.SECONDS)
                .map(new Function<List<Dz9Profile>, List<Dz9ProfileModel>>() {
                    @Override
                    public List<Dz9ProfileModel> apply(@NonNull List<Dz9Profile> dz9Profiles) throws Exception {
                        List<Dz9ProfileModel> list = new ArrayList<Dz9ProfileModel>();
                        for(Dz9Profile profile: dz9Profiles){
                            Log.e("AAA",profile.getLink());
                            list.add(convert(profile));
                        }
                        Log.e("AAA", "size=" + list.size());
                        return list;
                    }
                });
    }

    private Dz9ProfileModel convert(Dz9Profile dataModel){
        Dz9ProfileModel profileModel = new Dz9ProfileModel();
        profileModel.setLink(dataModel.getLink());
        return profileModel;
    }
}
