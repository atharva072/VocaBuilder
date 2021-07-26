package com.example.android.flashcardsapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Kaplan400Words extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kaplan400);

        TextView deck1 = findViewById(R.id.cw_1_practice_deck);
        deck1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent deckOneIntent = new Intent(Kaplan400Words.this, KapDeckOne.class);
                startActivity(deckOneIntent);
            }
        });

        TextView deck2 = findViewById(R.id.cw_2_practice_deck);
        deck2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent deckTwoIntent = new Intent(Kaplan400Words.this, KapDeckTwo.class);
                startActivity(deckTwoIntent);
            }
        });
    }
}
