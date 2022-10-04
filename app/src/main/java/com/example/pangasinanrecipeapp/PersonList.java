package com.example.pangasinanrecipeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Person;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class PersonList extends AppCompatActivity {

    RecyclerView recyclerView;
    PersonAdapter personAdapter;
    LinearLayoutManager manager;
    private List<PersonObject> personObjectList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person_list);

        manager = new LinearLayoutManager(this);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(manager);
        personObjectList = new ArrayList<>();

        showPersons();



    }

    public void showPersons(){

        PersonObject p1 =new PersonObject(R.drawable.ic_baseline_person_account_24,"Michael Kearney C. Lameg","Age: 23","Libsong East Lingayen Pangasinan","michaelameg08@gmail.com","09469938801");
        personObjectList.add(p1);
        PersonObject p2 =new PersonObject(R.drawable.ic_baseline_person_account_24,"Franz Gian Lee T. Estrada","19","2","2","2");
        personObjectList.add(p2);
        PersonObject p3 =new PersonObject(R.drawable.ic_baseline_person_account_24,"Gester Luis M. Luchavez","19","3","3","3");
        personObjectList.add(p3);
        PersonObject p4 =new PersonObject(R.drawable.ic_baseline_person_account_24,"Denz Bernardo Tumbaga","19","4","4","4");
        personObjectList.add(p4);
        PersonObject p5 =new PersonObject(R.drawable.ic_baseline_person_account_24,"Charles Andrei J. Bautista","19","5","5","5");
        personObjectList.add(p5);
        PersonObject p6 =new PersonObject(R.drawable.ic_baseline_person_account_24,"Nathaniel Erik T. De Guzman","19","6","6","6");
        personObjectList.add(p6);

        personAdapter = new PersonAdapter(personObjectList, PersonList.this);
        recyclerView.setAdapter(personAdapter);
        personAdapter.notifyDataSetChanged();
    }
}