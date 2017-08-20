package com.pgmail.martsulg.testapplication.Classes.Class12;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.pgmail.martsulg.testapplication.Classes.base.BaseAdapter;
import com.pgmail.martsulg.testapplication.Classes.base.BaseItemViewHolder;
import com.pgmail.martsulg.testapplication.domain.entity.ProfileModel;

/**
 * Created by lenovo on 18.08.2017.
 */

public class ProfileAdapter extends BaseAdapter<ProfileModel, ProfileItemViewModel> {

    private Context context;

    public ProfileAdapter(Context context) {
        this.context = context;
    }

    @Override
    public BaseItemViewHolder<ProfileModel, ProfileItemViewModel, ?>
    onCreateViewHolder(ViewGroup parent, int viewType) {
        ProfileItemViewModel itemViewModel = new ProfileItemViewModel();
        return ProfileItemViewHolder.create(LayoutInflater.from(context),
                parent, itemViewModel);
    }
}
