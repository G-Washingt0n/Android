package com.pgmail.martsulg.testapplication.domain.interaction.filesForClass9;

import com.pgmail.martsulg.data.entity.Profile;
import com.pgmail.martsulg.data.network.RestService;
import com.pgmail.martsulg.testapplication.domain.entity.ProfileModel;
import com.pgmail.martsulg.testapplication.domain.interaction.base.UseCase;

import io.reactivex.Observable;

/**
 * Created by lenovo on 16.08.2017.
 */

public class SaveProfileUseCase extends UseCase<ProfileModel, Void> {


    @Override
    protected Observable<Void> buildUseCase(ProfileModel param) {

        Profile profileData = new Profile();

        profileData.setName(param.getName());
        profileData.setSurname(param.getSurname());
        profileData.setAge(param.getAge());
        return RestService.getInstance().saveProfile(profileData);

    }
}
