package com.wishwheels.www.hash2;

import android.content.Intent;
import android.media.Image;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;

public class splash extends AppCompatActivity {

    // Splash screen timer
    private static int SPLASH_TIME_OUT = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                Intent i = new Intent(splash.this, MainActivity.class);
                startActivity(i);

                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);
        fade();
    }
public  void fade() {
    ImageView imageView = (ImageView) findViewById(R.id.imgLogo);
    Animation animation = AnimationUtils.loadAnimation(splash.this, R.anim.animm);
    animation.setInterpolator(new LinearInterpolator());
    animation.setRepeatCount(Animation.INFINITE);
    animation.setDuration(700);
imageView.startAnimation(animation);


}
/*
    Animation animation = AnimationUtils.loadAnimation(this
            , R.anim.animm);
     logo

     //   animation.setInterpolator(new LinearInterpolator());
   //     animation.setRepeatCount(Animation.INFINITE);
        animation.setDuration(700);
*/


}