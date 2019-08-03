package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tvDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tvDescription = findViewById(R.id.tvDescription);
        ArrayList<String> description = new ArrayList<String>();
        description.add("Description 1!");
        description.add("Description 2!");
        description.add("Description 3!");



    }
}
