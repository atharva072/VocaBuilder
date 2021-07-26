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

        TextView deck3 = findViewById(R.id.cw_3_practice_deck);
        deck3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent deckThreeIntent = new Intent(Kaplan400Words.this, KapDeckThree.class);
                startActivity(deckThreeIntent);
            }
        });

        TextView deck4 = findViewById(R.id.cw_4_practice_deck);
        deck4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent deckFourIntent = new Intent(Kaplan400Words.this, KapDeckFour.class);
                startActivity(deckFourIntent);
            }
        });

        TextView deck5 = findViewById(R.id.cw_5_practice_deck);
        deck5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent deckFiveIntent = new Intent(Kaplan400Words.this, KapDeckFive.class);
                startActivity(deckFiveIntent);
            }
        });

        TextView deck6 = findViewById(R.id.cw_6_practice_deck);
        deck6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent deckSixIntent = new Intent(Kaplan400Words.this, KapDeckSix.class);
                startActivity(deckSixIntent);
            }
        });

        TextView deck7 = findViewById(R.id.cw_7_practice_deck);
        deck7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent deckSevenIntent = new Intent(Kaplan400Words.this, KapDeckSeven.class);
                startActivity(deckSevenIntent);
            }
        });

        TextView deck8 = findViewById(R.id.cw_8_practice_deck);
        deck8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent deckEightIntent = new Intent(Kaplan400Words.this, KapDeckEight.class);
                startActivity(deckEightIntent);
            }
        });
    }
}
