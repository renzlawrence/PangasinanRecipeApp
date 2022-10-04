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

        PersonObject p1 =new PersonObject(R.drawable.profile_1,"Michael Kearney C. Lameg","Age: 20","Libsong East, Lingayen Pangasinan","michaelameg08@gmail.com","09469938801");
        personObjectList.add(p1);
        PersonObject p2 =new PersonObject(R.drawable.profile_2,"Franz Gian Lee T. Estrada","Age: 19","Bliss Libsong East, Lingayen Pangasinan","supra6194@gmail.com","09770990531");
        personObjectList.add(p2);
        PersonObject p3 =new PersonObject(R.drawable.profile_3,"Gester Luis M. Luchavez","Age: 19","Libsong east, Lingayen Pangasinan","gesterluisluchavez@gmail.com","09754844256");
        personObjectList.add(p3);
        PersonObject p4 =new PersonObject(R.drawable.profile_4,"Denz Bernardo Tumbaga","Age: 19","Inoman Pozorrubip Pangasinan","tumbagadenz@gmail.com","09951164670");
        personObjectList.add(p4);
        PersonObject p5 =new PersonObject(R.drawable.profile_5,"Charles Andrei J. Bautista","Age: 19","Nama Pozorrubio Pangasinan","charlesandreibautista482@gmail.com","09455511834");
        personObjectList.add(p5);
        PersonObject p6 =new PersonObject(R.drawable.profile_6,"Nathaniel Erik T. De Guzman","Age: 19","Rosario, Pozorubbio Pangasinan","nathanielerik19@gmail.com","09475587132");
        personObjectList.add(p6);

        personAdapter = new PersonAdapter(personObjectList, PersonList.this);
        recyclerView.setAdapter(personAdapter);
        personAdapter.notifyDataSetChanged();
    }
}