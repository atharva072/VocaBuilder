package com.example.android.flashcardsapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class KapDeckFour extends AppCompatActivity {
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kapdeck4);
        call();
    }

    public void btnCorrectClick (View view) {
        setContentView(R.layout.kapdeck4);
        call();
    }

    public void btnWrongClick (View view) {
        setContentView(R.layout.kapdeck4);
        call();
    }

    private void call () {
        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("RENEGE", "to go back on one’s word"));
        words.add(new Word("RENITENT", "resisting pressure, obstinate"));
        words.add(new Word("REPAST", "meal"));
        words.add(new Word("REPROBATE", "morally unprincipled person"));
        words.add(new Word("REQUITE", "to return or repay"));
        words.add(new Word("RESPITE", "interval of relief"));
        words.add(new Word("RESTIVE", "Restless"));
        words.add(new Word("RETINUE", "group of attendants with an important person"));
        words.add(new Word("REVELRY", "boisterous festivity"));
        words.add(new Word("RIBALD", "humorous in a vulgar way"));
        words.add(new Word("RIPOSTE", "a retort"));
        words.add(new Word("ROCOCO", "very highly ornamented"));
        words.add(new Word("ROTUND", "round in shape; fat"));
        words.add(new Word("RUMINATE", "to contemplate, reflect upon"));
        words.add(new Word("SACROSANCT", "extremely sacred; beyond criticism"));
        words.add(new Word("SAGACIOUS", "shrewd, wise"));
        words.add(new Word("SALACIOUS", "lustful"));
        words.add(new Word("SALUBRIOUS", "healthful"));
        words.add(new Word("SANGUINE", "ruddy; cheerfully optimistic"));
        words.add(new Word("SAPIENT", "wise"));
        words.add(new Word("SCABBARD", "sheath for sword or dagger"));
        words.add(new Word("SCINTILLA", "very small amount"));
        words.add(new Word("SCINTILLATE", "to sparkle, flash"));
        words.add(new Word("SCURRILOUS", "vulgar, low, indecent"));
        words.add(new Word("SEDITION", "behavior promoting rebellion"));
        words.add(new Word("SENESCENT", "aging, growing old"));
        words.add(new Word("SENTIENT", "aware, conscious, able to perceive"));
        words.add(new Word("SEPULCHRAL", "typical of a place of burial"));
        words.add(new Word("SERAPHIC", "angelic, pure, sublime"));
        words.add(new Word("SHIRK", "to avoid a task due to laziness or fear"));
        words.add(new Word("SIMPER", "to smirk, smile foolishly"));
        words.add(new Word("SINECURE", "well-paying job or office that requires little or no work"));
        words.add(new Word("SINUOUS", "winding; intricate, complex"));
        words.add(new Word("SLAKE", "to quench or moderate"));
        words.add(new Word("SLOVENLY", "untidy, messy"));
        words.add(new Word("SOJOURN", "visit, stay"));
        words.add(new Word("SOLECISM", "grammatical mistake"));
        words.add(new Word("SOLIPSISM", "self-centered; belief that the self is the only reality"));
        words.add(new Word("SOMNAMBULIST", "sleepwalker"));
        words.add(new Word("SONOROUS", "producing a full, rich sound"));
        words.add(new Word("SOPHIST", "person good at arguing deviously"));
        words.add(new Word("SPORTIVE", "frolicsome, playful"));
        words.add(new Word("SQUALID", "filthy; morally repulsive"));
        words.add(new Word("STAID", "self-restrained, strait-laced"));
        words.add(new Word("STENTORIAN", "extremely loud"));
        words.add(new Word("STRIATE", "striped, grooved"));
        words.add(new Word("STRINGENT", "mposing severe, rigorous standards"));
        words.add(new Word("STYMIE", "to block or thwart"));
        words.add(new Word("SUBTERFUGE", "trick or tactic used to avoid something"));
        words.add(new Word("SULLY", "to soil, stain, tarnish; taint"));

        TextView meaningView = findViewById(R.id.word_meaning);
        meaningView.setVisibility(View.GONE);

        TextView textMessage = findViewById(R.id.text_message);
        textMessage.setVisibility(View.GONE);

        TextView btnCorrect = findViewById(R.id.button_right);
        btnCorrect.setVisibility(View.GONE);

        TextView btnWrong = findViewById(R.id.button_wrong);
        btnWrong.setVisibility(View.GONE);

        TextView meaning = (TextView) findViewById(R.id.cw_4_word_meaning);
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
        TextView quantityTextView = findViewById(R.id.cw_4_word);
        quantityTextView.setText(words.get(number).getWord());
        meaningView.setText(words.get(number).getMeaning());
    }
}
