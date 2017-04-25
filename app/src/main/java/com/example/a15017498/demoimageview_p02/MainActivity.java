package com.example.a15017498.demoimageview_p02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imgView2;
    ImageView imgView3;
    ImageView imgView4;
    ImageView imgView5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgView2 = (ImageView) findViewById(R.id.imageView1);
        imgView2.setImageResource(R.drawable.day2);


        imgView3 = (ImageView) findViewById(R.id.imageView2);
        imgView3.setImageResource(R.drawable.day3);

        imgView4 = (ImageView) findViewById(R.id.imageView3);
        imgView4.setImageResource(R.drawable.day4);

        imgView5 = (ImageView) findViewById(R.id.imageView4);
        imgView5.setImageResource(R.drawable.day5);

    }
}
