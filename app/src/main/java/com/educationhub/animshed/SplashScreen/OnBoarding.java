package com.educationhub.animshed.SplashScreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.educationhub.animshed.Adapter.SliderAdapter;
import com.educationhub.animshed.R;

public class OnBoarding extends AppCompatActivity {
    ViewPager viewPager;
    LinearLayout dots;
    SliderAdapter sliderAdapter;
    TextView dot[];
    Button letsGetStarted;
    Animation leftAnim;
    int currentItem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        //Hooks
        viewPager = findViewById(R.id.slider);
        dots = findViewById(R.id.dots);
        letsGetStarted=findViewById(R.id.letGetsStarted);
        //  call sliderAdapter
        sliderAdapter = new SliderAdapter(this);
        viewPager.setAdapter(sliderAdapter);
        addDots(0);
        viewPager.addOnPageChangeListener(changeListener);
    }

    private void addDots(int position) {
        dot = new TextView[5];
        dots.removeAllViews();
        for (int i = 0; i < dot.length; i++) {

            dot[i] = new TextView(this);
            dot[i].setText(Html.fromHtml("&#8226"));
            dot[i].setTextSize(35);
            dots.addView(dot[i]);
        }
        if(dot.length>0){
            dot[position].setTextColor(getResources().getColor(R.color.colorPrimary));
        }
    }
    ViewPager.OnPageChangeListener changeListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            addDots(position);
            currentItem = position;
            if(position ==0){
                letsGetStarted.setVisibility(View.INVISIBLE);
            }
            else if(position==1){
                letsGetStarted.setVisibility(View.INVISIBLE);
            }else if(position==2) {
                letsGetStarted.setVisibility(View.INVISIBLE);
            } else if(position==3){
                    letsGetStarted.setVisibility(View.INVISIBLE);

            }else{
                leftAnim = AnimationUtils.loadAnimation(OnBoarding.this,R.anim.right);
                letsGetStarted.setAnimation(leftAnim);
                letsGetStarted.setVisibility(View.VISIBLE);
            }
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };
    public void skip(View view) {
        startActivity(new Intent(getApplicationContext(),WhoYouAre.class));
        finish();
    }

    public void LetsGetStarted(View view) {
        startActivity(new Intent(getApplicationContext(),WhoYouAre.class));
        finish();
    }

    public void next(View view) {
        viewPager.setCurrentItem(currentItem+1);
    }
}