package com.pgmail.martsulg.testapplication.AtHome.DZ9;

import android.databinding.BindingAdapter;
import android.databinding.ObservableField;
import android.widget.ImageView;

import com.pgmail.martsulg.testapplication.AtHome.base.BaseItemViewModel;
import com.pgmail.martsulg.testapplication.domain.entity.Dz9ProfileModel;
import com.squareup.picasso.Picasso;

/**
 * Created by lenovo on 18.08.2017.
 */

public class ProfileItemViewModel extends BaseItemViewModel<Dz9ProfileModel> {
    public ObservableField<String> url = new ObservableField<>("");

    @BindingAdapter({"bind:src"})
    public static void loadImage(ImageView imageView, String imageUrl) {
        Picasso.with(imageView.getContext())
                .load(imageUrl)
                .into(imageView);
    }

    @Override
    public void setItem(Dz9ProfileModel item, int position) {
        url.set(item.getLink());

    }
}
