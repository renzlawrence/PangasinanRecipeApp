package com.example.pangasinanrecipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashScreenActivity extends AppCompatActivity {

    /** Duration of wait **/
    private final int SPLASH_DISPLAY_LENGTH = 3000;
    ImageView img_pangasinan;
    Animation anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        img_pangasinan = findViewById(R.id.img_pangasinan);

         anim=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
        img_pangasinan.startAnimation(anim);
        final Handler handler=new Handler();

        handler.postDelayed(new Runnable(){

            @Override
            public void run() {
                img_pangasinan.setImageResource(R.drawable.pangasinan_logo2);//changing to different image ,here you will set image that you have loaded
                anim= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
                img_pangasinan.startAnimation(anim);
            }

        },1000);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(SplashScreenActivity.this,MainActivity.class);
                SplashScreenActivity.this.startActivity(mainIntent);
                SplashScreenActivity.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}