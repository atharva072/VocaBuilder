package com.example.android.flashcardsapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class KapDeckSix extends AppCompatActivity {
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kapdeck6);
        call();
    }

    public void btnCorrectClick (View view) {
        setContentView(R.layout.kapdeck6);
        call();
    }

    public void btnWrongClick (View view) {
        setContentView(R.layout.kapdeck6);
        call();
    }

    private void call () {
        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("RANCOR", "bitter hatred"));
        words.add(new Word("RAILLERY", "lighthearted jesting"));
        words.add(new Word("RACONTEUR", "a witty, skillful storyteller"));
        words.add(new Word("QUOTIDIAN", "occurring daily; commonplace"));
        words.add(new Word("QUERULOUS", "inclined to complain, irritable"));
        words.add(new Word("PUSILLANIMOUS", "cowardly"));
        words.add(new Word("PUNDIT", "an authority or critic"));
        words.add(new Word("PULCHRITUDE", "beauty"));
        words.add(new Word("PUERILE", "childish, immature, silly"));
        words.add(new Word("PRURIENT", "lustful, exhibiting lewd desires"));
        words.add(new Word("PROVINCIAL", "rustic, unsophisticated, limited in scope"));
        words.add(new Word("PROVIDENT", "prudent, frugal"));
        words.add(new Word("PROTAGONIST", "main character in a play or story, hero"));
        words.add(new Word("PROSTRATE", "lying face downward, lying flat on the ground"));
        words.add(new Word("PROSELYTIZE", "to induce someone to convert to a particular belief or religion"));
        words.add(new Word("PROPITIOUS", "favorable, advantageous"));
        words.add(new Word("PROPINQUITY", "nearness"));
        words.add(new Word("PROMULGATE", "to make known publicly"));
        words.add(new Word("PROLIX", "tedious; wordy"));
        words.add(new Word("PROLIFIC", "productive, fertile"));
        words.add(new Word("PROGNOSTICATE", "to predict"));
        words.add(new Word("PROGENITOR", "originator, forefather, ancestor in a direct line"));
        words.add(new Word("PROBITY", "honesty, high-mindedness"));
        words.add(new Word("PRIVATION", "lack of usual necessities or comforts"));
        words.add(new Word("PRESCIENT", "having foresight"));
        words.add(new Word("PREDILECTION", "preference, liking"));
        words.add(new Word("PRECURSOR", "forerunner, predecessor"));
        words.add(new Word("PRECEPT", "principle; law"));
        words.add(new Word("POSIT", "to put in position; to suggest an idea"));
        words.add(new Word("POLYGLOT", "speaker of many languages"));
        words.add(new Word("POLEMIC", "controversy, argument; verbal attack"));
        words.add(new Word("PNEUMATIC", "relating to air; worked by compressed air"));
        words.add(new Word("PLAUDIT", "applause"));
        words.add(new Word("PLANGENT", "resounding; plaintive"));
        words.add(new Word("PLAIT", "to braid"));
        words.add(new Word("PHILISTINE", "narrow-minded person, someone lacking appreciation for art or culture"));
        words.add(new Word("PHALANX", "massed group of soldiers, people, or things"));
        words.add(new Word("PERTINACIOUS", "persistent, stubborn"));
        words.add(new Word("PERSPICACIOUS", "shrewd, astute, keen-witted"));
        words.add(new Word("PERNICIOUS", "very harmful"));
        words.add(new Word("PERIPHRASTIC", "using circumlocution"));
        words.add(new Word("PERAMBULATE", "walk about"));
        words.add(new Word("PENUMBRA", "partial shadow"));
        words.add(new Word("PENULTIMATE", "next to last"));
        words.add(new Word("PENCHANT", "inclination"));
        words.add(new Word("PECCADILLO", "minor sin or offense"));
        words.add(new Word("PAUCITY", "scarcity, lack"));
        words.add(new Word("LICENTIOUS", "immoral; unrestrained by society"));
        words.add(new Word("LIBIDINOUS", "lustful"));
        words.add(new Word("LEXICON", "dictionary, list of words"));

        TextView meaningView = findViewById(R.id.word_meaning);
        meaningView.setVisibility(View.GONE);

        TextView textMessage = findViewById(R.id.text_message);
        textMessage.setVisibility(View.GONE);

        TextView btnCorrect = findViewById(R.id.button_right);
        btnCorrect.setVisibility(View.GONE);

        TextView btnWrong = findViewById(R.id.button_wrong);
        btnWrong.setVisibility(View.GONE);

        TextView meaning = (TextView) findViewById(R.id.cw_6_word_meaning);
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
        TextView quantityTextView = findViewById(R.id.cw_6_word);
        quantityTextView.setText(words.get(number).getWord());
        meaningView.setText(words.get(number).getMeaning());
    }
}
