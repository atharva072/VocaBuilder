package com.example.android.flashcardsapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView barron333 = findViewById(R.id.barron333);
        barron333.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent barron333Intent = new Intent(MainActivity.this, Barrons333Words.class);
                startActivity(barron333Intent);
            }
        });

        TextView magoosh500 = findViewById(R.id.mag500);
        magoosh500.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mag500Intent = new Intent(MainActivity.this, Magoosh500Words.class);
                startActivity(mag500Intent);
            }
        });

        TextView manhattan500 = findViewById(R.id.manhattan500);
        manhattan500.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent man500Intent = new Intent(MainActivity.this, Manhattan500Words.class);
                startActivity(man500Intent);
            }
        });
    }
}