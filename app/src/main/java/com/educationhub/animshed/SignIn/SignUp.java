package com.educationhub.animshed.SignIn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.educationhub.animshed.R;
import com.google.android.material.textfield.TextInputLayout;

public class SignUp extends AppCompatActivity {

    String helper = "Helper";
    ImageView signUpImage;
    TextView singupTextView;
    TextInputLayout userName,FullName
            ,phoneNumber,locationOfNGO;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        String whoAreYou = getIntent().getStringExtra("WhoAreYou");

        //hooks

        signUpImage = findViewById(R.id.signUpImageView);
        singupTextView = findViewById(R.id.signUpTextView);
        userName = findViewById(R.id.userName);
        FullName = findViewById(R.id.EnterFullName);
        phoneNumber = findViewById(R.id.userPhoneNumber);
        locationOfNGO = findViewById(R.id.locationOfNgo);



        if(whoAreYou.equals(helper)){
            Log.i("whoYouAre","Hlper");
            signUpImage.setImageResource(R.drawable.signup_screen);
            singupTextView.setText("Helper SignUp");
            singupTextView.setTextSize(32f);
            userName.setVisibility(View.VISIBLE);
        }else {
            signUpImage.setImageResource(R.drawable.ngo_singup);
            FullName.setHint("Name of NGO");
            phoneNumber.setHint("PhoneNumber of NGO");
            locationOfNGO.setVisibility(View.VISIBLE);
            locationOfNGO.setHint("Location Of NGO");

        }



    }

    public void haveAnAccount(View view) {
    }

    public void Next(View view) {
    }
}