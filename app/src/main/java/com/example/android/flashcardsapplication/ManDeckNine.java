package com.example.android.flashcardsapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class ManDeckNine extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mandeck9);
        call();
    }

    public void btnCorrectClick (View view) {
        setContentView(R.layout.mandeck9);
        call();
    }

    public void btnWrongClick (View view) {
        setContentView(R.layout.mandeck9);
        call();
    }

    private void call () {
        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("husband", "Manage prudently, sparingly, or economically; conserve"));
        words.add(new Word("hotly", "In an intense, fiery, or heated way"));
        words.add(new Word("hoodwink", "Trick, deceive"));
        words.add(new Word("homage", "Honor or respect demonstrated publicly"));
        words.add(new Word("hoary", "Very old, gray or white as from old age"));
        words.add(new Word("hew", "Strike, chop, or hack"));
        words.add(new Word("hermetic", "Airtight, sealed, isolated; reclusive"));
        words.add(new Word("hegemony", "Domination, authority"));
        words.add(new Word("hedge", "Avoid commitment by leaving provisions for withdrawal or changing one's mind"));
        words.add(new Word("harrow", "Farming tool that breaks up soil"));
        words.add(new Word("harangue", "Long, intense verbal attack, esp. when delivered publicly"));
        words.add(new Word("hapless", "Unlucky, unfortunate"));
        words.add(new Word("hand-wringing", "Grasping, squeezing"));
        words.add(new Word("hallmark", "A mark indicating quality, purity, genuineness"));
        words.add(new Word("halcyon", "Calm and peaceful, carefree; prosperous"));
        words.add(new Word("grovel", "Creep or crawl with one's face to the ground"));
        words.add(new Word("grouse", "Complain or grumble"));
        words.add(new Word("grievous", "Causing grief or suffering; very serious"));
        words.add(new Word("grating", "Irritating; harsh or discordant"));
        words.add(new Word("grandstand", "Perform showily in an attempt to impress onlookers"));
        words.add(new Word("grandiloquent", "Relating to lofty speech, esp. to the point of being pompous, overblown, bombastic"));
        words.add(new Word("fervid", "Very hot; heated in passion or enthusiasm"));
        words.add(new Word("felicitous", "Admirably appropriate, very well-suited for the occasion"));
        words.add(new Word("fecund", "Fruitful, fertile"));
        words.add(new Word("fawn", "try to win favor through flattery and submissive behavior"));
        words.add(new Word("fatuous", "Foolish, silly, esp. in a smug or complacent manner"));
        words.add(new Word("fastidious", "meticulous, requiring excessive attention to detail"));
        words.add(new Word("fallow", " not in use"));
        words.add(new Word("faction", "Group or clique within a larger organization"));
        words.add(new Word("extemporaneous", "spoken without preparation"));
        words.add(new Word("expurgate", "Censor; remove objectionable or offensive parts"));
        words.add(new Word("expedient", "Suitable, proper; effective"));
        words.add(new Word("exonerate", "Clear from blame or accusation; free from a responsibility"));
        words.add(new Word("exigent", "Requiring immediate attention, action, or aid; excessively demanding"));
        words.add(new Word("euphony", "Pleasing or sweet sound, especially as formed by a harmonious use of words"));
        words.add(new Word("euphemism", "Substitution of a mild, inoffensive, or indirect expression"));
        words.add(new Word("ethos", "The character, personality, or moral values specific to a person, group, time period"));
        words.add(new Word("erstwhile", "Former, previous (adj); in the past, formerly"));
        words.add(new Word("ersatz", "Artificial, synthetic; being an inferior substitute"));
        words.add(new Word("equivocate", "Use unclear language to deceive or avoid committing to a position"));
        words.add(new Word("equanimity", "Composure, evenness of mind; mental or emotional stability, esp. under stress"));
        words.add(new Word("epicure", "Person with cultivated, refined tastes, esp. in food and wine"));
        words.add(new Word("disparage", "Belittle, put down; bring shame upon, discredit"));
        words.add(new Word("discrete", "Separate, distinct, detached, existing as individual parts"));
        words.add(new Word("discordant", "Harsh or inharmonious in sound; disagreeing, incongruous"));
        words.add(new Word("discomfiting", "Disconcerting, confusing, frustrating"));
        words.add(new Word("dirge", "A funeral or mourning song or poem"));
        words.add(new Word("dilettante", "Person who takes up an art or activity for amusement only or in a superficial way"));
        words.add(new Word("dilatory", "Slow, late; procrastinating or stalling for time"));
        words.add(new Word("dilate", "To become wider or make wider, cause to expand"));

        TextView meaningView = findViewById(R.id.word_meaning);
        meaningView.setVisibility(View.GONE);

        TextView textMessage = findViewById(R.id.text_message);
        textMessage.setVisibility(View.GONE);

        TextView btnCorrect = findViewById(R.id.button_right);
        btnCorrect.setVisibility(View.GONE);

        TextView btnWrong = findViewById(R.id.button_wrong);
        btnWrong.setVisibility(View.GONE);

        TextView meaning = (TextView) findViewById(R.id.cw_9_word_meaning);
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
        TextView quantityTextView = findViewById(R.id.cw_9_word);
        quantityTextView.setText(words.get(number).getWord());
        meaningView.setText(words.get(number).getMeaning());
    }
}
