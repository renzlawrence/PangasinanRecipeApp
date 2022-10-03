package com.example.pangasinanrecipeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class NutritionFactsActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    NutritionsAdapter nutritionsAdapter;
    LinearLayoutManager manager;
    String[] ingredients_title;
    int[] ingredients_picture,nutrition_picture;

    private List<String> titleList;
    private List<Integer> pictureList;
    private List<Integer> nutritionList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrition_facts);
        titleList = new ArrayList<>();
        pictureList = new ArrayList<>();
        nutritionList = new ArrayList<>();

        manager = new LinearLayoutManager(this);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(manager);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {

            ingredients_title=extras.getStringArray("ingredients_title");
            ingredients_picture = extras.getIntArray("ingredients_picture");
            nutrition_picture = extras.getIntArray("nutrition_picture");

            //The key argument here must match that used in the other activity
        }
        populateArrayLists(ingredients_title,ingredients_picture,nutrition_picture);
        loadIngredients();


    }

    public void populateArrayLists(String[] title, int[] image,int[] nutrition ) {

        for (int i = 0; i < title.length; i++) {
            titleList.add(title[i]);
            pictureList.add(image[i]);
            nutritionList.add(nutrition[i]);

        }
    }

    public void loadIngredients() {

        nutritionsAdapter = new NutritionsAdapter(NutritionFactsActivity.this, titleList, pictureList , nutritionList);
        recyclerView.setAdapter(nutritionsAdapter);
        nutritionsAdapter.notifyDataSetChanged();

    }
}