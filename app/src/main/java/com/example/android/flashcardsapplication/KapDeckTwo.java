package com.example.android.flashcardsapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class KapDeckTwo extends AppCompatActivity {
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kapdeck2);
        call();
    }

    public void btnCorrectClick (View view) {
        setContentView(R.layout.kapdeck2);
        call();
    }

    public void btnWrongClick (View view) {
        setContentView(R.layout.kapdeck2);
        call();
    }

    private void call () {
        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("ESCHEW", "to abstain from, avoid"));
        words.add(new Word("EVINCE", "to show clearly, display, signify"));
        words.add(new Word("EXORCISE", "to expel evil spirits"));
        words.add(new Word("EXPATIATE", "to wander; to discuss or describe at length"));
        words.add(new Word("EXPIATE", "to atone for, make amends for"));
        words.add(new Word("EXPUNGE", "to erase, eliminate completely"));
        words.add(new Word("EXPURGATE", "to censor"));
        words.add(new Word("EXTEMPORANEOUS", "unrehearsed, on the spur of the moment"));
        words.add(new Word("EXTOL", "to praise"));
        words.add(new Word("EXTRAPOLATE", "to estimate"));
        words.add(new Word("FACETIOUS", "witty in an inappropriate way"));
        words.add(new Word("FATUOUS", "stupid; smugly foolish; unconsciously foolish"));
        words.add(new Word("FEALTY", "intense loyalty"));
        words.add(new Word("FECUND", " fertile, fruitful, productive"));
        words.add(new Word("FETID", "foul-smelling, putrid"));
        words.add(new Word("FEY", "doomed"));
        words.add(new Word("FILCH", "to steal"));
        words.add(new Word("FILIAL", "appropriate for a child"));
        words.add(new Word("FLACCID", "limp, flabby, weak"));
        words.add(new Word("FOLIATE", "to grow, sprout leaves"));
        words.add(new Word("FORSWEAR", "to repudiate, renounce, disclaim, reject"));
        words.add(new Word("FRACAS", "noisy dispute"));
        words.add(new Word("FRACTIOUS", "unruly, rebellious"));
        words.add(new Word("FRENETIC", "wildly frantic, frenzied, hectic"));
        words.add(new Word("FULMINATE", "to explode with anger"));
        words.add(new Word("FULSOME", "excessive, overdone, sickeningly abundant"));
        words.add(new Word("FURTIVE", "secret, stealthy"));
        words.add(new Word("GAINSAY", "to deny"));
        words.add(new Word("GAMBOL", "to dance or skip around playfully"));
        words.add(new Word("GAUCHE", "crude, socially awkward"));
        words.add(new Word("GERMINATE", "to begin to grow"));
        words.add(new Word("GIBE", "to make heckling, taunting remarks"));
        words.add(new Word("GLIB", "fluent in an insincere manner; offhand, casual"));
        words.add(new Word("GNOSTIC", "having to do with knowledge"));
        words.add(new Word("GRANDILOQUENCE", "pompous talk, fancy but meaningless language"));
        words.add(new Word("GRATUITOUS", "free, voluntary; unnecessary and unjustified"));
        words.add(new Word("GUSTATORY", "relating to sense of taste"));
        words.add(new Word("HACKNEYED", "worn out by over-use"));
        words.add(new Word("HARANGUE", "a pompous speech"));
        words.add(new Word("HEGEMONY", "leadership, domination, usually by a country"));
        words.add(new Word("HERETICAL", "opposed to an established religious orthodoxy"));
        words.add(new Word("HERMETIC", "tightly sealed"));
        words.add(new Word("HOARY", "very old; whitish or gray from age"));
        words.add(new Word("HUSBAND", "to farm; manage carefully and thriftily"));
        words.add(new Word("IDIOSYNCRASY", "peculiarity of temperament, eccentricity"));
        words.add(new Word("IGNOMINIOUS", "disgraceful and dishonorable"));
        words.add(new Word("ILK", "type or kind"));
        words.add(new Word("LIMPID", "clear and simple in style"));
        words.add(new Word("LINIMENT", "medicinal liquid used externally to ease pain"));
        words.add(new Word("LIONIZE", "to treat as a celebrity"));

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
