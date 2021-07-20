package com.example.android.flashcardsapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class DeckSix extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deck6);
        call6();
    }

    public void btnCorrectClick6 (View view) {
        setContentView(R.layout.deck6);
        call6();
    }

    public void btnWrongClick6 (View view) {
        setContentView(R.layout.deck6);
        call6();
    }

    private void call6 () {
        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("Prevaricate","lie"));
        words.add(new Word("Pristine","characteristic of earlier times; primitive; unspoiled"));
        words.add(new Word("Probity","uprightness; incorruptibility"));
        words.add(new Word("Problematic","doubtful; unsettled; questionable; perplexing"));
        words.add(new Word("Prodigal","wasteful; reckless with money"));
        words.add(new Word("Profound","deep; not superficial; complete"));
        words.add(new Word("Prohibitive","tending to prevent the purchase or use of something; inclined to prevent or forbid"));
        words.add(new Word("Proliferate","grow rapidly; spread; multiply"));
        words.add(new Word("Propensity","natural inclination"));
        words.add(new Word("Propitiate","appease"));
        words.add(new Word("Propriety","fitness; correct conduct"));
        words.add(new Word("Proscribe","ostracize; banish; outlaw"));
        words.add(new Word("Pungent","stinging; sharp in taste or smell; caustic"));
        words.add(new Word("Qualified","limited; restricted"));
        words.add(new Word("Quibble","minor objection or complaint"));
        words.add(new Word("Quiescent","at rest; dormant; temporarily inactive"));
        words.add(new Word("Rarefied","made less dense (of a gas)"));
        words.add(new Word("Recalcitrant","obstinately stubborn; determined to resist authority; unruly"));
        words.add(new Word("Recant","disclaim or disavow; retract a previous statement; openly confess error"));
        words.add(new Word("Recluse","hermit; loner"));
        words.add(new Word("Recondite","abstruse; profound; secret"));
        words.add(new Word("Refractory","stubborn; unmanageable"));
        words.add(new Word("Refute","disprove"));
        words.add(new Word("Relegate","banish to an inferior position; delegate; assign"));
        words.add(new Word("Reproach","express disapproval or disappointment"));
        words.add(new Word("Reprobate","person hardened in sin; devoid of a sense of decency"));
        words.add(new Word("Repudiate","disown; disavow"));
        words.add(new Word("Rescind","cancel"));
        words.add(new Word("Resolution","Determination"));
        words.add(new Word("Resolve","determination; firmness of purpose"));
        words.add(new Word("Reticent","reserved; uncommunicative; inclined to silence"));
        words.add(new Word("Reverent","respectful; worshipful"));
        words.add(new Word("Sage","person celebrated for wisdom"));
        words.add(new Word("Salubrious","healthful"));
        words.add(new Word("Sanction","approve; ratify"));
        words.add(new Word("Satiate","satisfy fully"));
        words.add(new Word("Saturate","soak thoroughly"));
        words.add(new Word("Savor","enjoy; have a distinctive flavor, smell, or quality"));
        words.add(new Word("Secrete","hide away or cache; produce and release a substance into an organism"));
        words.add(new Word("Shard","fragment, generally of pottery"));
        words.add(new Word("Skeptic","doubter; person who suspends judgment until having examined evidence supporting a point of view"));
        words.add(new Word("Solicitous","worried; concerned"));
        words.add(new Word("Soporific","sleep-causing; marked by sleepiness"));
        words.add(new Word("Specious","seemingly reasonable but incorrect; misleading (often intentionally)"));
        words.add(new Word("Spectrum","colored band produced when a beam of light passes through a prism"));
        words.add(new Word("Sporadic","occurring irregularly"));
        words.add(new Word("Stigma","token of disgrace; brand"));
        words.add(new Word("Stint","be thrifty; set limits"));
        words.add(new Word("Stipulate","make express conditions; specify"));
        words.add(new Word("Stolid","dull; impassive"));

        TextView meaningView = findViewById(R.id.word_6_meaning);
        meaningView.setVisibility(View.GONE);

        TextView textMessage = findViewById(R.id.text_6_message);
        textMessage.setVisibility(View.GONE);

        TextView btnCorrect = findViewById(R.id.button_6_right);
        btnCorrect.setVisibility(View.GONE);

        TextView btnWrong = findViewById(R.id.button_6_wrong);
        btnWrong.setVisibility(View.GONE);

        TextView meaning = (TextView) findViewById(R.id.cw_6_word_meaning);
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
        TextView quantityTextView = findViewById(R.id.cw_6_word);
        quantityTextView.setText(words.get(number).getWord());
        meaningView.setText(words.get(number).getMeaning());
    }
}
