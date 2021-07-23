package com.example.android.flashcardsapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class ManDeckTen extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mandeck10);
        call();
    }

    public void btnCorrectClick (View view) {
        setContentView(R.layout.mandeck10);
        call();
    }

    public void btnWrongClick (View view) {
        setContentView(R.layout.mandeck10);
        call();
    }

    private void call () {
        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("diffuse", "Spread widely, disseminate"));
        words.add(new Word("diffident", "Lacking confidence, shy"));
        words.add(new Word("dictum", "Formal or authoritative pronouncement; saying or proverb"));
        words.add(new Word("dichotomy", "Division into two parts or into two contradictory groups"));
        words.add(new Word("diaphanous", "Very sheer, fine, translucent"));
        words.add(new Word("desultory", "Lacking consistency or order, disconnected, sporadic; going off topic"));
        words.add(new Word("demur", "Show reluctance or object, especially for moral reasons"));
        words.add(new Word("demagogue", "A leader who lies and gains power by arousing the passions and especially prejudices of the people"));
        words.add(new Word("delimit", "Fix, mark, or define the boundaries of"));
        words.add(new Word("declivity", "Downward slope"));
        words.add(new Word("declaim", "Speak in an impassioned, pompous, or oratorical manner"));
        words.add(new Word("curmudgeon", "Bad-tempered, difficult person; grouch"));
        words.add(new Word("cupidity", "Greed, great or excessive desire"));
        words.add(new Word("coterie", "Close or exclusive group, clique"));
        words.add(new Word("cosset", "Treat as a pet, pamper"));
        words.add(new Word("convoke", "Call together, as to a meeting"));
        words.add(new Word("contumacious", "Rebellious; stubbornly disobedient"));
        words.add(new Word("contrite", "Remorseful"));
        words.add(new Word("contraries", "Things that are opposing"));
        words.add(new Word("bevy", " any large group that stay close together"));
        words.add(new Word("besiege", "Attack, overwhelm, crowd in on or surround"));
        words.add(new Word("bent", "Personal inclination or tendency"));
        words.add(new Word("beneficent", "Doing good"));
        words.add(new Word("baying", "Howling in a deep way, like a dog or wolf"));
        words.add(new Word("bane", "Something that ruins or spoils"));
        words.add(new Word("banal", "Lacking freshness and originality; cliche"));
        words.add(new Word("balloon", "Swell or puff out; increase rapidly"));
        words.add(new Word("axiom", "Self-evident truth requiring no proof"));
        words.add(new Word("avarice", "Insatiable greed; a miserly desire to hoard wealth"));
        words.add(new Word("august", "Venerable, majestic; inspiring admiration"));
        words.add(new Word("augury", "Telling the future, such as through supernatural means"));
        words.add(new Word("attuned", "In harmony; in sympathetic relationship"));
        words.add(new Word("attenuate", "Weaken or thin out"));
        words.add(new Word("assiduous", "Persevering, diligent, constant"));
        words.add(new Word("assail", "Attack violently, assault"));
        words.add(new Word("aspersions", "Damaging remarks, defamation, slander"));
        words.add(new Word("asperity", "Rigor, severity; harshness or sharpness of tone; roughness of surface"));
        words.add(new Word("aseptic", "Free from germs"));
        words.add(new Word("ascribe", "Assign or credit to a certain cause or source"));
        words.add(new Word("arrogate", "Claim or take presumptuously or without the right to do so"));
        words.add(new Word("ardent", "Very passionate, devoted, or enthusiastic"));
        words.add(new Word("arbiter", "Judge, umpire, person empowered to decide matters at hand"));
        words.add(new Word("appropriate", "Set aside or authorize"));
        words.add(new Word("approbation", "Praise or approval, especially formal approval"));
        words.add(new Word("apprise", "Inform, give notice to"));
        words.add(new Word("apposite", "Highly appropriate, suitable, or relevant"));
        words.add(new Word("apostle", "Pioneer of a reform movement"));
        words.add(new Word("apostate", "Person who deserts a party, cause, religion"));
        words.add(new Word("antithetical", "Directly opposed, opposite; involving antithesis"));

        TextView meaningView = findViewById(R.id.word_meaning);
        meaningView.setVisibility(View.GONE);

        TextView textMessage = findViewById(R.id.text_message);
        textMessage.setVisibility(View.GONE);

        TextView btnCorrect = findViewById(R.id.button_right);
        btnCorrect.setVisibility(View.GONE);

        TextView btnWrong = findViewById(R.id.button_wrong);
        btnWrong.setVisibility(View.GONE);

        TextView meaning = (TextView) findViewById(R.id.cw_10_word_meaning);
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
        TextView quantityTextView = findViewById(R.id.cw_10_word);
        quantityTextView.setText(words.get(number).getWord());
        meaningView.setText(words.get(number).getMeaning());
    }
}
