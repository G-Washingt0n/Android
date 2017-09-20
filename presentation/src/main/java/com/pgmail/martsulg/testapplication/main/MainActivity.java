package com.pgmail.martsulg.testapplication.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import com.pgmail.martsulg.testapplication.AtHome.DZ1.Dz1Activity;
import com.pgmail.martsulg.testapplication.AtHome.DZ2.Dz2Activity;
import com.pgmail.martsulg.testapplication.AtHome.DZ3.Dz3Activity;
import com.pgmail.martsulg.testapplication.AtHome.DZ4.Dz4Activity;
import com.pgmail.martsulg.testapplication.AtHome.DZ5.Dz5Activity;
import com.pgmail.martsulg.testapplication.AtHome.DZ6.Dz6Activity;
import com.pgmail.martsulg.testapplication.AtHome.DZ7.Dz7Activity;
import com.pgmail.martsulg.testapplication.AtHome.DZ9.Dz9Activity;
import com.pgmail.martsulg.testapplication.Classes.Class12.Class12Activity;
import com.pgmail.martsulg.testapplication.Classes.Class13.Class13Activity;
import com.pgmail.martsulg.testapplication.Classes.Class14.Class14Activity;
import com.pgmail.martsulg.testapplication.Classes.Class16.Class16Activity;
import com.pgmail.martsulg.testapplication.Classes.Class18.Class18Activity;
import com.pgmail.martsulg.testapplication.Classes.Class2.Class2Activity;
import com.pgmail.martsulg.testapplication.Classes.Class3.Class3Activity;
import com.pgmail.martsulg.testapplication.Classes.Class4.Class4Activity;
import com.pgmail.martsulg.testapplication.Classes.Class5.Class5Activity;
import com.pgmail.martsulg.testapplication.Classes.Class6.Class6Activity;
import com.pgmail.martsulg.testapplication.Classes.Class7.Class7Activity;
import com.pgmail.martsulg.testapplication.Classes.Class8.Class8Activity;
import com.pgmail.martsulg.testapplication.Classes.Class9.Class9Activity;
import com.pgmail.martsulg.testapplication.R;

/**
 * Created by lenovo on 26.07.2017.
 */

public class MainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button dz1Button = (Button) findViewById(R.id.dz1Button);
        dz1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Dz1Activity.class);
                //overridePendingTransition(R.anim.xnnxvvnsvnsv, R.anim.s'lblnsn);//анимация
                startActivity(intent);
                overridePendingTransition(R.anim.bottom_in,R.anim.alpha);
            }
        });

        Button class2Button = (Button) findViewById(R.id.class2Button);
        class2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Class2Activity.class);
                startActivity(intent);
            }
        });

        Button class3Button = (Button) findViewById(R.id.class3Button);
        class3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Class3Activity.class);
                startActivity(intent);
            }
        });

        Button dz2Button = (Button) findViewById(R.id.dz2Button);
        dz2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Dz2Activity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.bottom_in,R.anim.alpha);
            }
        });

        Button class4Button = (Button) findViewById(R.id.class4Button);
        class4Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Class4Activity.class);
                startActivity(intent);
            }
        });

        Button dz3Button = (Button) findViewById(R.id.dz3Button);
        dz3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Dz3Activity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.bottom_in,R.anim.alpha);
            }
        });

        final Button dz4Button = (Button) findViewById(R.id.dz4Button);
        dz4Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Dz4Activity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.bottom_in,R.anim.alpha);
            }
        });

        Button class5Button = (Button) findViewById(R.id.class5Button);
        class5Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Class5Activity.class);
                startActivity(intent);
            }
        });

        final Button dz5Button = (Button) findViewById(R.id.dz5Button);
        dz5Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Dz5Activity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.bottom_in,R.anim.alpha);
            }
        });

        Button class6Button = (Button) findViewById(R.id.class6Button);
        class6Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Class6Activity.class);
                startActivity(intent);
            }
        });


        final Button dz6Button = (Button) findViewById(R.id.dz6Button);
        dz6Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Dz6Activity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.bottom_in,R.anim.alpha);
            }
        });

        Button class7Button = (Button) findViewById(R.id.class7Button);
        class7Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Class7Activity.class);
                startActivity(intent);
            }
        });

        final Button dz7Button = (Button) findViewById(R.id.dz7Button);
        dz7Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Dz7Activity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.bottom_in,R.anim.alpha);
            }
        });

        final Button dz9Button = (Button) findViewById(R.id.dz9Button);
        dz9Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Dz9Activity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.bottom_in,R.anim.alpha);
            }
        });

        Button class8Button = (Button) findViewById(R.id.class8Button);
        class8Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Class8Activity.class);
                startActivity(intent);
            }
        });

        Button class9Button = (Button) findViewById(R.id.class9Button);
        class9Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Class9Activity.class);
                startActivity(intent);
            }
        });

        Button class12Button = (Button) findViewById(R.id.class12Button);
        class12Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Class12Activity.class);
                startActivity(intent);
            }
        });

        Button class13Button = (Button) findViewById(R.id.class13Button);
        class13Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Class13Activity.class);
                startActivity(intent);
            }
        });
        Button class14Button = (Button) findViewById(R.id.class14Button);
        class14Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Class14Activity.class);
                startActivity(intent);
            }
        });
        Button class16Button = (Button) findViewById(R.id.class16Button);
        class16Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Class16Activity.class);
                startActivity(intent);
            }
        });
        Button class18Button = (Button) findViewById(R.id.class18Button);
        class18Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Class18Activity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.top_out,R.anim.alpha);
    }
}
