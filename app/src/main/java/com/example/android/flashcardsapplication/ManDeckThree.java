package com.example.android.flashcardsapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class ManDeckThree extends AppCompatActivity {
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mandeck3);
        call();
    }

    public void btnCorrectClick (View view) {
        setContentView(R.layout.mandeck3);
        call();
    }

    public void btnWrongClick (View view) {
        setContentView(R.layout.mandeck3);
        call();
    }

    private void call () {
        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("imbue", "Permeate or saturate, as dye in a fabric; influence throughout"));
        words.add(new Word("immutable", "Unchangeable"));
        words.add(new Word("impasse", "Position or road from which there is no escape; deadlock"));
        words.add(new Word("impassive", "Not having or not showing physical feeling or emotion"));
        words.add(new Word("impecunious", "Poor, without money"));
        words.add(new Word("imperious", "Commanding, domineering; acting like a high-ranking person; urgent"));
        words.add(new Word("impermeable", "Impassable, not allowing passage through"));
        words.add(new Word("imperturbable", "Calm, not able to be upset or agitated"));
        words.add(new Word("impervious", "Impenetrable, not able to be harmed or emotionally disturbed"));
        words.add(new Word("impetuous", "Passionately impulsive, marked by sudden, hasty emotion; forceful, violent"));
        words.add(new Word("impious", "Not religious, lacking reverence, ungodly"));
        words.add(new Word("implacable", "Not able to be appeased, calmed, or satisfied"));
        words.add(new Word("imprecation", "Curse; prayer for harm to come to someone"));
        words.add(new Word("impugn", "Attack the truth or integrity of"));
        words.add(new Word("impute", "Credit, attribute; lay blame or responsibility for"));
        words.add(new Word("incarnadine", "Blood red or flesh-colored"));
        words.add(new Word("inconstancy", "Fickleness, unreliability; the state of changing without good reason"));
        words.add(new Word("inculcate", "Teach persistently, implant (an idea) in a person"));
        words.add(new Word("indefatigable", "Untiring, not able to become fatigued"));
        words.add(new Word("indigence", "Extreme poverty"));
        words.add(new Word("indolent", "Lazy, slothful"));
        words.add(new Word("inert", "Inactive; having little or no power to move"));
        words.add(new Word("inexorable", "unstoppable"));
        words.add(new Word("infallible", "Incapable of error; certain"));
        words.add(new Word("ingrate", "Ungrateful person"));
        words.add(new Word("ingratiate", "Make an effort to gain favor with"));
        words.add(new Word("inimical", "Hostile, adverse, harmful"));
        words.add(new Word("juxtapose", "Place side by side contrast"));
        words.add(new Word("kindle", "Ignite, cause to begin burning; incite, arouse, inflame"));
        words.add(new Word("kinetic", "Pertaining to motion"));
        words.add(new Word("knell", "The sound made by a bell for a funeral, or any sad sound or signal of a failure, death, ending"));
        words.add(new Word("lachrymose", "Tearful, mournful"));
        words.add(new Word("larceny", "Theft"));
        words.add(new Word("largess", "Generosity, the giving of money or gifts"));
        words.add(new Word("latent", "Potential; existing but not visible or active"));
        words.add(new Word("laudable", "Worthy of praise"));
        words.add(new Word("lax", "Not strict; careless, loose, slack"));
        words.add(new Word("leery", "Suspicious or wary"));
        words.add(new Word("legerdemain", "trickery or deception"));
        words.add(new Word("lethargic", "Lazy, drowsy, or sluggish"));
        words.add(new Word("licentious", "Sexually unrestrained; immoral; ignoring the rules"));
        words.add(new Word("limpid", "Clear, transparent; completely calm"));
        words.add(new Word("lionize", "Treat like a celebrity"));
        words.add(new Word("lissome", "Flexible, supple, agile"));
        words.add(new Word("listless", "Spiritless, lacking interest or energy"));
        words.add(new Word("livid", "Furiously angry, enraged"));
        words.add(new Word("lugubrious", "Mournful"));
        words.add(new Word("lumber", "Walk in a heavy or clumsy way"));
        words.add(new Word("luminous", "Shining, radiant, well-lit; brilliant or enlightening"));
        words.add(new Word("lurid", "Gruesome or excessively vivid; sensational, shocking, unrestrained"));

        TextView meaningView = findViewById(R.id.word_meaning);
        meaningView.setVisibility(View.GONE);

        TextView textMessage = findViewById(R.id.text_message);
        textMessage.setVisibility(View.GONE);

        TextView btnCorrect = findViewById(R.id.button_right);
        btnCorrect.setVisibility(View.GONE);

        TextView btnWrong = findViewById(R.id.button_wrong);
        btnWrong.setVisibility(View.GONE);

        TextView meaning = (TextView) findViewById(R.id.cw_3_word_meaning);
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
        TextView quantityTextView = findViewById(R.id.cw_3_word);
        quantityTextView.setText(words.get(number).getWord());
        meaningView.setText(words.get(number).getMeaning());
    }
}
