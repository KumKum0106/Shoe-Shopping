package com.example.shoeshopping;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.shoeshopping.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MenShopping extends AppCompatActivity {
    RecyclerView recyclerView2;
    ImageView backImg;
    ArrayList<RecyclerData> recyclerDataArrayList;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_men_shopping);

        backImg = findViewById(R.id.backimg1);
        backImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        recyclerView2 = findViewById(R.id.recyclerView2);
        recyclerDataArrayList = new ArrayList<>();
        recyclerDataArrayList.add(new RecyclerData("Air Jordan 1 University Gold and Light",1200, R.drawable.one, 4));
        recyclerDataArrayList.add(new RecyclerData("Air Jordan 1 Mid Paris ",1350, R.drawable.two, 5));
        recyclerDataArrayList.add(new RecyclerData("Air Jordan 1 Mid SE ",950, R.drawable.three, 4));
        recyclerDataArrayList.add(new RecyclerData("Reebok NANO X Shoes ",1250, R.drawable.four, 5));
        recyclerDataArrayList.add(new RecyclerData("Classic Leather legacy Shoes",1300, R.drawable.five, 5));
        recyclerDataArrayList.add(new RecyclerData("Reebok NANO X Shoes",1000, R.drawable.six, 5));

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(recyclerDataArrayList,this);

        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);

        recyclerView2.setLayoutManager(layoutManager);
        recyclerView2.setAdapter(adapter);
    }
}