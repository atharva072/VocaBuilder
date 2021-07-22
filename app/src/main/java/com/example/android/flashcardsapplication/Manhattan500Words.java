package com.example.android.flashcardsapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Manhattan500Words extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manhattan500);

        TextView deck1 = findViewById(R.id.cw_1_practice_deck);
        deck1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent deckOneIntent = new Intent(Manhattan500Words.this, ManDeckOne.class);
                startActivity(deckOneIntent);
            }
        });

        TextView deck2 = findViewById(R.id.cw_2_practice_deck);
        deck2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent deckTwoIntent = new Intent(Manhattan500Words.this, ManDeckTwo.class);
                startActivity(deckTwoIntent);
            }
        });

        TextView deck3 = findViewById(R.id.cw_3_practice_deck);
        deck3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent deckThreeIntent = new Intent(Manhattan500Words.this, ManDeckThree.class);
                startActivity(deckThreeIntent);
            }
        });

        TextView deck4 = findViewById(R.id.cw_4_practice_deck);
        deck4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent deckFourIntent = new Intent(Manhattan500Words.this, ManDeckFour.class);
                startActivity(deckFourIntent);
            }
        });

        TextView deck5 = findViewById(R.id.cw_5_practice_deck);
        deck5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent deckFiveIntent = new Intent(Manhattan500Words.this, ManDeckFive.class);
                startActivity(deckFiveIntent);
            }
        });

        TextView deck6 = findViewById(R.id.cw_6_practice_deck);
        deck6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent deckSixIntent = new Intent(Manhattan500Words.this, ManDeckSix.class);
                startActivity(deckSixIntent);
            }
        });
    }
}
