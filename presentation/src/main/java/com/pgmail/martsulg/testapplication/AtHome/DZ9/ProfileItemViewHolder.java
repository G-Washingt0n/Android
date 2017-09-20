package com.pgmail.martsulg.testapplication.AtHome.DZ9;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.pgmail.martsulg.testapplication.AtHome.base.BaseItemViewHolder;
import com.pgmail.martsulg.testapplication.databinding.ItemNewRecyclerViewBinding;
import com.pgmail.martsulg.testapplication.domain.entity.Dz9ProfileModel;

/**
 * Created by lenovo on 18.08.2017.
 */

public class ProfileItemViewHolder extends BaseItemViewHolder<Dz9ProfileModel,
        ProfileItemViewModel, ItemNewRecyclerViewBinding> {

    public ProfileItemViewHolder(ItemNewRecyclerViewBinding dataBinding, ProfileItemViewModel viewModel) {
        super(dataBinding, viewModel);
        dataBinding.setViewModel(viewModel);
    }

    public static ProfileItemViewHolder create(LayoutInflater inflater, ViewGroup parent,
                                               ProfileItemViewModel viewModel) {
        ItemNewRecyclerViewBinding binding = ItemNewRecyclerViewBinding.inflate(inflater, parent, false);
        return new ProfileItemViewHolder(binding, viewModel);
    }
}