package com.example.pangasinanrecipeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class IngredientsActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    IngredientsAdapter ingredientsAdapter;
    LinearLayoutManager manager;

    String city_name;

    String[] ingredients_title, ingredients_description,process_description;
    int[] ingredients_picture,nutrition_picture,about_product,process_picture;

    private List<String> titleList;
    private List<String> descriptionList;
    private List<Integer> pictureList;
    private List<Integer> nutritionList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingredients);

        titleList = new ArrayList<>();
        descriptionList = new ArrayList<>();
        pictureList = new ArrayList<>();
        nutritionList = new ArrayList<>();

        manager = new LinearLayoutManager(this);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(manager);


        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            city_name = extras.getString("city_name");
            ingredients_title=extras.getStringArray("ingredients_title");
            ingredients_description=extras.getStringArray("ingredients_description");
            ingredients_picture = extras.getIntArray("ingredients_picture");
            nutrition_picture = extras.getIntArray("nutrition_picture");
            about_product = extras.getIntArray("about_product");
            process_picture = extras.getIntArray("process_picture");
            process_description=extras.getStringArray("process_description");

        }

        populateArrayLists(ingredients_title,ingredients_description,ingredients_picture,nutrition_picture);
        loadIngredients();


    }

    public void populateArrayLists(String[] title, String[] description, int[] image,int[] nutrition ) {

        for (int i = 0; i < title.length; i++) {
            titleList.add(title[i]);
            descriptionList.add(description[i]);
            pictureList.add(image[i]);
            nutritionList.add(nutrition[i]);

        }
    }

    public void loadIngredients() {

        ingredientsAdapter = new IngredientsAdapter(IngredientsActivity.this, titleList,descriptionList, pictureList , nutritionList);
        recyclerView.setAdapter(ingredientsAdapter);
        ingredientsAdapter.notifyDataSetChanged();

    }
}