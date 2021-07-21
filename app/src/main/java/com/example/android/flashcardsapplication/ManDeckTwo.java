package com.example.android.flashcardsapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class ManDeckTwo extends AppCompatActivity {
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mandeck2);
        call();
    }

    public void btnCorrectClick (View view) {
        setContentView(R.layout.mandeck2);
        call();
    }

    public void btnWrongClick (View view) {
        setContentView(R.layout.mandeck2);
        call();
    }

    private void call () {
        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("connote", "Suggest or imply in addition to the precise, literal meaning"));
        words.add(new Word("disparate", "Distinct, different"));
        words.add(new Word("dissemble", "Mislead, conceal the truth, put on a false appearance of"));
        words.add(new Word("dissolution", "Dissolving, the state of having been dissolved"));
        words.add(new Word("distaff", "Female, esp. relating to the maternal side of the family"));
        words.add(new Word("distend", "Swell, expand, stretch, bloat"));
        words.add(new Word("dither", "Act indecisively (verb); a state of fear or trembling excitement"));
        words.add(new Word("diurnal", "Occurring every day"));
        words.add(new Word("doctrinaire", "Person who applies doctrine in an impractical or rigid and close-minded way"));
        words.add(new Word("doff", ", put aside; remove one's hat as a gesture"));
        words.add(new Word("dovetail", "Join or fit together"));
        words.add(new Word("droll", "Funny in an odd way"));
        words.add(new Word("dupe", "Person who is easily fooled or used"));
        words.add(new Word("duplicity", "acting in two different ways for the purpose of deception"));
        words.add(new Word("dyspeptic", "Grumpy, pessimistic, irritable"));
        words.add(new Word("ebullient", "Very enthusiastic, lively, excited; bubbling as though being boiled"));
        words.add(new Word("echelon", "A level, rank or grade; the people at that level"));
        words.add(new Word("edify", "Uplift, enlighten, instruct or improve in a spiritual or moral way"));
        words.add(new Word("effigy", "Representation or image of a person"));
        words.add(new Word("effrontery", "Shameless boldness"));
        words.add(new Word("egress", "An exit or the action of exiting"));
        words.add(new Word("elegy", "Song or poem of sorrow, esp. for a deceased person"));
        words.add(new Word("emaciate", "Make abnormally thin, cause to physically waste away"));
        words.add(new Word("encomium", "Warm, glowing praise, esp. a formal expression of praise"));
        words.add(new Word("endemic", "Native, local"));
        words.add(new Word("engender", "Produce, give rise to"));
        words.add(new Word("fetid", "Stinking; having an offensive smell"));
        words.add(new Word("fledgling", "an inexperienced person"));
        words.add(new Word("florid", "excessively fancy"));
        words.add(new Word("flout", "Treat with disdain, contempt, or scorn"));
        words.add(new Word("fluke", "Stroke of luck, something accidentally successful"));
        words.add(new Word("forage", "Wander in search of; rummage, hunt, make a raid"));
        words.add(new Word("ford", "Place where a river or similar body of water is shallow enough to walk or ride a vehicle across"));
        words.add(new Word("forestall", "Delay, hinder, prevent by taking action beforehand"));
        words.add(new Word("fortuitous", "Happening by chance; lucky"));
        words.add(new Word("fracas", "Noisy disturbance or fight; brawl"));
        words.add(new Word("fractious", "Unruly, irritable"));
        words.add(new Word("frenetic", "Wildly excited, frantic, distracted"));
        words.add(new Word("fulminate", "Explode, detonate; attack verbally in a vehement thunderous way"));
        words.add(new Word("furtive", "Done secretly; stealthy, sly, shifty"));
        words.add(new Word("gambol", "Frolic; skip or leap playfully"));
        words.add(new Word("garner", "Gather and store; amass, collect"));
        words.add(new Word("gestation", "Pregnancy; the period from conception until birth of an animal or (metaphorically) of an idea or plan"));
        words.add(new Word("glacial", "Pertaining to glaciers; cold, icy, slow, unsympathetic"));
        words.add(new Word("glower", "Stare in an angry, sullen way"));
        words.add(new Word("goad", "Urge on with unpleasant comments"));
        words.add(new Word("gouge", "Scooping or digging tool, like a chisel, or a hole made with such a tool"));
        words.add(new Word("graft", " the act of acquiring money or other benefits through illegal means, esp. by abusing one's power"));
        words.add(new Word("idyllic", "pleasant in a natural, simple way"));
        words.add(new Word("ignoble", "Not noble; having mean, base, low motives"));

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
