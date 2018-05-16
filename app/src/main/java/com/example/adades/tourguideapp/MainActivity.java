package com.example.adades.tourguideapp;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Setting the content of this activity to activity_main
        setContentView(R.layout.activity_main);

        // Creating a new View Pager Object
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Creating the adapter for the tabs
        CategoryAdapter adapter = new CategoryAdapter(this, getSupportFragmentManager());

        // Setting the adapter
        viewPager.setAdapter(adapter);

        // Adding everything to the Tab Layout
        TabLayout tableLayout = findViewById(R.id.tabs);

        // Connecting Tab Layout with View Pager
        tableLayout.setupWithViewPager(viewPager);


    }
}
