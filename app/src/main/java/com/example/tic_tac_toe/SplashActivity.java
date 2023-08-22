package com.example.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        TextView text1;
        Intent playHome = new Intent(SplashActivity.this, MainActivity.class);
        text1=findViewById(R.id.text1);
        Animation alpha = AnimationUtils.loadAnimation(this,R.anim.alpha);
        text1.setAnimation(alpha);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(playHome);
                finish();
            }
        },3000);


    }
}