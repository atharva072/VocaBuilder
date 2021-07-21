package com.example.android.flashcardsapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class ManDeckOne extends AppCompatActivity {
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mandeck1);
        call();
    }

    public void btnCorrectClick (View view) {
        setContentView(R.layout.mandeck1);
        call();
    }

    public void btnWrongClick (View view) {
        setContentView(R.layout.mandeck1);
        call();
    }

    private void call () {
        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("abase", "Degrade or humble; to lower in rank, status, or esteem"));
        words.add(new Word("abeyance", "Temporary suspension, inactivity"));
        words.add(new Word("abreast", "Side-by-side"));
        words.add(new Word("abscission", "Cutting off; sudden termination"));
        words.add(new Word("abscond", "Depart suddenly and secretively"));
        words.add(new Word("abyss", "A deep and vast space or cavity; anything profound or infinite"));
        words.add(new Word("accede", "Agree, give consent"));
        words.add(new Word("accretion", "Gradual increase; an added part or addition"));
        words.add(new Word("acerbic", "Sour; harsh or severe"));
        words.add(new Word("acidulous", "Slightly acid or sour; sharp or caustic"));
        words.add(new Word("acumen", "Keen, quick, accurate insight or judgment"));
        words.add(new Word("adulterate", "Make impure by adding inappropriate or inferior ingredients"));
        words.add(new Word("adumbrate", "Give a rough outline of; foreshadow; reveal only partially; obscure"));
        words.add(new Word("aerie", "Dwelling or fortress built on a high place"));
        words.add(new Word("albeit", "Although, even though"));
        words.add(new Word("aloof", "Distant physically or emotionally; reserved; indifferent"));
        words.add(new Word("amalgamate", "Blend, merge, or unite"));
        words.add(new Word("ameliorate", "Improve; make better or more bearable"));
        words.add(new Word("amortize", "Gradually pay off a debt, or gradually write off an asset"));
        words.add(new Word("anachronism", "Something that is not in its correct historical time"));
        words.add(new Word("analgesia", "Pain relief; inability to feel pain"));
        words.add(new Word("annul", "Make void or null, cancel, abolish"));
        words.add(new Word("anodyne", "Medicine that relieves pain (noun); soothing, relieving pain"));
        words.add(new Word("antedate", "Be older than, precede in time; assign to an earlier date"));
        words.add(new Word("bifurcate", "To fork into two branches or divide into two halves"));
        words.add(new Word("bilk", "Cheat or defraud"));
        words.add(new Word("blight", "Disease that kills plants rapidly, or any cause of decay or destruction"));
        words.add(new Word("blithe", "excessively carefree"));
        words.add(new Word("bombastic", "far too showy or dramatic than is appropriate"));
        words.add(new Word("bonhomie", "Friendliness, open and simple good heartedness"));
        words.add(new Word("brandish", "Shake, wave, or flourish, as a weapon"));
        words.add(new Word("brook", "Suffer or tolerate"));
        words.add(new Word("bucolic", "suggesting a peaceful and pleasant view of rural life"));
        words.add(new Word("burnish", "Polish, make smooth and lustrous"));
        words.add(new Word("calumny", "Malicious lie intended to hurt someone's reputation"));
        words.add(new Word("canard", "Rumor, a false or baseless story"));
        words.add(new Word("cardinal", "Chief, most important"));
        words.add(new Word("catholic", "Universal, broad-minded"));
        words.add(new Word("chicanery", "Trickery, deception by knowingly false arguments"));
        words.add(new Word("circumscribe", "Strictly limit a role, range of activity, or area"));
        words.add(new Word("circumspect", "Cautious, prudent; careful to consider the circumstances and consequences"));
        words.add(new Word("clamber", "Climb awkwardly or with difficulty, scramble"));
        words.add(new Word("cloying", "Disgustingly or distastefully sweet"));
        words.add(new Word("coagulate", "Cause a liquid to become solid or semisolid"));
        words.add(new Word("coda", "A concluding event"));
        words.add(new Word("coffer", "Chest for storing valuables; financial resources, a treasury"));
        words.add(new Word("collude", "Conspire; cooperate for illegal or fraudulent purposes"));
        words.add(new Word("compendium", "Concise but complete summary; a list or collection"));
        words.add(new Word("complaisant", "Eager to please; cheerfully complying"));
        words.add(new Word("confound", "Confuse, frustrate; mix up or make worse"));

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
