package com.example.android.flashcardsapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class ManDeckSix extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mandeck6);
        call();
    }

    public void btnCorrectClick (View view) {
        setContentView(R.layout.mandeck6);
        call();
    }

    public void btnWrongClick (View view) {
        setContentView(R.layout.mandeck6);
        call();
    }

    private void call () {
        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("untempered", "Not toned down; not moderated"));
        words.add(new Word("upbraid", "criticize or scold severely"));
        words.add(new Word("usury", "charging illegally high or excessive interest"));
        words.add(new Word("vanguard", "Leading units at the front of an army"));
        words.add(new Word("yoke", "A burden or something that oppresses"));
        words.add(new Word("xenophobia", "Fear or hatred of foreigners or that which is foreign"));
        words.add(new Word("wizened", "Withered, shriveled"));
        words.add(new Word("winsome", "Charming, engaging, esp. in a sweet and innocent way"));
        words.add(new Word("winnow", "Sift, analyze critically, separate the useful part from the worthless part"));
        words.add(new Word("whitewash", "A substance used to whiten walls, wood,"));
        words.add(new Word("whet", "Stimulate, make keen or eager"));
        words.add(new Word("welter", "Confused mass or pile, jumble"));
        words.add(new Word("wanton", "Reckless, vicious, without regard for what is right"));
        words.add(new Word("wan", "Unnaturally pale, or showing some other indication of sickness, unhappiness"));
        words.add(new Word("voluble", "Easily fluent in regards to speech"));
        words.add(new Word("vociferous", "Noisily crying out, as in protest"));
        words.add(new Word("vitriol", "Something highly caustic, such as criticism"));
        words.add(new Word("viscous", "Thick, adhesive, or covered in something sticky"));
        words.add(new Word("virulent", "Extremely infectious, poisonous"));
        words.add(new Word("vim", "Pep, enthusiasm, vitality, lively spirit"));
        words.add(new Word("vicissitude", "Changes or variations over time, esp. regular changes from one thing to another"));
        words.add(new Word("via", "Through, by means of, by way of"));
        words.add(new Word("vex", "annoy or bother; puzzle or distress"));
        words.add(new Word("vestige", "Trace or sign of something that once existed"));
        words.add(new Word("vernal", "Relating to the spring; fresh, youthful"));
        words.add(new Word("verisimilitude", "Having the appearance of truth, probable"));
        words.add(new Word("verdant", "Green, such as with vegetation, plants, grass"));
        words.add(new Word("variegated", "Varied in color, having multicolored patches"));
        words.add(new Word("terrestrial", "Relating to the Earth or to land; worldly"));
        words.add(new Word("tendentious", "Marked by a strong point of view, biased"));
        words.add(new Word("tawdry", "Gaudy, cheap or cheap-looking; indecent"));
        words.add(new Word("syntax", "The rules governing grammar and how words join to make sentences"));
        words.add(new Word("synoptic", "Relating to a synopsis or summary; giving a general view"));
        words.add(new Word("symbiosis", "Mutually dependent relationship between two organisms"));
        words.add(new Word("sybarite", "Person devoted to pleasure and luxury"));
        words.add(new Word("surrogate", "Substitute, person who acts for another"));
        words.add(new Word("surly", "Bad-tempered, hostile, unfriendly, or rude"));
        words.add(new Word("supposition", "Assumption, hypothesis, something that has been supposed"));
        words.add(new Word("supplant", "Take the place of, displace"));
        words.add(new Word("sully", "Make dirty, stain, tarnish, defile"));
        words.add(new Word("subpoena", "A court order requiring a person to appear in court and give testimony"));
        words.add(new Word("sublime", "Lofty or elevated, inspiring reverence or awe"));
        words.add(new Word("strut", "A structural support or brace"));
        words.add(new Word("stratum", "One of many layers"));
        words.add(new Word("stratagem", "Military maneuver to deceive or surprise; crafty scheme"));
        words.add(new Word("stipulate", "Specify; make an open demand, esp. as a condition of agreement"));
        words.add(new Word("stint", "Period of time spent doing something, or a specific, limited amount of work"));
        words.add(new Word("stigma", "Mark of disgrace, a figurative stain or mark on someone's reputation"));
        words.add(new Word("stentorian", "Very loud and powerful"));
        words.add(new Word("steeped", "Immersed, saturated"));

        TextView meaningView = findViewById(R.id.word_meaning);
        meaningView.setVisibility(View.GONE);

        TextView textMessage = findViewById(R.id.text_message);
        textMessage.setVisibility(View.GONE);

        TextView btnCorrect = findViewById(R.id.button_right);
        btnCorrect.setVisibility(View.GONE);

        TextView btnWrong = findViewById(R.id.button_wrong);
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
