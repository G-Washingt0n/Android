package com.pgmail.martsulg.testapplication.Classes.Class6;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.pgmail.martsulg.testapplication.R;

import java.util.ArrayList;

/**
 * Created by lenovo on 04.08.2017.
 */

public class Class6Adapter extends RecyclerView.Adapter<Class6Adapter.Holder> {

    public void setListener(OnItemClickListener listener) {
        this.listener = listener;
    }

    private OnItemClickListener listener;
    private ArrayList<String> items;
    public Class6Adapter(ArrayList<String> items){
        this.items = items;
    }
    public static class Holder extends  RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textView;

        public Holder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.class6ImageView);
            textView = (TextView) itemView.findViewById(R.id.class6TextView);
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
    public void onBindViewHolder(Holder holder, int position) { //позиция это строчка для отрисовки

        final String item = items.get(position);
        //holder.imageView - заполнить дома

        Log.e("AAAAA", "onBindViewHolder");
        holder.textView.setText(item);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(listener!=null){
                    listener.onItemClick(item);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return items == null ? 0 : items.size();
    }


    interface OnItemClickListener{
        public void onItemClick(String item);
    }
}
