package com.example.android.flashcardsapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Magoosh500Words extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.magoosh500);

        TextView deck1 = findViewById(R.id.cw_1_practice_deck);
        deck1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent deckOneIntent = new Intent(Magoosh500Words.this, MDeckOne.class);
                startActivity(deckOneIntent);
            }
        });
    }
}
