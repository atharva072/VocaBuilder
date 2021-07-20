package com.example.android.flashcardsapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Barrons333Words extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.barrons333);

        TextView deck1 = findViewById(R.id.cw_1_practice_deck);
        deck1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent deckOneIntent = new Intent(Barrons333Words.this, BDeckOne.class);
                startActivity(deckOneIntent);
            }
        });

        TextView deck2 = findViewById(R.id.cw_2_practice_deck);
        deck2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent deckTwoIntent = new Intent(Barrons333Words.this, BDeckTwo.class);
                startActivity(deckTwoIntent);
            }
        });

        TextView deck3 = findViewById(R.id.cw_3_practice_deck);
        deck3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent deckThreeIntent = new Intent(Barrons333Words.this, BDeckThree.class);
                startActivity(deckThreeIntent);
            }
        });

        TextView deck4 = findViewById(R.id.cw_4_practice_deck);
        deck4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent deckFourIntent = new Intent(Barrons333Words.this, BDeckFour.class);
                startActivity(deckFourIntent);
            }
        });

        TextView deck5 = findViewById(R.id.cw_5_practice_deck);
        deck5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent deckFiveIntent = new Intent(Barrons333Words.this, BDeckFive.class);
                startActivity(deckFiveIntent);
            }
        });

        TextView deck6 = findViewById(R.id.cw_6_practice_deck);
        deck6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent deckSixIntent = new Intent(Barrons333Words.this, BDeckSix.class);
                startActivity(deckSixIntent);
            }
        });

        TextView deck7 = findViewById(R.id.cw_7_practice_deck);
        deck7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent deckSevenIntent = new Intent(Barrons333Words.this, BDeckSeven.class);
                startActivity(deckSevenIntent);
            }
        });
    }
}
