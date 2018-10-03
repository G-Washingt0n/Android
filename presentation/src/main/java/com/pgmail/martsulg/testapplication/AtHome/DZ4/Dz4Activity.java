package com.pgmail.martsulg.testapplication.AtHome.DZ4;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;

import com.pgmail.martsulg.testapplication.R;

/**
 * Created by lenovo on 02.08.2017.
 */

public class Dz4Activity extends Activity {
    private Thread thread;

    private AnimationDrawable animation;
    private DZ4View timerView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dz4);
        timerView = (DZ4View) findViewById(R.id.dz4_timer_view);
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
        thread.interrupt();
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
                            if (timerView.seconds < 60)
                                timerView.seconds++;
                            else {
                                timerView.seconds = 1;
                                if (timerView.minutes < 60)
                                    timerView.minutes++;
                                else {
                                    timerView.minutes = 1;
                                    if (timerView.hours < 12)
                                        timerView.hours++;
                                    else {
                                        timerView.hours = 1;
                                    }
                                }
                            }
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
