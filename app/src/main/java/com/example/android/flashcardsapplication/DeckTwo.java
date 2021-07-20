package com.example.android.flashcardsapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class DeckTwo extends AppCompatActivity {


    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deck2);
        call2();
    }

    public void btnCorrectClick2 (View view) {
        setContentView(R.layout.deck2);
        call2();
    }

    public void btnWrongClick2 (View view) {
        setContentView(R.layout.deck2);
        call2();
    }

    private void call2 () {
        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("Compendium","brief, comprehensive summary"));
        words.add(new Word("Complaisant","trying to please; overly polite; obliging"));
        words.add(new Word("Compliant","yielding; conforming to requirements"));
        words.add(new Word("Conciliatory","reconciling; soothing"));
        words.add(new Word("Condone","overlook; forgive; give tacit approval; excuse"));
        words.add(new Word("Confound","confuse; puzzle"));
        words.add(new Word("Connoisseur","person competent to act as a judge of art; a lover of art"));
        words.add(new Word("Contention","claim; thesis"));
        words.add(new Word("Contentious","quarrelsome"));
        words.add(new Word("Contrite","penitent"));
        words.add(new Word("Conundrum","riddle; difficult problem"));
        words.add(new Word("Converge","approach; tend to meet; come together"));
        words.add(new Word("Convoluted","coiled around; involved; intricate"));
        words.add(new Word("Craven","cowardly"));
        words.add(new Word("Daunt","intimidate; frighten"));
        words.add(new Word("Decorum","propriety; orderliness and good taste in manners"));
        words.add(new Word("Default","failure to act"));
        words.add(new Word("Deference","courteous regard for another’s wishes"));
        words.add(new Word("Delineate","portray; depict; sketch"));
        words.add(new Word("Denigrate","blacken"));
        words.add(new Word("Deride","ridicule; make fun of"));
        words.add(new Word("Derivative","unoriginal; obtained from another source"));
        words.add(new Word("Desiccate","dry up"));
        words.add(new Word("Desultory","aimless; haphazard; digressing at random"));
        words.add(new Word("Deterrent","Something that discourages; hindrance\n"));
        words.add(new Word("Diatribe","bitter scolding; invective"));
        words.add(new Word("Dichotomy","split; branching into two parts (especially contradictory ones)"));
        words.add(new Word("Diffidence","Shyness"));
        words.add(new Word("Diffuse","wordy, rambling, spread out (like a gas)"));
        words.add(new Word("Digression","Wandering away from the subject"));
        words.add(new Word("Dirge","Lament with music"));
        words.add(new Word("Disabuse","correct a false impression; undeceive"));
        words.add(new Word("Discerning","mentally quick and observant; having insight"));
        words.add(new Word("Discordant","not harmonious; conflicting"));
        words.add(new Word("Discredit","defame; destroy confidence in; disbelieve"));
        words.add(new Word("Discrepancy","lack of consistency; difference"));
        words.add(new Word("Discrete","separate; unconnected; consisting of distinct parts"));
        words.add(new Word("Disingenuous","lacking genuine candor; insincere"));
        words.add(new Word("Disinterested","unprejudiced"));
        words.add(new Word("Disjointed","lacking coherence; separated at the joints"));
        words.add(new Word("Dismiss","eliminate from consideration; reject"));
        words.add(new Word("Disparage","belittle"));
        words.add(new Word("Disparate","basically different; unrelated"));
        words.add(new Word("Dissemble","disguise; pretend"));
        words.add(new Word("Disseminate","distribute; spread; scatter (like seeds)"));
        words.add(new Word("Dissolution","disintegration; looseness in morals"));
        words.add(new Word("Dissonance","discord; opposite of harmony"));
        words.add(new Word("Distend","expand; swell out"));
        words.add(new Word("Distill","purify; refine; concentrate"));
        words.add(new Word("Diverge","vary; go in different directions from the same point"));

        TextView meaningView = findViewById(R.id.word_2_meaning);
        meaningView.setVisibility(View.GONE);

        TextView textMessage = findViewById(R.id.text_2_message);
        textMessage.setVisibility(View.GONE);

        TextView btnCorrect = findViewById(R.id.button_2_right);
        btnCorrect.setVisibility(View.GONE);

        TextView btnWrong = findViewById(R.id.button_2_wrong);
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
