package com.example.pangasinanrecipeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private List<String> citiesList;

    RecyclerView recyclerView;
    CitiesAdapter citiesAdapter;
    LinearLayoutManager manager;
    ImageButton img_profile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img_profile = findViewById(R.id.img_profile);

        manager = new LinearLayoutManager(this);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(manager);


        loadCities();
        img_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, PersonMain.class);
                MainActivity.this.startActivity(i);
            }
        });
    }

    public void loadCities() {

        citiesList = new ArrayList<String>();
        citiesList.add("Dagupan");
        citiesList.add("Mangaldan");
        citiesList.add("Alaminos");
        citiesList.add("Bolinao");
        citiesList.add("Villasis");
        citiesList.add("Bayambang");
        citiesList.add("San Jacinto");
        citiesList.add("San Nicolas");
        citiesList.add("San Fabian");
        citiesList.add("Pozorrubio");
        citiesList.add("Mangatarem");
        citiesList.add("Infanta");
        citiesList.add("Calasiao");
        citiesList.add("Asingan");
        citiesList.add("Malasiqui");
        citiesList.add("Aguilar");
        citiesList.add("Tayug");
        citiesList.add("Sta Barbara");
        citiesList.add("Binalonan");
        citiesList.add("Alcala");



        Collections.sort(citiesList, String.CASE_INSENSITIVE_ORDER);

        citiesAdapter = new CitiesAdapter(MainActivity.this, citiesList);
        recyclerView.setAdapter(citiesAdapter);
        citiesAdapter.notifyDataSetChanged();

    }

}