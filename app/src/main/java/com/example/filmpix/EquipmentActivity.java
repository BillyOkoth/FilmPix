package com.example.filmpix;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import com.example.filmpix.EquipmentAdapter;
import  com.example.filmpix.R;

public class EquipmentActivity extends AppCompatActivity {


    //a list to store all the products
    List<Equipment> productList;

    //the recyclerview
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equipment);

        //getting the recyclerview from xml
//        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //initializing the productlist
        productList = new ArrayList<>();


        //adding some items to our list
        productList.add(
                new Equipment(
                        1,
                        "Zenit camera - (24.1 mp Canon)",
                        "24.1 MP, Black, Native ISO Range",
                        4.6,
                        60000,
                        R.drawable.zenitcamera));

        productList.add(
                new Equipment(
                        1,
                        "Tripod - (Pro-foto)",
                        "2 metres, Black, 1.20 kg",
                        4.3,
                        10000,
                        R.drawable.tripod));

        productList.add(
                new Equipment(
                        1,
                        "Microphone Lapelle - (Seinheisser Mics)",
                        "40-18000 Hz, Black, 0.5 kg",
                        4.5,
                        2000,
                        R.drawable.mic));

        //creating recyclerview adapter
        EquipmentAdapter adapter = new EquipmentAdapter(this, productList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);
    }
}