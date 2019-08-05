package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ListFragment.ItemSelected {

    TextView tvDescription;
    String[] description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tvDescription = findViewById(R.id.tvDescription);
        description = getResources().getStringArray(R.array.descriptions);

        //phone in portrait mode
        if (findViewById(R.id.layout_portrait) != null) {
            FragmentManager manager = this.getSupportFragmentManager();
            manager.beginTransaction()
                    .hide(manager.findFragmentById(R.id.detailFragment))
                    .show(manager.findFragmentById(R.id.listFragment))
                    .commit();
        }

        //phone in landscape mode
        if (findViewById(R.id.layout_land) != null) {
            FragmentManager manager = this.getSupportFragmentManager();
            manager.beginTransaction()
                    .show(manager.findFragmentById(R.id.listFragment))
                    .show(manager.findFragmentById(R.id.detailFragment))
                    .commit();
        }
    }

    @Override
    public void onItemSelected(int index) {

        tvDescription.setText(description[index]);
        if (findViewById(R.id.layout_portrait) != null)
        {
            FragmentManager manager = this.getSupportFragmentManager();
            manager.beginTransaction()
                    .show(manager.findFragmentById(R.id.detailFragment))
                    .hide(manager.findFragmentById(R.id.listFragment))
                    .addToBackStack(null)
                    .commit();
        }
    }
}