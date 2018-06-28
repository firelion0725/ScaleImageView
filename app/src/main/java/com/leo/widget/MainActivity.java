package com.leo.widget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String imgUrl = "http://f2.topitme.com/2/6a/bc/113109954583dbc6a2o.jpg";

        ScaleImageView imageView = findViewById(R.id.image_view);

        Glide.with(this)
                .load(imgUrl)
                .into(imageView);

    }
}
