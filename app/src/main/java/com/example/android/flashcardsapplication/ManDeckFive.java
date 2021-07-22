package com.example.android.flashcardsapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class ManDeckFive extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mandeck5);
        call();
    }

    public void btnCorrectClick (View view) {
        setContentView(R.layout.mandeck5);
        call();
    }

    public void btnWrongClick (View view) {
        setContentView(R.layout.mandeck5);
        call();
    }

    private void call () {
        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("propitiate", "Attempt to reconcile with, satisfy"));
        words.add(new Word("propitious", "Favorable, giving good signs for the future"));
        words.add(new Word("providential", "Lucky, fortunate, or relating to divine care"));
        words.add(new Word("proxy", "Agent, substitute, person authorized to act on behalf of another"));
        words.add(new Word("puerile", "immature"));
        words.add(new Word("pugilism", "boxing, fighting with the fists"));
        words.add(new Word("puissant", "Power, might"));
        words.add(new Word("pulchritude", "Physical beauty"));
        words.add(new Word("pungent", "Having a sharp taste or smell; biting, stimulating, sharp"));
        words.add(new Word("ribald", "Using or relating to obscene or vulgar humor"));
        words.add(new Word("ridden", "Dominated or burdened by"));
        words.add(new Word("rift", " a break in friendly relations"));
        words.add(new Word("rococo", "Very elaborate and ornate"));
        words.add(new Word("rue", "Regret, remorse"));
        words.add(new Word("ruminate", "Turn over in the mind, reflect on"));
        words.add(new Word("salient", "Obvious, standing out"));
        words.add(new Word("sardonic", "Scornfully or ironically mocking, cynically derisive"));
        words.add(new Word("savant", "Learned person, scholar, someone admitted to membership in a scholarly field"));
        words.add(new Word("scintilla", "A tiny bit or trace"));
        words.add(new Word("scurvy", "Contemptible, mean"));
        words.add(new Word("searchingly", "In a searching or penetrating manner"));
        words.add(new Word("secrete", "Produce and release a substance from a cell or gland of the body for a functional purpose"));
        words.add(new Word("sedition", "Inciting rebellion against a government, especially speech or writing that does this"));
        words.add(new Word("semantic", "Relating to the different meanings of words or other symbols"));
        words.add(new Word("seraphic", "Like an angel; serene, spiritually carried off or transported"));
        words.add(new Word("shard", "Fragment of some brittle substance"));
        words.add(new Word("sinecure", "A job or position that pays while requiring little or no work"));
        words.add(new Word("skittish", "Shy, fickle, uncertain, or prone to act suddenly due to nervousness"));
        words.add(new Word("slake", "Satisfy (esp. thirst), cool, or refresh; make less active"));
        words.add(new Word("sobriquet", "A nickname"));
        words.add(new Word("solecism", "Nonstandard use of grammar or words; mistake"));
        words.add(new Word("solidarity", "Fellowship in interests, feelings, responsibilities"));
        words.add(new Word("somatic", "Of the body"));
        words.add(new Word("terse", "Concise, brief and to the point"));
        words.add(new Word("toady", "Someone who flatters or acts in a servile manner for self-serving reasons"));
        words.add(new Word("token", "Sign, symbol, mark, badge"));
        words.add(new Word("tome", "Large or scholarly book"));
        words.add(new Word("tortuous", "Twisting, winding, complex"));
        words.add(new Word("transgression", "Violation of a law, moral rule, order"));
        words.add(new Word("travesty", "mockery"));
        words.add(new Word("treacherous", "Betraying trust, not faithful or trustworthy; not dependable; dangerous or deceptive"));
        words.add(new Word("trenchant", "forceful or vigorous, effective, keen; caustic, sharp"));
        words.add(new Word("truculent", "Fierce, cruel, savage; belligerent"));
        words.add(new Word("tumultuous", "Riotous, violently agitated, marked by disturbance or uproar; noisy, chaotic"));
        words.add(new Word("turgid", "Swollen, inflated"));
        words.add(new Word("turpitude", "Depravity, baseness of character, corrupt or depraved acts"));
        words.add(new Word("tyro", "Beginner"));
        words.add(new Word("umbrage", "Offense or annoyance"));
        words.add(new Word("unconscionable", "morally wrong, unjust, unreasonable"));
        words.add(new Word("unsparing", "Generous, lavish"));

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
