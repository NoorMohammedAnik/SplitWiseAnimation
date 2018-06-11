package com.premier.splitwise;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

import com.premier.splitwise.login.LoginActivity;

import customfonts.MyTextView;

public class SplashScreenActivity extends AppCompatActivity {

    MyTextView txtAppName;

    public static int splashTimeOut=4000;  //time in mili seconds
    LinearLayout layout1,l2;
    Animation uptodown,downtoup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        txtAppName=(MyTextView) findViewById(R.id.txt_app_name);

        //Animate text in 360 degree in y axis
        txtAppName.animate().rotationY(360f).setDuration(3000);
        layout1 = (LinearLayout) findViewById(R.id.layout1);
       // l2 = (LinearLayout) findViewById(R.id.l2);
        uptodown = AnimationUtils.loadAnimation(this,R.anim.uptodown);
       // downtoup = AnimationUtils.loadAnimation(this,R.anim.downtoup);
        layout1.setAnimation(uptodown);
       // l2.setAnimation(downtoup);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(SplashScreenActivity.this,LoginActivity.class);
                startActivity(intent);

                finish();
            }
        },splashTimeOut);

    }
}
