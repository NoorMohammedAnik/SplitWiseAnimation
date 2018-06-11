package com.premier.splitwise.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.premier.splitwise.R;
import com.premier.splitwise.signup.SignUpActivity;

public class LoginActivity extends AppCompatActivity {

    TextView txtLogin,txtCreate;
    //for left to right animation
    Animation lefttoright,downtoup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        txtLogin=(TextView)findViewById(R.id.txt_login);
        txtCreate=(TextView)findViewById(R.id.txt_create);

        //for screenshot protection.user can not take screenshot of this activity
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);

        final Animation animTranslate = AnimationUtils.loadAnimation(this,
                R.anim.anim_translate);

        lefttoright = AnimationUtils.loadAnimation(this,R.anim.anim_translate);

        txtLogin.setAnimation(lefttoright);

        txtLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(animTranslate);

            }
        });



        txtCreate.setAnimation(lefttoright);
        txtCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                view.startAnimation(animTranslate);
                Intent intent=new Intent(LoginActivity.this, SignUpActivity.class);
                startActivity(intent);

            }
        });
    }
}
