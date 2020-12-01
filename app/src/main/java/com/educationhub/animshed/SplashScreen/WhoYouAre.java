package com.educationhub.animshed.SplashScreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.educationhub.animshed.R;
import com.educationhub.animshed.SignIn.SignUp;

public class WhoYouAre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_who_you_are);
    }

    public void Helper(View view) {
        Intent intent1 = new Intent(getApplicationContext(), SignUp.class);
        intent1.putExtra("WhoAreYou","Helper");
        startActivity(intent1);
    }

    public void NGO(View view) {
        Intent intent = new Intent(getApplicationContext(), SignUp.class);
        intent.putExtra("WhoAreYou","NGO");
        startActivity(intent);
    }
}