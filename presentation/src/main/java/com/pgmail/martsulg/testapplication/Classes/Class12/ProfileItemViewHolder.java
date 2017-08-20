package com.pgmail.martsulg.testapplication.Classes.Class12;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.pgmail.martsulg.testapplication.Classes.base.BaseItemViewHolder;
import com.pgmail.martsulg.testapplication.databinding.ItemProfileBinding;
import com.pgmail.martsulg.testapplication.domain.entity.ProfileModel;

/**
 * Created by lenovo on 18.08.2017.
 */

public class ProfileItemViewHolder extends BaseItemViewHolder<ProfileModel,
        ProfileItemViewModel, ItemProfileBinding> {

    public ProfileItemViewHolder(ItemProfileBinding dataBinding,
                                 ProfileItemViewModel viewModel) {
        super(dataBinding, viewModel);
    }

    public static ProfileItemViewHolder create(LayoutInflater inflater, ViewGroup parent,
                                               ProfileItemViewModel viewModel) {
        ItemProfileBinding binding = ItemProfileBinding.inflate(inflater, parent, false);
        return new ProfileItemViewHolder(binding, viewModel);
    }
}