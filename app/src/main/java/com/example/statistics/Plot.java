package com.example.statistics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Plot extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plot);
        Bundle bundle = getIntent().getExtras();
        String location = bundle.getString("Location");
        String date_from = bundle.getString("Date from");
        String date_to = bundle.getString("Date to");

        System.out.println(location);
        System.out.println(date_from);
        System.out.println(date_to);



    }
}
