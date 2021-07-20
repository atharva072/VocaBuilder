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
    }
}