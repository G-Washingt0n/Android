package com.pgmail.martsulg.testapplication.Classes.Class12;

import android.databinding.ObservableField;

import com.pgmail.martsulg.testapplication.Classes.base.BaseItemViewModel;
import com.pgmail.martsulg.testapplication.domain.entity.ProfileModel;

/**
 * Created by lenovo on 18.08.2017.
 */

public class ProfileItemViewModel extends BaseItemViewModel<ProfileModel> {
    public ObservableField<String> name = new ObservableField<>("TestName");


    @Override
    public void setItem(ProfileModel item, int position) {
    name.set(item.getName());
    }
}
