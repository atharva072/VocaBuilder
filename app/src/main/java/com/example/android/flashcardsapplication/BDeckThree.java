package com.example.android.flashcardsapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class BDeckThree extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bdeck3);
        call3();
    }

    public void btnCorrectClick3 (View view) {
        setContentView(R.layout.bdeck3);
        call3();
    }

    public void btnWrongClick3 (View view) {
        setContentView(R.layout.bdeck3);
        call3();
    }

    private void call3 () {
        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("Divest","strip; deprive"));
        words.add(new Word("Document","provide written evidence"));
        words.add(new Word("Dogmatic","opinionated; arbitrary; doctrinal "));
        words.add(new Word("Dormant","sleeping; lethargic; latent"));
        words.add(new Word("Dupe","someone easily fooled"));
        words.add(new Word("Ebullient","showing excitement; overflowing with enthusiasm"));
        words.add(new Word("Eclectic","selective; composed of elements drawn from disparate sources"));
        words.add(new Word("Efficacy","power to produce desired effect"));
        words.add(new Word("Effrontery","impudence; shameless boldness; sheer nerve; presumptuousness"));
        words.add(new Word("Elegy","poem or song expressing lamentation"));
        words.add(new Word("Elicit","draw out by discussion"));
        words.add(new Word("Embellish","adorn; ornament; enhance, as a story"));
        words.add(new Word("Empirical","based on experience"));
        words.add(new Word("Emulate","imitate; rival"));
        words.add(new Word("Endemic","prevailing among a specific group of people or in a specific area or country"));
        words.add(new Word("Enervate","weaken"));
        words.add(new Word("Engender","cause; produce"));
        words.add(new Word("Enhance","increase; improve"));
        words.add(new Word("Ephemeral","short-lived; fleeting"));
        words.add(new Word("Equanimity","calmness of temperament; composure"));
        words.add(new Word("Equivocate","lie; mislead; attempt to conceal the truth"));
        words.add(new Word("Erudite","learned; scholarly"));
        words.add(new Word("Esoteric","hard to understand; known only to the chosen few"));
        words.add(new Word("Eulogy","expression of praise, often on the occasion of someone’s death"));
        words.add(new Word("Euphemism","mild expression in place of an unpleasant one"));
        words.add(new Word("Exacerbate","worsen; embitter"));
        words.add(new Word("Exculpate","clear from blame"));
        words.add(new Word("Exigency","urgent situation; pressing needs or demands; state of requiring immediate attention"));
        words.add(new Word("Extrapolation","projection; conjecture"));
        words.add(new Word("Facetious","joking (often inappropriately); humorous"));
        words.add(new Word("Facilitate","help bring about; make less difficult"));
        words.add(new Word("Fallacious","false; misleading"));
        words.add(new Word("Fatuous","brainless; inane; foolish, yet smug"));
        words.add(new Word("Fawning","trying to please by behaving obsequiously, flattering, or cringing\n"));
        words.add(new Word("Felicitous","apt; suitably expressed; well chosen"));
        words.add(new Word("Fervor","glowing ardor; intensity of feeling"));
        words.add(new Word("Flag","droop; grow feeble"));
        words.add(new Word("Fledgling","young; inexperienced"));
        words.add(new Word("Flout","reject; mock; show contempt for"));
        words.add(new Word("Foment","stir up; instigate"));
        words.add(new Word("Forestall","prevent by taking action in advance"));
        words.add(new Word("Frugality","thrift; economy"));
        words.add(new Word("Futile","useless; hopeless; ineffectual"));
        words.add(new Word("Gainsay","deny"));
        words.add(new Word("Garrulous","loquacious; talkative; wordy"));
        words.add(new Word("Goad","urge on"));
        words.add(new Word("Gouge","overcharge"));
        words.add(new Word("Grandiloquent","pompous; bombastic; using high-sounding language"));
        words.add(new Word("Gregarious","sociable"));
        words.add(new Word("Guileless","without deceit"));

        TextView meaningView = findViewById(R.id.word_3_meaning);
        meaningView.setVisibility(View.GONE);

        TextView textMessage = findViewById(R.id.text_3_message);
        textMessage.setVisibility(View.GONE);

        TextView btnCorrect = findViewById(R.id.button_3_right);
        btnCorrect.setVisibility(View.GONE);

        TextView btnWrong = findViewById(R.id.button_3_wrong);
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
