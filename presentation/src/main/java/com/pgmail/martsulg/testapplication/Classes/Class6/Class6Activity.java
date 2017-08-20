package com.pgmail.martsulg.testapplication.Classes.Class6;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.pgmail.martsulg.testapplication.R;

import java.util.ArrayList;


/**
 * Created by lenovo on 04.08.2017.
 */

public class Class6Activity extends Activity {

    private RecyclerView recyclerView;
    private ArrayList<String> stringArrayList = new ArrayList<>();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class6);

        stringArrayList.add("Item 1");
        stringArrayList.add("Item 2");
        stringArrayList.add("Item 3");
        stringArrayList.add("Item 4");
        stringArrayList.add("Item 5");
        stringArrayList.add("Item 6");
        stringArrayList.add("Item 7");

        recyclerView = (RecyclerView) findViewById(R.id.class6recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        Class6Adapter adapter = new Class6Adapter(stringArrayList);

        adapter.setListener(new Class6Adapter.OnItemClickListener(){
            @Override
            public void onItemClick(String item) {
                Log.e("AAAAA","OnCreateViewHolder");
            }
        });
        recyclerView.setAdapter(adapter);
    }
}
