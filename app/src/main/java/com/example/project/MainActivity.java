package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = findViewById(R.id.TabHost);
        tabHost.setup();

        TabHost.TabSpec tabSpecCat = tabHost.newTabSpec("CAT").setIndicator("", getResources().getDrawable(R.drawable.widget_cat));
        tabSpecCat.setContent(R.id.cat);
        tabHost.addTab(tabSpecCat);

        TabHost.TabSpec tabSpecDog = tabHost.newTabSpec("DOG").setIndicator("", getResources().getDrawable(R.drawable.widget_dog));
        tabSpecDog.setContent(R.id.dog);
        tabHost.addTab(tabSpecDog);

        TabHost.TabSpec tabSpecRabbit = tabHost.newTabSpec("RABBIT").setIndicator("", getResources().getDrawable(R.drawable.widget_rabbit));
        tabSpecRabbit.setContent(R.id.rabbit);
        tabHost.addTab(tabSpecRabbit);

        TabHost.TabSpec tabSpecHorse = tabHost.newTabSpec("HORSE").setIndicator("", getResources().getDrawable(R.drawable.widget_horse));
        tabSpecHorse.setContent(R.id.horse);
        tabHost.addTab(tabSpecHorse);

        tabHost.setCurrentTab(0);
    }
}