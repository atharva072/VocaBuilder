package com.example.android.flashcardsapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class KapDeckFive extends AppCompatActivity {
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kapdeck5);
        call();
    }

    public void btnCorrectClick (View view) {
        setContentView(R.layout.kapdeck5);
        call();
    }

    public void btnWrongClick (View view) {
        setContentView(R.layout.kapdeck5);
        call();
    }

    private void call () {
        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("SUPERCILIOUS", "arrogant, haughty, overbearing, condescending"));
        words.add(new Word("SURLY", "rude and bad-tempered"));
        words.add(new Word("SURREPTITIOUS", "characterized by secrecy, stealthy"));
        words.add(new Word("SYBARITE", "person devoted to pleasure and luxury"));
        words.add(new Word("SYCOPHANT", "self-serving flatterer"));
        words.add(new Word("SYNCOPATION", "temporary irregularity in musical rhythm"));
        words.add(new Word("ZENITH", "highest point, summit"));
        words.add(new Word("XENOPHOBIA", "fear or hatred of foreigners or strangers"));
        words.add(new Word("WRAITH", "a ghost"));
        words.add(new Word("WIZENED", "withered, shriveled, wrinkled"));
        words.add(new Word("WASPISH", "easily irritated"));
        words.add(new Word("VOLUBLE", "speaking much and easily, talkative; glib"));
        words.add(new Word("VOCIFEROUS", "loud, vocal, and noisy"));
        words.add(new Word("VITUPERATE", "to abuse verball"));
        words.add(new Word("VITRIOLIC", "burning, caustic; sharp, bitter"));
        words.add(new Word("VITIATE", "reduce in value or effectiveness"));
        words.add(new Word("VIRILE", "manly, having qualities of an adult male"));
        words.add(new Word("VARIEGATED", "varied; marked with different colors"));
        words.add(new Word("USURY", "lending money at exorbitant rates"));
        words.add(new Word("URBANE", "courteous, refined, suave"));
        words.add(new Word("UNTOWARD", "not favorable; unruly"));
        words.add(new Word("UNSULLIED", "clean"));
        words.add(new Word("UNFETTERED", "free, unrestrained"));
        words.add(new Word("UNCTUOUS", "greasy, oily; smug and falsely earnest"));
        words.add(new Word("UMBRAGE", "offense, resentment"));
        words.add(new Word("TYRO", "beginner, novice"));
        words.add(new Word("TURPITUDE", "inherent vileness, foulness, depravity"));
        words.add(new Word("TURGID", "swollen, bloated"));
        words.add(new Word("TRUCULENT", "savage and cruel; fierce; ready to fight"));
        words.add(new Word("TRITE", "shallow, superficial"));
        words.add(new Word("TRENCHANT", "acute, sharp, incisive; forceful, effective"));
        words.add(new Word("TRAMMEL", "to impede or hamper"));
        words.add(new Word("THRENODY", "a sad poem or song"));
        words.add(new Word("TENUOUS", "weak, insubstantial"));
        words.add(new Word("TENET", "belief, doctrine"));
        words.add(new Word("TENABLE", "defensible, reasonable"));
        words.add(new Word("TEMPORAL", "relating to time; chronological"));
        words.add(new Word("TEMERITY", "recklessness"));
        words.add(new Word("TANTAMOUNT", "equivalent in value or significance; amounting to"));
        words.add(new Word("TALISMAN", "something producing a magical effect"));
        words.add(new Word("TABLEAU", "vivid description, striking incident or scene"));
        words.add(new Word("RECREANT", "disloyal; cowardly"));
        words.add(new Word("RECONDITE", "relating to obscure learning; known to only a few"));
        words.add(new Word("RECIDIVISM", "tendency to repeat previous behavior"));
        words.add(new Word("RECALCITRANT", "resisting authority or control"));
        words.add(new Word("RAZE", "to tear down, demolish"));
        words.add(new Word("RAPPROCHEMENT", "reestablishing a cordial relationship"));
        words.add(new Word("RAPACIOUS", "greedy; predatory"));

        TextView meaningView = findViewById(R.id.word_meaning);
        meaningView.setVisibility(View.GONE);

        TextView textMessage = findViewById(R.id.text_message);
        textMessage.setVisibility(View.GONE);

        TextView btnCorrect = findViewById(R.id.button_right);
        btnCorrect.setVisibility(View.GONE);

        TextView btnWrong = findViewById(R.id.button_wrong);
        btnWrong.setVisibility(View.GONE);

        TextView meaning = (TextView) findViewById(R.id.cw_5_word_meaning);
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
        TextView quantityTextView = findViewById(R.id.cw_5_word);
        quantityTextView.setText(words.get(number).getWord());
        meaningView.setText(words.get(number).getMeaning());
    }
}
