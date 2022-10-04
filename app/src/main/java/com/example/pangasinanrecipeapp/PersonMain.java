package com.example.pangasinanrecipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PersonMain extends AppCompatActivity {
    Button btn_capture,btn_send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person_main);
        btn_capture = findViewById(R.id.btn_capture);
        btn_send = findViewById(R.id.btn_send);
        btn_capture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PersonMain.this, PersonList.class);
                PersonMain.this.startActivity(i);
            }
        });

        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PersonMain.this, "Sent. Thank you for your feedback.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}