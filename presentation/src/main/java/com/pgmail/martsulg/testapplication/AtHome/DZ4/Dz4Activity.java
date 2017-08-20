package com.pgmail.martsulg.testapplication.AtHome.DZ4;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.pgmail.martsulg.testapplication.R;

/**
 * Created by lenovo on 02.08.2017.
 */

public class Dz4Activity extends Activity {
    private Thread thread;

    private AnimationDrawable animation;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dz4);

        ImageView imageView = (ImageView) findViewById(R.id.dz4ImageView);
        imageView.setBackgroundResource(R.drawable.sovamovie);
        animation = (AnimationDrawable)imageView.getBackground();
        animation.start();

    }

    @Override
    protected void onStop() {
        super.onStop();
        overridePendingTransition(R.anim.top_out,R.anim.alpha);
        animation.stop();
    }

    @Override
    protected void onResume() {
        super.onResume();
        thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            DZ4View.seconds++;
                        }
                    });
                }
            }
        });
        thread.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        overridePendingTransition(R.anim.top_out,R.anim.alpha);
        animation.stop();
        thread.interrupt();
    }
}
