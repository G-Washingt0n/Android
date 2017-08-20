package com.pgmail.martsulg.data.network;

import com.pgmail.martsulg.data.entity.Profile;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by lenovo on 16.08.2017.
 */

public interface RestApi {
    @GET("data/profile")
    Observable<List<Profile>> getProfiles();

    @POST("data/profile")
    Observable<Void> saveProfile(@Body Profile profile);



}
