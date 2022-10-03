package com.example.pangasinanrecipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class SingleNutritionActivity extends AppCompatActivity {
    ImageView img_nutrition;
    int pic_holder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_nutrition);
        img_nutrition = findViewById(R.id.img_nutrition);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            pic_holder = extras.getInt("nutritionPicture");



            //The key argument here must match that used in the other activity
        }

        img_nutrition.setImageResource(pic_holder);
    }
}