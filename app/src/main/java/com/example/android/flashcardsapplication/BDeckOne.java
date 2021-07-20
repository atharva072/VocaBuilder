package com.example.android.flashcardsapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class BDeckOne extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bdeck1);
        call();
    }

    public void btnCorrectClick (View view) {
        setContentView(R.layout.bdeck1);
        call();
    }

    public void btnWrongClick (View view) {
        setContentView(R.layout.bdeck1);
        call();
    }

    private void call () {
        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("Abate","subside or moderate"));
        words.add(new Word("Aberrant","abnormal, or deviant"));
        words.add(new Word("Abeyance","suspended action"));
        words.add(new Word("Abscond","depart secretly and hide"));
        words.add(new Word("Abstemious","sparing in eating and drinking; temperate"));
        words.add(new Word("Admonish","warn; reprove"));
        words.add(new Word("Adulterate","make impure by adding inferior or tainted substances"));
        words.add(new Word("Aesthetic","artistic; dealing with or capable of appreciating the beautiful"));
        words.add(new Word("Aggregate","gather; accumulate"));
        words.add(new Word("Alacrity","cheerful promptness; eagerness"));
        words.add(new Word("Alleviate","relieve"));
        words.add(new Word("Amalgamate","combine; unite in one body"));
        words.add(new Word("Ambiguous","unclear or doubtful in meaning"));
        words.add(new Word("Ambivalence","the state of having contradictory or conflicting emotional attitudes"));
        words.add(new Word("Ameliorate","improve"));
        words.add(new Word("Anachronism","something or someone misplaced in time"));
        words.add(new Word("Analogous","comparable"));
        words.add(new Word("Anarchy","absence of governing body; state of disorder"));
        words.add(new Word("Anomalous","abnormal; irregular"));
        words.add(new Word("Antipathy","aversion; dislike"));
        words.add(new Word("Apathy","lack of caring; indifference"));
        words.add(new Word("Appease","pacify or soothe; relieve"));
        words.add(new Word("Apprise","inform"));
        words.add(new Word("Approbation","approval OR acquire; take possession of for one’s own use"));
        words.add(new Word("Arduous","hard; strenuous"));
        words.add(new Word("Artless","without guile; open and honest"));
        words.add(new Word("Ascetic","practicing self-denial; austere"));
        words.add(new Word("Assiduous","diligent"));
        words.add(new Word("Assuage","ease or lessen (pain); satisfy (hunger); soothe (anger)"));
        words.add(new Word("Attenuate","make thinner"));
        words.add(new Word("Audacious","daring; bold"));
        words.add(new Word("Austere","forbiddingly stern; severely simple"));
        words.add(new Word("Autonomous","self-governing; independent"));
        words.add(new Word("Aver","assert confidently or declare; as used in law, state formally as a fact"));
        words.add(new Word("Banal","hackneyed; commonplace; trite; lacking originality"));
        words.add(new Word("Belie","contradict; give a false impression"));
        words.add(new Word("Beneficent","kindly; doing good"));
        words.add(new Word("Bolster","support; reinforce"));
        words.add(new Word("Bombastic","pompous; using inflated language"));
        words.add(new Word("Boorish","rude; insensitive"));
        words.add(new Word("Burgeon","grow forth; send out buds"));
        words.add(new Word("Burnish","make shiny by rubbing; polish"));
        words.add(new Word("Buttress","support; prop up"));
        words.add(new Word("Capricious","unpredictable; fickle"));
        words.add(new Word("Castigation","punishment; severe criticism"));
        words.add(new Word("Catalyst","agent that increases the pace of a chemical action"));
        words.add(new Word("Caustic","burning; sarcastically biting"));
        words.add(new Word("Chicanery","trickery; deception"));
        words.add(new Word("Coagulate","thicken; congeal; clot"));
        words.add(new Word("Coda","concluding section of a musical or literary composition summarizes or concludes"));
        words.add(new Word("Cogent","convincing"));
        words.add(new Word("Commensurate","corresponding in extent, degree, etc.; proportionate"));

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
