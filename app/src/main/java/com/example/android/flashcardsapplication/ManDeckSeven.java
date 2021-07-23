package com.example.android.flashcardsapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class ManDeckSeven extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mandeck7);
        call();
    }

    public void btnCorrectClick (View view) {
        setContentView(R.layout.mandeck7);
        call();
    }

    public void btnWrongClick (View view) {
        setContentView(R.layout.mandeck7);
        call();
    }

    private void call () {
        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("stasis", "Equilibrium, a state of balance or inactivity"));
        words.add(new Word("squelch", "Crush, squash; suppress or silence"));
        words.add(new Word("squalid", "Disgusting, filthy, foul, extremely neglected"));
        words.add(new Word("revamp", "Renovate, redo, revise, restructuring, upgrade"));
        words.add(new Word("resurgent", "Having a revival, renewing, rising or surging again"));
        words.add(new Word("reprobate", "Disreputable, unprincipled, or damned person"));
        words.add(new Word("repose", "The act or state of resting; peacefulness, tranquility"));
        words.add(new Word("repertoire", "Pertaining to a repertory or repertoire, a stock of available things or a number of theatrical performances presented regularly or in sequence"));
        words.add(new Word("repast", "to eat or feast"));
        words.add(new Word("rend", "Tear violently, pull apart, split, or tear away"));
        words.add(new Word("rejoinder", "Response or reply, esp. a witty comeback"));
        words.add(new Word("refulgent", "Shining, radiant"));
        words.add(new Word("refractory", "Stubbornly disobedient, hard to manage"));
        words.add(new Word("redress", "compensation or relief for injury or wrongdoing"));
        words.add(new Word("redound", "To have a good or bad effect"));
        words.add(new Word("recrudescent", "Revival, breaking out into renewed activity"));
        words.add(new Word("recondite", "Not easily understood, hidden, dealing with an obscure topic"));
        words.add(new Word("recapitulate", "Summarize, repeat in a concise way"));
        words.add(new Word("recant", "Withdraw, retract, or disavow something one has previously said, esp. formally"));
        words.add(new Word("recalcitrant", "Not obedient, resisting authority, hard to manage"));
        words.add(new Word("reactant", "Something that reacts; a substance that undergoes a change in a chemical reaction"));
        words.add(new Word("rarefied", "Make more subtle or refined"));
        words.add(new Word("raconteur", "Witty storyteller"));
        words.add(new Word("quixotic", "Extremely impractical but very romantic, chivalrous, or idealistic; impulsive"));
        words.add(new Word("quiescent", "Quiet, still"));
        words.add(new Word("querulous", "Given to complaining, grumbling"));
        words.add(new Word("pusillanimous", "Cowardly, timid"));
        words.add(new Word("plebeian", "Of the common people"));
        words.add(new Word("platitude", "A shallow, overused statement; cliche"));
        words.add(new Word("phlegmatic", "Apathetic, sluggish, not easily excited or made emotional"));
        words.add(new Word("philistine", "Person deficient in or hostile to culture"));
        words.add(new Word("phalanx", "Formation of soldiers carrying shields close together for defense"));
        words.add(new Word("perspicacious", "Having penetrating insight or good discernment"));
        words.add(new Word("pernicious", "Very harmful or destructive, deadly"));
        words.add(new Word("peripatetic", "Journeying from place to place; traveling on foot"));
        words.add(new Word("perfunctory", "Done superficially, without much care, or merely as routine"));
        words.add(new Word("perennial", "Lasting through the years or indefinitely, enduring; recurring"));
        words.add(new Word("peregrinate", "Travel from place to place, esp. on foot"));
        words.add(new Word("penury", "Extreme poverty or scarcity"));
        words.add(new Word("penumbra", "Outer part of a shadow from an eclipse; any surrounding region, fringe, periphery"));
        words.add(new Word("penitent", "Regretful, feeling remorse for one's sins or misdeeds"));
        words.add(new Word("pellucid", "Transparent, translucent; clear, easy to understand"));
        words.add(new Word("pejorative", "Disparaging, derogatory, belittling"));
        words.add(new Word("peddle", "Travel around while selling; sell illegally; give out or disseminate"));
        words.add(new Word("pedant", "Person who pays excessive attention to book learning and rules"));
        words.add(new Word("pathogenic", "Capable of producing disease"));
        words.add(new Word("pastiche", "Mix of incongruous parts; artistic work imitating the work of other artists"));
        words.add(new Word("parry", "Deflect or avoid"));
        words.add(new Word("parley", "Discussion, negotiation, esp. between enemies"));
        words.add(new Word("pare", "Peel or cut off the outer layer"));

        TextView meaningView = findViewById(R.id.word_meaning);
        meaningView.setVisibility(View.GONE);

        TextView textMessage = findViewById(R.id.text_message);
        textMessage.setVisibility(View.GONE);

        TextView btnCorrect = findViewById(R.id.button_right);
        btnCorrect.setVisibility(View.GONE);

        TextView btnWrong = findViewById(R.id.button_wrong);
        btnWrong.setVisibility(View.GONE);

        TextView meaning = (TextView) findViewById(R.id.cw_7_word_meaning);
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
        TextView quantityTextView = findViewById(R.id.cw_7_word);
        quantityTextView.setText(words.get(number).getWord());
        meaningView.setText(words.get(number).getMeaning());
    }
}
