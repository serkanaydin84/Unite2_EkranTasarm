package com.example.nite_2ekrantasarm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnUyg3;
    Button btnUyg4;
    Button btnUyg5;
    Button btnUyg8;
    Button btnUyg9;
    Button btnUyg10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnUyg3 = (Button) findViewById(R.id.btnUyg3);
        btnUyg4 = findViewById(R.id.btnUyg4);
        btnUyg5 = findViewById(R.id.btnUyg5);
        btnUyg8 = findViewById(R.id.btnUyg8);
        btnUyg9 = findViewById(R.id.btnUyg9);
        btnUyg10 = findViewById(R.id.btnUyg10);

        btnUyg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent showUyg3 =  new Intent(MainActivity.this, Uyg3Activity.class);
                startActivity(showUyg3);
            }
        });

        btnUyg4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent showUyg4 = new Intent(MainActivity.this, Uyg4Activity.class);
                startActivity(showUyg4);
            }
        });

        btnUyg5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent showUyg5 = new Intent(MainActivity.this, Uyg5Activity.class);
                startActivity(showUyg5);
            }
        });

        btnUyg8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent showUyg8 = new Intent(MainActivity.this, Uyg8Activity.class);
                startActivity(showUyg8);
            }
        });

        btnUyg9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent showUyg9 = new Intent(MainActivity.this, Uyg9Activity.class);
                startActivity(showUyg9);
            }
        });
    }
}