package com.pgmail.martsulg.testapplication.domain.interaction

import com.pgmail.martsulg.data.entity.Profile
import com.pgmail.martsulg.data.network.RestService
import com.pgmail.martsulg.testapplication.domain.entity.ProfileModel
import com.pgmail.martsulg.testapplication.domain.interaction.base.UseCase
import io.reactivex.Observable

/**
 * Created by lenovo on 18.08.2017.
 */

class GetProfileListUseCase : UseCase<Void, List<ProfileModel>>() {
    override fun buildUseCase(param: Void?): Observable<List<ProfileModel>> {
        return RestService.getInstance().profiles.map {
            it.map {
                convert(it)
            }
        }
    }

    private fun convert(dataModel: Profile) : ProfileModel{
        val profileModel  = ProfileModel()
        profileModel.name = dataModel.name
        profileModel.surname = dataModel.surname
        profileModel.age = dataModel.age
        return profileModel

    }
}
