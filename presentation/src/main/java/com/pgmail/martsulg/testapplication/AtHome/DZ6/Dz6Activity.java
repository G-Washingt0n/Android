package com.pgmail.martsulg.testapplication.AtHome.DZ6;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.pgmail.martsulg.testapplication.R;

import java.util.ArrayList;

/**
 * Created by lenovo on 14.08.2017.
 */

public class Dz6Activity extends Activity {

    private RecyclerView recyclerView;
    private ArrayList<String> urlList = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dz6);


        urlList.add("https://cs8.pikabu.ru/post_img/2016/03/08/5/1457422233170790895.png");
        urlList.add("https://www.google.by/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=0ahUKEwiDldDQkdXVAhVLEJoKHbeKAl0QjRwIBw&url=https%3A%2F%2Fwww.youtube.com%2Fwatch%3Fv%3DPbzhlWiqeiU&psig=AFQjCNG72MKhPDG5iMOlbuqVLm427pPwBA&ust=1502745236052421");
        urlList.add("https://i.ytimg.com/vi/PbzhlWiqeiU/hqdefault.jpg");
        urlList.add("http://kachalki.com.ua/uploads/_CGSmartImage/rkk-bezh-6080d5e6f151a6ce3c30bda9a52637bb.jpg");


        recyclerView = (RecyclerView) findViewById(R.id.class6recyclerView);
        GridLayoutManager gridLayout = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(gridLayout);
        Dz6Adapter adapter = new Dz6Adapter(urlList);

        adapter.setListener(new Dz6Adapter.OnItemClickListener() {
            @Override
            public void onItemClick(String item) {
                Log.e("AAAAA","OnCreateViewHolder");
            }
        });

        recyclerView.setAdapter(adapter);




    }
}
