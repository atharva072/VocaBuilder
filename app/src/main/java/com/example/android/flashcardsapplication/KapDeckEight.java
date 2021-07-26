package com.example.android.flashcardsapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class KapDeckEight extends AppCompatActivity {
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kapdeck8);
        call();
    }

    public void btnCorrectClick (View view) {
        setContentView(R.layout.kapdeck8);
        call();
    }

    public void btnWrongClick (View view) {
        setContentView(R.layout.kapdeck8);
        call();
    }

    private void call () {
        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("ENDEMIC", "belonging to a particular area, inherent"));
        words.add(new Word("ENCOMIUM", "warm praise"));
        words.add(new Word("EMOLLIENT", "having soothing qualities, esp. for skin"));
        words.add(new Word("EMEND", "to correct a text"));
        words.add(new Word("EGREGIOUS", "conspicuously bad"));
        words.add(new Word("EFFULGENT", "brilliantly shining"));
        words.add(new Word("EFFLUVIA", "outpouring of gases or vapors"));
        words.add(new Word("EBULLIENT", "exhilarated, full of enthusiasm and high spirits"));
        words.add(new Word("DYSPEPTIC", "suffering from indigestion; gloomy and irritable"));
        words.add(new Word("DROLL", "amusing in a wry, subtle way"));
        words.add(new Word("DOUGHTY", "courageous"));
        words.add(new Word("DOLOR", "sadness"));
        words.add(new Word("DOCTRINAIRE", "rigidly devoted to theories"));
        words.add(new Word("DIURNAL", "daily"));
        words.add(new Word("DITHER", "to move or act confusedly or without clear purpose"));
        words.add(new Word("DISTAFF", "the female branch of a family"));
        words.add(new Word("DISCOMFIT", "to cause perplexity and embarrassment"));
        words.add(new Word("DIMINUTIVE", "small"));
        words.add(new Word("DILUVIAL", "relating to a flood"));
        words.add(new Word("DIDACTIC", "excessively instructive"));
        words.add(new Word("DICTUM", "authoritative statement; popular saying"));
        words.add(new Word("DIAPHANOUS", "allowing light to show through; delicate"));
        words.add(new Word("DESCRY", "to discover or reveal"));
        words.add(new Word("DENIGRATE", "to slur or blacken someone’s reputation"));
        words.add(new Word("DEMAGOGUE", "leader who usually uses appeals to emotion or prejudice"));
        words.add(new Word("DELUGE", "flood"));
        words.add(new Word("DELETERIOUS", "harmful, destructive, detrimental"));
        words.add(new Word("DECLIVITY", "downward slope"));
        words.add(new Word("CURMUDGEON", "cranky person"));
        words.add(new Word("COVEN", "group of witches"));
        words.add(new Word("COTERIE", "small group of persons with a similar purpose"));
        words.add(new Word("COSSET", "to pamper, treat with great care"));
        words.add(new Word("CORRUGATE", "to mold in a shape with parallel grooves and ridges"));
        words.add(new Word("CORPULENCE", "obesity, fatness, bulkiness"));
        words.add(new Word("CONTUMACIOUS", "rebellious"));
        words.add(new Word("CONTENTIOUS", "quarrelsome, disagreeable, belligerent"));
        words.add(new Word("CONSANGUINEOUS", "of the same origin; related by blood"));
        words.add(new Word("CONGENIAL", "similar in tastes and habits"));
        words.add(new Word("CONFLAGRATION", "big, destructive fire"));
        words.add(new Word("CONCILIATORY", "overcoming distrust or hostility"));
        words.add(new Word("COMPUNCTIOUS", "feeling guilty or having misgivings"));
        words.add(new Word("COMMODIOUS", "roomy, spacious"));
        words.add(new Word("COMELINESS", "physical grace and beauty"));
        words.add(new Word("COGNOMEN", "family name; any name, especially a nickname"));
        words.add(new Word("COFFER", "strongbox, large chest for money"));
        words.add(new Word("COALESCE", "to grow together; cause to unite as one"));
        words.add(new Word("CISTERN", "tank for rainwater"));
        words.add(new Word("CHURLISH", "rude"));
        words.add(new Word("CHOLERIC", "easily angered, short-tempered"));

        TextView meaningView = findViewById(R.id.word_meaning);
        meaningView.setVisibility(View.GONE);

        TextView textMessage = findViewById(R.id.text_message);
        textMessage.setVisibility(View.GONE);

        TextView btnCorrect = findViewById(R.id.button_right);
        btnCorrect.setVisibility(View.GONE);

        TextView btnWrong = findViewById(R.id.button_wrong);
        btnWrong.setVisibility(View.GONE);

        TextView meaning = (TextView) findViewById(R.id.cw_8_word_meaning);
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
        TextView quantityTextView = findViewById(R.id.cw_8_word);
        quantityTextView.setText(words.get(number).getWord());
        meaningView.setText(words.get(number).getMeaning());
    }
}
