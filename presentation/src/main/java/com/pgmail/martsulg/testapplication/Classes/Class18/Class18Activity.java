package com.pgmail.martsulg.testapplication.Classes.Class18;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.pgmail.martsulg.testapplication.R;

/**
 * Created by lenovo on 13.09.2017.
 */

public class Class18Activity extends AppCompatActivity {
    View view;
    Button button1;
    Button button2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class18_2);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar); //говорим активити что мы самостоятельно добавили тулбар


        view = findViewById(R.id.emptyView);
        button1 = (Button) findViewById(R.id.button3);
        button2 =(Button) findViewById(R.id.button4);

        final View viewRoot = findViewById(R.id.root);

        view.setVisibility(View.VISIBLE);
        view.bringToFront();
        button1.bringToFront();

        viewRoot.requestLayout();
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                view.bringToFront();
                button2.getParent().bringChildToFront(button2);
                viewRoot.requestLayout();
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.classwork18_menu,menu);



        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}
