package com.example.android.flashcardsapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class ManDeckFour extends AppCompatActivity {
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mandeck4);
        call();
    }

    public void btnCorrectClick (View view) {
        setContentView(R.layout.mandeck4);
        call();
    }

    public void btnWrongClick (View view) {
        setContentView(R.layout.mandeck4);
        call();
    }

    private void call () {
        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("machination", "Crafty schemes or plots"));
        words.add(new Word("maelstrom", "Violent whirlpool; any chaotic, turbulent situation"));
        words.add(new Word("magnanimous", "generous in forgiving others"));
        words.add(new Word("magnate", "Very important or influential person, especially in business"));
        words.add(new Word("myopic", "lacking long-term thinking, short-sighted"));
        words.add(new Word("nadir", "Lowest point"));
        words.add(new Word("neologism", "New word or phrase"));
        words.add(new Word("neophyte", "Beginner, novice"));
        words.add(new Word("nettle", "Irritate, sting, or annoy"));
        words.add(new Word("noisome", "Offensive, disgusting; harmful"));
        words.add(new Word("nominal", "Trivial, so small as to be unimportant"));
        words.add(new Word("nontrivial", "Important or big enough to matter"));
        words.add(new Word("normative", "Implying or attempting to establish a norm"));
        words.add(new Word("obdurate", "Stubborn"));
        words.add(new Word("oblique", "Slanting or sloping; indirect, misleading, or evasive"));
        words.add(new Word("occlude", "Stop up, close, shut in or shut off"));
        words.add(new Word("opine", "Express an opinion"));
        words.add(new Word("opprobrium", "Disgrace and disapproval that result from outrageously shameful actions"));
        words.add(new Word("orotund", "Full, rich, and clear; pompous, bombastic"));
        words.add(new Word("ossify", "become inflexible in attitudes, opinions"));
        words.add(new Word("ostensible", "Professed, evident, or pretended"));
        words.add(new Word("ostentatious", "Pretentious, boastful showiness"));
        words.add(new Word("overwrought", "Overly nervous, agitated, or excited"));
        words.add(new Word("palatial", "Suitable for or resembling a palace, magnificent"));
        words.add(new Word("palliate", "Make less serious or severe; relieve symptoms of an illness"));
        words.add(new Word("pallid", "Abnormally pale (as skin); lacking color or vitality"));
        words.add(new Word("panache", "Flair, style, swagger; a flamboyant or grand way of acting"));
        words.add(new Word("panegyric", "Formal or lofty expression of praise"));
        words.add(new Word("panoply", "Splendid, wide-ranging, impressive display"));
        words.add(new Word("paragon", "Model of excellence, perfect example"));
        words.add(new Word("plethora", "Excess; excessive amount"));
        words.add(new Word("plucky", "Brave, spirited"));
        words.add(new Word("plutocracy", "Rule by the wealthy"));
        words.add(new Word("polemic", "Controversial argument, esp. one attacking a specific idea"));
        words.add(new Word("politic", "Shrewd, pragmatic; tactful or diplomatic"));
        words.add(new Word("polyglot", "a person who knows several languages"));
        words.add(new Word("posit", "Presume, suggest, put forward"));
        words.add(new Word("prattle", "Talk in an idle, simple-minded, meaningless, or foolish way"));
        words.add(new Word("precipitate", "Cause to happen suddenly or prematurely"));
        words.add(new Word("précis", "Concise summary, abstract"));
        words.add(new Word("predilection", "Preference, tendency or favorability towards"));
        words.add(new Word("prescient", "Having foreknowledge or foresight, seeing the future"));
        words.add(new Word("preternatural", "Supernatural, exceptional"));
        words.add(new Word("prevaricate", "Stray from the truth, mislead, lie"));
        words.add(new Word("primacy", "The state of being first or most important"));
        words.add(new Word("proclivity", "Inclination, natural tendency"));
        words.add(new Word("prolix", "Excessively long and wordy"));
        words.add(new Word("propagate", "Reproduce, spread, increase"));
        words.add(new Word("propensity", "Natural inclination or tendency"));
        words.add(new Word("prophetic", "Relating to prophesy, predicting, ominous"));

        TextView meaningView = findViewById(R.id.word_meaning);
        meaningView.setVisibility(View.GONE);

        TextView textMessage = findViewById(R.id.text_message);
        textMessage.setVisibility(View.GONE);

        TextView btnCorrect = findViewById(R.id.button_right);
        btnCorrect.setVisibility(View.GONE);

        TextView btnWrong = findViewById(R.id.button_wrong);
        btnWrong.setVisibility(View.GONE);

        TextView meaning = (TextView) findViewById(R.id.cw_4_word_meaning);
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
        TextView quantityTextView = findViewById(R.id.cw_4_word);
        quantityTextView.setText(words.get(number).getWord());
        meaningView.setText(words.get(number).getMeaning());
    }
}
