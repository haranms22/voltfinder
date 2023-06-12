package com.example.voltfinder;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;

public class login extends AppCompatActivity {


    //Here we are setting animation delay time
    public static final int STARTUP_DELAY = 100;
    public static final int ANIM_ITEM_DURATION =450;
    public static final int EDITTEXT_DELAY = 190;
    public static final int BUTTON_DELAY = 200;
    public static final int VIEW_DELAY = 180;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ImageView logoImageView = findViewById(R.id.img_logo);
        ViewGroup container = findViewById(R.id.container);


        TextView button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_signup);
            }
        });
        Button login= findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View v){
                setContentView(R.layout.activity_crprofile);

            }
        });
        Button gos= findViewById(R.id.go);
        gos.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View v){
                setContentView(R.layout.activity_selectveh1);

            }
        });
        Button button5= findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View v){
                setContentView(R.layout.activity_profle);

            }
        });

        //Code for app logo animation
                ViewCompat.animate(logoImageView)
                        .translationY(-250)
                        .setStartDelay(STARTUP_DELAY)
                        .setDuration(ANIM_ITEM_DURATION).setInterpolator(
                                new DecelerateInterpolator(1.2f)).start();

        //Here we are setting animation on displaying content
        for (int i = 0; i < container.getChildCount(); i++) {
            View v = container.getChildAt(i);
            ViewPropertyAnimatorCompat viewAnimator;

            if (v instanceof EditText) {
                viewAnimator = ViewCompat.animate(v)
                        .scaleY(1).scaleX(1)
                        .setStartDelay((EDITTEXT_DELAY * i) + 200)
                        .setDuration(200);
            } else if (v instanceof Button) {
                viewAnimator = ViewCompat.animate(v)
                        .scaleY(1).scaleX(1)
                        .setStartDelay((BUTTON_DELAY * i) + 200)
                        .setDuration(200);
            } else {
                viewAnimator = ViewCompat.animate(v)
                        .translationY(50).alpha(1)
                        .setStartDelay((VIEW_DELAY * i) + 250)
                        .setDuration(450);
            }
            viewAnimator.setInterpolator(new DecelerateInterpolator()).start();
        }
    }
}