package com.pgmail.martsulg.testapplication.AtHome.DZ3;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.pgmail.martsulg.testapplication.BuildConfig;
import com.pgmail.martsulg.testapplication.R;
import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

/**
 * Created by lenovo on 31.07.2017.
 */

public class Dz3Activity extends Activity {

    TextView text2;
    private ImageView image;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dz3);
        Log.d("Dz3Activity", "onCreate()");
        final TextView ref = (TextView) findViewById(R.id.dz3EditText);
        ref.setText("http://minionomaniya.ru/wp-content/uploads/2015/09/%D0%9A%D0%B0%D1%80%D1%82%D0%B8%D0%BD%D0%BA%D0%B8-%D0%BC%D0%B8%D0%BD%D1%8C%D0%BE%D0%BD%D0%BE%D0%B2.jpg");
        image = (ImageView) findViewById(R.id.dz3imageView);
        text2 = (TextView) findViewById(R.id.dz3textView);
        Button button = (Button) findViewById(R.id.dz3ViewButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Picasso.with(Dz3Activity.this)
                        .load(ref.getText().toString())
                        .into(image);
                text2.setText(BuildConfig.API_ENDPOINT);

            }
        });
    }
}
