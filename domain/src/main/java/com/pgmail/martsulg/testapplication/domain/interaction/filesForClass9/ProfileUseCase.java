package com.pgmail.martsulg.testapplication.domain.interaction.filesForClass9;

import com.pgmail.martsulg.data.entity.Profile;
import com.pgmail.martsulg.data.network.RestService;
import com.pgmail.martsulg.testapplication.domain.entity.ProfileId;
import com.pgmail.martsulg.testapplication.domain.entity.ProfileModel;
import com.pgmail.martsulg.testapplication.domain.interaction.base.UseCase;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function;

/**
 * Created by lenovo on 11.08.2017.
 */

public class ProfileUseCase extends UseCase<ProfileId,ProfileModel> {


    @Override
    protected Observable<ProfileModel> buildUseCase(ProfileId param) {

        return RestService.getInstance().getProfiles()
              .map(new Function<List<Profile>, ProfileModel>() {
                  @Override
                  public ProfileModel apply(@NonNull List<Profile> profileList) throws Exception {

                  Profile profileData = profileList.get(0);
                      ProfileModel profileModel = new ProfileModel();
                      profileModel.setName(profileData.getName());
                profileModel.setSurname(profileData.getSurname());
                  profileModel.setAge(profileData.getAge());
               return profileModel;
                }



        //Profile profile = new Profile();
        //profile.setName("NAMEname");
        //profile.setSurname("SURNAMEsurname");
        //profile.setAge(20);



        //return Observable.just(profile)
        //.delay(3, TimeUnit.SECONDS)
          //      .map(new Function<Profile, ProfileModel>() {
           //         @Override
              //      public ProfileModel apply(@NonNull Profile profile) throws Exception {
            //            ProfileModel profileModel = new ProfileModel();
              //          profileModel.setName(profile.getName());
                //        profileModel.setSurname(profile.getSurname());
                  //      profileModel.setAge(profile.getAge());
                    //    return profileModel;
                //    }
                });
    }

}

