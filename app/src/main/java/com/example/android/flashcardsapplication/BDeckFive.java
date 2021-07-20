package com.example.android.flashcardsapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class BDeckFive extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bdeck5);
        call5();
    }

    public void btnCorrectClick5 (View view) {
        setContentView(R.layout.bdeck5);
        call5();
    }

    public void btnWrongClick5 (View view) {
        setContentView(R.layout.bdeck5);
        call5();
    }

    private void call5 () {
        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("Luminous","shining; issuing light"));
        words.add(new Word("Magnanimity","Generosity"));
        words.add(new Word("Malingerer","one who feigns illness to escape duty"));
        words.add(new Word("Malleable","capable of being shaped by pounding; impressionable"));
        words.add(new Word("Maverick","rebel; nonconformist"));
        words.add(new Word("Mendacious","lying; habitually dishonest"));
        words.add(new Word("Metamorphosis","change of form"));
        words.add(new Word("Meticulous","excessively careful; painstaking; scrupulous"));
        words.add(new Word("Misanthrope","one who hates mankind"));
        words.add(new Word("Mitigate","appease; moderate"));
        words.add(new Word("Mollify","soothe"));
        words.add(new Word("Morose","ill-humored; sullen; melancholy"));
        words.add(new Word("Mundane","worldly as opposed to spiritual; everyday"));
        words.add(new Word("Negate","cancel out; nullify; deny"));
        words.add(new Word("Neophyte","recent convert; beginner"));
        words.add(new Word("Obdurate","stubborn"));
        words.add(new Word("Obsequious","lavishly attentive; servile; sycophantic"));
        words.add(new Word("Obviate","make unnecessary; get rid of"));
        words.add(new Word("Occlude","shut; close"));
        words.add(new Word("Officious","meddlesome; excessively pushy in offering one’s services\n"));
        words.add(new Word("Onerous","burdensome"));
        words.add(new Word("Opprobrium","infamy; vilification"));
        words.add(new Word("Oscillate","vibrate; waver"));
        words.add(new Word("Ostentatious","showy; pretentious; trying to attract attention"));
        words.add(new Word("Paragon","model of perfection"));
        words.add(new Word("Partisan","one-sided; prejudiced; committed to a party"));
        words.add(new Word("Pathological","pertaining to disease"));
        words.add(new Word("Paucity","Scarcity"));
        words.add(new Word("Pedantic","showing off learning; bookish"));
        words.add(new Word("Penchant","strong inclination; liking"));
        words.add(new Word("Penury","severe poverty; stinginess"));
        words.add(new Word("Perennial","something long-lasting"));
        words.add(new Word("Perfidious","treacherous; disloyal"));
        words.add(new Word("Perfunctory","superficial; not thorough; lacking interest, care, or enthusiasm"));
        words.add(new Word("Permeable","penetrable; porous; allowing liquids or gas to pass through"));
        words.add(new Word("Pervasive","spread throughout"));
        words.add(new Word("Phlegmatic","calm; not easily disturbed"));
        words.add(new Word("Piety","devoutness; reverence for God"));
        words.add(new Word("Placate","pacify; conciliate"));
        words.add(new Word("Plasticity","ability to be molded"));
        words.add(new Word("Platitude","trite remark; commonplace statement"));
        words.add(new Word("Plethora","excess; overabundance"));
        words.add(new Word("Plummet","fall sharply"));
        words.add(new Word("Porous","full of pores; like a sieve"));
        words.add(new Word("Pragmatic","practical (as opposed to idealistic); concerned with the practical worth or impact of something"));
        words.add(new Word("Preamble","introductory statement"));
        words.add(new Word("Precarious","uncertain; risky"));
        words.add(new Word("Precipitate","rash, premature, hasty, sudden"));
        words.add(new Word("Precursor","forerunner"));
        words.add(new Word("Presumptuous","arrogant; taking liberties"));

        TextView meaningView = findViewById(R.id.word_5_meaning);
        meaningView.setVisibility(View.GONE);

        TextView textMessage = findViewById(R.id.text_5_message);
        textMessage.setVisibility(View.GONE);

        TextView btnCorrect = findViewById(R.id.button_5_right);
        btnCorrect.setVisibility(View.GONE);

        TextView btnWrong = findViewById(R.id.button_5_wrong);
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
