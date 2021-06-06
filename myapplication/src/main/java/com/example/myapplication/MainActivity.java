package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView img=(ImageView)findViewById(R.id.animationView);
        img.setImageResource(R.drawable.andr);
        Animation animation= AnimationUtils.loadAnimation(this,R.anim.common_anomation);
        img.startAnimation(animation);
    }
}