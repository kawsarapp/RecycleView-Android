package com.jannat.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    ArrayList<String>CityNames=new ArrayList<>(Arrays.asList("DHAKA", "BARISHAL", "KHULNA", "RAJSAHI","DHAKA", "BARISHAL", "KHULNA", "RAJSAHI", "BARISHAL", "KHULNA", "RAJSAHI","DHAKA", "BARISHAL", "KHULNA", "RAJSAHI", "BARISHAL", "KHULNA", "RAJSAHI","DHAKA", "BARISHAL", "KHULNA", "RAJSAHI", "BARISHAL", "KHULNA", "RAJSAHI","DHAKA", "BARISHAL", "KHULNA", "RAJSAHI", "BARISHAL", "KHULNA", "RAJSAHI","DHAKA", "BARISHAL", "KHULNA", "RAJSAHI", "KURIGRAM"));



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView RV=(RecyclerView) findViewById(R.id.recycleViewId);
        RV.setLayoutManager(new LinearLayoutManager(this));

        MyAdapter adapt=new MyAdapter(this,CityNames);
        RV.setAdapter(adapt);



    }
}