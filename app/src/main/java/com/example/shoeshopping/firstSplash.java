package com.example.shoeshopping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class firstSplash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_splash);
        View mainLayout = findViewById(android.R.id.content);
        mainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start ActivityFirst when the screen is clicked/touched
                Intent intent = new Intent(firstSplash.this, secondSplash.class);
                startActivity(intent);
            }
        });
    }
}