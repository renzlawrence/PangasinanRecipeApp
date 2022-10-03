package com.example.pangasinanrecipeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ProcessActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ProcessAdapter processAdapter;
    LinearLayoutManager manager;

    String[] process_description;
    int[] process_picture;

    private List<String> descriptionList;
    private List<Integer> processList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_process);

        descriptionList = new ArrayList<>();
        processList = new ArrayList<>();

        manager = new LinearLayoutManager(this);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(manager);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            process_description = extras.getStringArray("process_description");

            process_picture = extras.getIntArray("process_picture");

        }

        populateArrayLists(process_picture, process_description);
        loadProcess();


    }

    public void populateArrayLists(int[] picture, String[] desc) {

        for (int i = 0; i < picture.length; i++) {
            processList.add(picture[i]);
            descriptionList.add(desc[i]);


        }
    }

    public void loadProcess() {

        processAdapter = new ProcessAdapter(ProcessActivity.this, processList, descriptionList);
        recyclerView.setAdapter(processAdapter);
        processAdapter.notifyDataSetChanged();

    }
}