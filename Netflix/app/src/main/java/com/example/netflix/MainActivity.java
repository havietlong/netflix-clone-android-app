package com.example.netflix;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Slide> lstSlides ;
    private ViewPager sliderPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sliderPager = findViewById(R.id.slider_pager);

        lstSlides = new ArrayList<>();
        lstSlides.add(new Slide(R.drawable.skyfall,"Sky Fall"));
        lstSlides.add(new Slide(R.drawable.thorragnarok,"Thor: Ragnarok"));
        lstSlides.add(new Slide(R.drawable.harrypotter,"Harry Potter"));

        SliderPagerAdapter adapter = new SliderPagerAdapter(this,lstSlides);

        sliderPager.setAdapter(adapter);

    }
}