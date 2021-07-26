package com.example.android.flashcardsapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class KapDeckOne extends AppCompatActivity {
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kapdeck1);
        call();
    }

    public void btnCorrectClick (View view) {
        setContentView(R.layout.kapdeck1);
        call();
    }

    public void btnWrongClick (View view) {
        setContentView(R.layout.kapdeck1);
        call();
    }

    private void call () {
        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("ABDICATE", "to give up a position, right, or power"));
        words.add(new Word("ABJURE", "to reject, abandon formally"));
        words.add(new Word("ABLUTION", "act of cleansing"));
        words.add(new Word("ABNEGATE", "to deny, renounce"));
        words.add(new Word("ABROGATE", "to abolish or invalidate by authority"));
        words.add(new Word("ABSTEMIOUS", "consuming moderately"));
        words.add(new Word("ABSTRUSE", "difficult to comprehend"));
        words.add(new Word("ABUT", "to touch, to be in contact with"));
        words.add(new Word("ACERBIC", "bitter, sharp in taste or temper"));
        words.add(new Word("ACME", "highest point, summit"));
        words.add(new Word("ACQUIESCE", "to agree or comply in silence"));
        words.add(new Word("ADROIT", "skillful, accomplished, highly competent"));
        words.add(new Word("ADUMBRATE", "to sketch, outline in a shadowy way"));
        words.add(new Word("AERIE", "nook or nest built high in the air"));
        words.add(new Word("ALTRUISM", "unselfish concern for others’ welfare"));
        words.add(new Word("AMBULATORY", "itinerant; walking around"));
        words.add(new Word("AMORTIZE", "to diminish by installment payments"));
        words.add(new Word("ANCILLARY", "accessory, subordinate; helping"));
        words.add(new Word("ANTEDILUVIAN", "prehistoric, ancient beyond measure"));
        words.add(new Word("ANTHROPOMORPHIC", "attributing human qualities to non-humans"));
        words.add(new Word("APLOMB", "poise, confident"));
        words.add(new Word("APOSTATE", "one who renounces a religious faith"));
        words.add(new Word("APOTHEGM", "a short, instructive saying"));
        words.add(new Word("APOTHEOSIS", "deification; glorified ideal"));
        words.add(new Word("ARBOREAL", "relating to trees; living in trees"));
        words.add(new Word("ASSIDUOUS", "diligent, persistent, hardworking"));
        words.add(new Word("BACCHANALIAN", "drunkenly festive"));
        words.add(new Word("BALK", "to refuse, shirk; prevent"));
        words.add(new Word("BEATIFIC", "saintly, angelic"));
        words.add(new Word("BEHEMOTH", "huge creature"));
        words.add(new Word("BELIE", "to misrepresent; expose as false"));
        words.add(new Word("BENISON", "blessing"));
        words.add(new Word("BIFURCATE", "divide into two parts"));
        words.add(new Word("BILIOUS", "easily irritated, relating to bile"));
        words.add(new Word("BONHOMIE", "good-natured geniality; atmosphere of good cheer"));
        words.add(new Word("BULWARK", "defense wall; anything serving as defense"));
        words.add(new Word("CAJOLE", "to flatter, coax, persuade"));
        words.add(new Word("CALAMITOUS", "disastrous, catastrophic"));
        words.add(new Word("CALUMNY", "false and malicious accusation, misrepresentation, slander"));
        words.add(new Word("CANARD", "a lie"));
        words.add(new Word("CAROM", "to strike and rebound"));
        words.add(new Word("CAVALCADE", "a procession"));
        words.add(new Word("CHAGRIN", "shame, embarrassment, humiliation"));
        words.add(new Word("CHARLATAN", "quack, fake"));
        words.add(new Word("CHATTEL", "piece of personal property"));
        words.add(new Word("CHIMERICAL", "fanciful, imaginary, visionary; impossible"));
        words.add(new Word("ENNUI", "boredom, lack of interest and energy"));
        words.add(new Word("EPICURE", "person with refined taste in food and wine"));
        words.add(new Word("EPITOME", "representative of an entire group; summary"));
        words.add(new Word("ERSATZ", "fake"));

        TextView meaningView = findViewById(R.id.word_meaning);
        meaningView.setVisibility(View.GONE);

        TextView textMessage = findViewById(R.id.text_message);
        textMessage.setVisibility(View.GONE);

        TextView btnCorrect = findViewById(R.id.button_right);
        btnCorrect.setVisibility(View.GONE);

        TextView btnWrong = findViewById(R.id.button_wrong);
        btnWrong.setVisibility(View.GONE);

        TextView meaning = (TextView) findViewById(R.id.cw_1_word_meaning);
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
        TextView quantityTextView = findViewById(R.id.cw_1_word);
        quantityTextView.setText(words.get(number).getWord());
        meaningView.setText(words.get(number).getMeaning());
    }
}
