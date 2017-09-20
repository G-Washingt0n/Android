package com.pgmail.martsulg.testapplication.AtHome.DZ9;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.pgmail.martsulg.testapplication.AtHome.base.BaseAdapter;
import com.pgmail.martsulg.testapplication.AtHome.base.BaseItemViewHolder;
import com.pgmail.martsulg.testapplication.domain.entity.Dz9ProfileModel;

/**
 * Created by lenovo on 18.08.2017.
 */

public class ProfileAdapter extends BaseAdapter<Dz9ProfileModel, ProfileItemViewModel> {


    @Override
    public BaseItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ProfileItemViewModel itemViewModel = new ProfileItemViewModel();
        return ProfileItemViewHolder.create(LayoutInflater.from(parent.getContext()),
                parent, itemViewModel);

    }
}
