package com.educationhub.animshed.SplashScreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.educationhub.animshed.R;

public class Splash_Screen extends AppCompatActivity {
    ImageView splashImage;
    TextView animShed,madeWithLove,slogan;
    Animation animation,topAnimation,middleAnimation,bottomAnimation;

    final static int SPLASH_SCREEN_TIMER =2500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        splashImage = findViewById(R.id.splash_Screen_ImageView);
        slogan = findViewById(R.id.slogan);
        animShed = findViewById(R.id.appName);
        madeWithLove = findViewById(R.id.madeWithLove);

        animation = AnimationUtils.loadAnimation(this, R.anim.right);
        topAnimation = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        middleAnimation = AnimationUtils.loadAnimation(this, R.anim.middle_animation);
        bottomAnimation = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);

        splashImage.setAnimation(animation);
        animShed.setAnimation(animation);
        slogan.setAnimation(animation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(),OnBoarding.class));
                finish();
            }
        },SPLASH_SCREEN_TIMER);

    }
}