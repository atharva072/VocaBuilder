package com.example.android.flashcardsapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class MDeckTwo extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mdeck2);
        call();
    }

    public void btnCorrectClick (View view) {
        setContentView(R.layout.mdeck2);
        call();
    }

    public void btnWrongClick (View view) {
        setContentView(R.layout.mdeck2);
        call();
    }

    private void call () {
        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("censure","to express strong disapproval"));
        words.add(new Word("",""));
        words.add(new Word("",""));
        words.add(new Word("",""));
        words.add(new Word("",""));
        words.add(new Word("",""));
        words.add(new Word("",""));
        words.add(new Word("",""));
        words.add(new Word("",""));
        words.add(new Word("",""));
        words.add(new Word("",""));
        words.add(new Word("",""));
        words.add(new Word("",""));
        words.add(new Word("",""));
        words.add(new Word("",""));
        words.add(new Word("",""));
        words.add(new Word("",""));
        words.add(new Word("",""));
        words.add(new Word("",""));
        words.add(new Word("",""));
        words.add(new Word("",""));
        words.add(new Word("",""));
        words.add(new Word("",""));
        words.add(new Word("",""));
        words.add(new Word("",""));
        words.add(new Word("",""));
        words.add(new Word("",""));
        words.add(new Word("",""));
        words.add(new Word("",""));
        words.add(new Word("",""));
        words.add(new Word("",""));
        words.add(new Word("",""));
        words.add(new Word("",""));
        words.add(new Word("",""));
        words.add(new Word("",""));
        words.add(new Word("",""));
        words.add(new Word("",""));
        words.add(new Word("",""));
        words.add(new Word("",""));
        words.add(new Word("",""));
        words.add(new Word("",""));
        words.add(new Word("",""));
        words.add(new Word("",""));
        words.add(new Word("",""));
        words.add(new Word("",""));
        words.add(new Word("",""));
        words.add(new Word("",""));
        words.add(new Word("",""));
        words.add(new Word("",""));
        words.add(new Word("",""));

        TextView meaningView = findViewById(R.id.word_meaning);
        meaningView.setVisibility(View.GONE);

        TextView textMessage = findViewById(R.id.text_message);
        textMessage.setVisibility(View.GONE);

        TextView btnCorrect = findViewById(R.id.button_right);
        btnCorrect.setVisibility(View.GONE);

        TextView btnWrong = findViewById(R.id.button_wrong);
        btnWrong.setVisibility(View.GONE);

        TextView meaning = (TextView) findViewById(R.id.cw_2_word_meaning);
        meaning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                meaningView.setVisibility(View.VISIBLE);
                textMessage.setVisibility(View.VISIBLE);
                btnCorrect.setVisibility(View.VISIBLE);
                btnWrong.setVisibility(View.VISIBLE);
                meaning.setVisibility(View.GONE);
            }
        });

        Random random = new Random();

        int number = random.nextInt(words.size());
        TextView quantityTextView = findViewById(R.id.cw_2_word);
        quantityTextView.setText(words.get(number).getWord());
        meaningView.setText(words.get(number).getMeaning());
    }
}
