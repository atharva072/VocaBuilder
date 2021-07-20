package com.example.android.flashcardsapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.Random;

public class DeckSeven extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deck7);
        call7();
    }

    public void btnCorrectClick6 (View view) {
        setContentView(R.layout.deck7);
        call7();
    }

    public void btnWrongClick6 (View view) {
        setContentView(R.layout.deck7);
        call7();
    }

    private void call7 () {
        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("Striated","marked with parallel bands; grooved"));
        words.add(new Word("Strut","pompous walk"));
        words.add(new Word("Strut","supporting bar"));
        words.add(new Word("Subpoena","writ summoning a witness to appear"));
        words.add(new Word("Subside","settle down; descend; grow quiet"));
        words.add(new Word("Substantiate","establish by evidence; verify; support"));
        words.add(new Word("Supersede","cause to be set aside; replace; make obsolete"));
        words.add(new Word("Supposition","hypothesis; surmise"));
        words.add(new Word("Tacit","understood; not put into words"));
        words.add(new Word("Tangential","peripheral; only slightly connected; digressing"));
        words.add(new Word("Tenuous","thin; rare; slim"));
        words.add(new Word("Tirade","extended scolding; denunciation; harangue"));
        words.add(new Word("Torpor","lethargy; sluggishness; dormancy"));
        words.add(new Word("Tortuous","winding; full of curves"));
        words.add(new Word("Tractable","docile; easily managed"));
        words.add(new Word("Transgression","violation of a law; sin"));
        words.add(new Word("Truculence","aggressiveness; ferocity"));
        words.add(new Word("Vacillate","waver; fluctuate"));
        words.add(new Word("Venerate","revere; respect"));
        words.add(new Word("Veracious","truthful"));
        words.add(new Word("Verbose","wordy"));
        words.add(new Word("Viable","practical or workable"));
        words.add(new Word("Viscous","sticky, gluey"));
        words.add(new Word("Vituperative","abusive; scolding"));
        words.add(new Word("Volatile","changeable; explosive; evaporation rapidly"));
        words.add(new Word("Warranted","justified; authorized"));
        words.add(new Word("Wary","very cautious"));
        words.add(new Word("Welter","turmoil; bewildering jumble"));
        words.add(new Word("Whimsical","capricious; fanciful"));
        words.add(new Word("Zealot","fanatic; person who shows excessive zeal"));

        TextView meaningView = findViewById(R.id.word_7_meaning);
        meaningView.setVisibility(View.GONE);

        TextView textMessage = findViewById(R.id.text_7_message);
        textMessage.setVisibility(View.GONE);

        TextView btnCorrect = findViewById(R.id.button_7_right);
        btnCorrect.setVisibility(View.GONE);

        TextView btnWrong = findViewById(R.id.button_7_wrong);
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
