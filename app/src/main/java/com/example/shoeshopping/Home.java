package com.example.shoeshopping;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;

import com.example.shoeshopping.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class Home extends AppCompatActivity {
    CardView cardView1, cardView2;

    RecyclerView recyclerView;
    ArrayList<RecyclerData> recyclerDataArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        cardView1 = findViewById(R.id.cardview2);
        cardView2 = findViewById(R.id.cardview3);

        recyclerView = findViewById(R.id.recyclerView);

        recyclerDataArrayList = new ArrayList<>();
        recyclerDataArrayList.add(new RecyclerData("Air Jordan Gold",1200, R.drawable.one, 4));
        recyclerDataArrayList.add(new RecyclerData("Jordan Mid Paris ",1350, R.drawable.two, 5));
        recyclerDataArrayList.add(new RecyclerData("Jordan Mid SE ",950, R.drawable.three, 4));
        recyclerDataArrayList.add(new RecyclerData("Reebok NANO",1250, R.drawable.four, 5));
        recyclerDataArrayList.add(new RecyclerData("Classic Leather",1300, R.drawable.five, 5));
        recyclerDataArrayList.add(new RecyclerData("Reebok NANO",1000, R.drawable.six, 5));

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(recyclerDataArrayList,this);

        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, MenShopping.class);
                startActivity(intent);
            }
        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Home.this, WomenShopping.class);
                startActivity(intent2);
            }
        });


    }
}