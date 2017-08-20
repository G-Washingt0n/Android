package com.pgmail.martsulg.testapplication.AtHome.DZ6;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.pgmail.martsulg.testapplication.R;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Callback;

import java.util.ArrayList;

/**
 * Created by lenovo on 14.08.2017.
 */

public class Dz6Adapter extends RecyclerView.Adapter<Dz6Adapter.Holder>  {

    public void setListener(OnItemClickListener listener) {
        this.listener = listener;
        }

private OnItemClickListener listener;
private ArrayList<String> urls;

    public Dz6Adapter(ArrayList<String> urls) {
        this.urls = urls;
    }

    public static class Holder extends  RecyclerView.ViewHolder {

        ImageView imageView;
        ProgressBar progressBar;
        TextView textView;

        public Holder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.class6ImageView);
            progressBar = (ProgressBar) itemView.findViewById(R.id.dz6progressBar);
        }

    }


    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {

        View root = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_recycler_view,parent,false);
        Log.e("AAAAA", "onCreateViewHolder");
        return new Holder(root);
    }

    @Override
    public void onBindViewHolder(final Holder holder, final int position) {

        final String url = urls.get(position);
        //holder.imageView - заполнить дома

        Log.e("AAAAA", "onBindViewHolder");
        holder.progressBar.setVisibility(View.VISIBLE);
        Picasso.with(holder.imageView.getContext())
                .load(url)
                .into(holder.imageView, new Callback() {
            @Override
            public void onSuccess() {
                holder.progressBar.setVisibility(View.GONE);
            }

            @Override
            public void onError() {
                holder.progressBar.setVisibility(View.VISIBLE);
            }
        });


    }

    @Override
    public int getItemCount() {
        return urls == null ? 0 : urls.size();

    }

    interface OnItemClickListener{
        public void onItemClick(String item);
    }

}
