package com.pgmail.martsulg.testapplication.AtHome.DZ7;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class ProfileViewModel {

    public String getImageUrl() {

return "";
    }

    @BindingAdapter({"bind:imageUrl"})
    public static void loadImage(ImageView imageView, String imageUrl) {
        Picasso.with(imageView.getContext())
                .load(imageUrl)
                .into(imageView);
    }


}
