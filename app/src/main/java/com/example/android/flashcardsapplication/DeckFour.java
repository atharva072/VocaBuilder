package com.example.android.flashcardsapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class DeckFour extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deck4);
        call4();
    }

    public void btnCorrectClick4 (View view) {
        setContentView(R.layout.deck4);
        call4();
    }

    public void btnWrongClick4 (View view) {
        setContentView(R.layout.deck4);
        call4();
    }

    private void call4 () {
        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("Gullible","easily deceived"));
        words.add(new Word("Harangue","long, passionate, and vehement speech"));
        words.add(new Word("Homogeneous","of the same kind"));
        words.add(new Word("Hyperbole","exaggeration; overstatement"));
        words.add(new Word("Iconoclastic","attacking cherished traditions"));
        words.add(new Word("Idolatry","worship of idols; excessive admiration"));
        words.add(new Word("Immutable","unchangeable"));
        words.add(new Word("Impair","injure; hurt"));
        words.add(new Word("Impassive","without feeling; imperturbable; stoical"));
        words.add(new Word("Impede","hinder; block"));
        words.add(new Word("Impermeable","impervious; not permitting passage through its substance\n"));
        words.add(new Word("Imperturbable","calm; placid"));
        words.add(new Word("Impervious","impenetrable; incapable of being damaged or distressed\n"));
        words.add(new Word("Implacable","incapable of being pacified"));
        words.add(new Word("Implicit","understood but not stated"));
        words.add(new Word("Implode","burst inward"));
        words.add(new Word("Inadvertently","unintentionally; by oversight; carelessly"));
        words.add(new Word("Inchoate","recently begun; rudimentary; elementary"));
        words.add(new Word("Incongruity","lack of harmony; absurdity"));
        words.add(new Word("Inconsequential","insignificant; unimportant"));
        words.add(new Word("Incorporate","introduce something into a larger whole; combine; unite"));
        words.add(new Word("Indeterminate","uncertain; not clearly fixed; indefinite"));
        words.add(new Word("Indigence","poverty"));
        words.add(new Word("Indolent","lazy"));
        words.add(new Word("Inert","inactive; lacking power to move"));
        words.add(new Word("Ingenuous","naive and trusting; young; unsophisticated"));
        words.add(new Word("Inherent","firmly established by nature or habit"));
        words.add(new Word("Innocuous","Harmless"));
        words.add(new Word("Insensible","unconscious; unresponsive"));
        words.add(new Word("Insinuate","hint; imply; creep in"));
        words.add(new Word("Insipid","lacking in flavor; dull"));
        words.add(new Word("Insularity","narrow-mindedness; isolation"));
        words.add(new Word("Intractable","unruly; stubborn; unyielding"));
        words.add(new Word("Intransigence","refusal of any compromise; stubbornness"));
        words.add(new Word("Inundate","overwhelm; flood; submerge"));
        words.add(new Word("Inured","accustomed; hardened"));
        words.add(new Word("Invective","abuse"));
        words.add(new Word("Irascible","irritable; easily angered"));
        words.add(new Word("Irresolute","uncertain how to act; weak"));
        words.add(new Word("Itinerary","plan of a trip; move from place to place to work"));
        words.add(new Word("Laconic","brief and to the point"));
        words.add(new Word("Lassitude","languor; weariness"));
        words.add(new Word("Latent","potential but undeveloped; dormant; hidden"));
        words.add(new Word("Laud","praise"));
        words.add(new Word("Lethargic","drowsy; dull"));
        words.add(new Word("Levee","stone embankment to prevent flooding"));
        words.add(new Word("Levity","lack of seriousness or steadiness; frivolity"));
        words.add(new Word("Log","record of a voyage or flight; record of day-to-day activities"));
        words.add(new Word("Loquacious","talkative"));
        words.add(new Word("Lucid","easily understood; clear; intelligible"));

        TextView meaningView = findViewById(R.id.word_4_meaning);
        meaningView.setVisibility(View.GONE);

        TextView textMessage = findViewById(R.id.text_4_message);
        textMessage.setVisibility(View.GONE);

        TextView btnCorrect = findViewById(R.id.button_4_right);
        btnCorrect.setVisibility(View.GONE);

        TextView btnWrong = findViewById(R.id.button_4_wrong);
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
