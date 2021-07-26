package com.example.android.flashcardsapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class KapDeckThree extends AppCompatActivity {
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kapdeck3);
        call();
    }

    public void btnCorrectClick (View view) {
        setContentView(R.layout.kapdeck3);
        call();
    }

    public void btnWrongClick (View view) {
        setContentView(R.layout.kapdeck3);
        call();
    }

    private void call () {
        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("LISSOME", "easily flexed, limber, agile"));
        words.add(new Word("LUGUBRIOUS", "sorrowful, mournful"));
        words.add(new Word("MACABRE", "gruesome, producing horror"));
        words.add(new Word("MACHINATION", "plot or scheme"));
        words.add(new Word("MALAPROPISM", "humorous misuse of a word"));
        words.add(new Word("MALEVOLENT", "ill-willed; causing evil or harm to others"));
        words.add(new Word("MANIFOLD", "diverse, varied; comprised of many parts"));
        words.add(new Word("MARTINET", "strict disciplinarian; one who rigidly follows rules"));
        words.add(new Word("MAUDLIN", "overly sentimental"));
        words.add(new Word("MAWKISH", "sickeningly sentimental"));
        words.add(new Word("MEGALOMANIA", "mental state with delusions of wealth and power"));
        words.add(new Word("MENDACIOUS", "dishonest"));
        words.add(new Word("MENDICANT", "beggar"));
        words.add(new Word("MERCURIAL", "quick, shrewd, and unpredictable"));
        words.add(new Word("MERITORIOUS", "deserving reward or praise"));
        words.add(new Word("MINATORY", "menacing, threatening"));
        words.add(new Word("MNEMONIC", "relating to memory; designed to assist memory"));
        words.add(new Word("MOLT", "to shed hair, skin, or an outer layer periodically"));
        words.add(new Word("MORDANT", "caustic, biting"));
        words.add(new Word("MOTE", "small particle, speck"));
        words.add(new Word("MULTIFARIOUS", "diverse"));
        words.add(new Word("MUNIFICENT", "Generous"));
        words.add(new Word("NADIR", "lowest point"));
        words.add(new Word("NASCENT", "starting to develop, coming into existence"));
        words.add(new Word("NEBULOUS", "vague, cloudy"));
        words.add(new Word("NECROMANCY", "black magic"));
        words.add(new Word("NEFARIOUS", "vicious, evil"));
        words.add(new Word("NEOLOGISM", "new word or expression"));
        words.add(new Word("NEOPHYTE", "novice, beginner"));
        words.add(new Word("NIHILISM", "belief that existence and all traditional values are meaningless"));
        words.add(new Word("NOISOME", "stinking, putrid"));
        words.add(new Word("NOXIOUS", "harmful, unwholesome"));
        words.add(new Word("NUMISMATICS", "coin collecting"));
        words.add(new Word("OBFUSCATE", "to confuse, obscure"));
        words.add(new Word("OBSTREPEROUS", "troublesome, boisterous, unruly"));
        words.add(new Word("OMNIPOTENT", "having unlimited power"));
        words.add(new Word("OMNISCIENT", "having infinite knowledge"));
        words.add(new Word("OSCILLATE", "to move back and forth"));
        words.add(new Word("OUSTER", "expulsion, ejection"));
        words.add(new Word("PAEAN", "a song of praise or thanksgiving"));
        words.add(new Word("PALLIATE", "to make less serious, ease"));
        words.add(new Word("PANACEA", "cure-all"));
        words.add(new Word("PANEGYRIC", "elaborate praise; formal hymn of praise"));
        words.add(new Word("PANOPLY", "impressive array"));
        words.add(new Word("PARLEY", "discussion, usually between enemies"));
        words.add(new Word("PAROCHIAL", "of limited scope or outlook, provincial"));
        words.add(new Word("PARSIMONY", "stinginess"));
        words.add(new Word("PASTICHE", "piece of literature or music imitating other works"));
        words.add(new Word("REDRESS", "relief from wrong or injury"));
        words.add(new Word("REJOINDER", "response"));

        TextView meaningView = findViewById(R.id.word_meaning);
        meaningView.setVisibility(View.GONE);

        TextView textMessage = findViewById(R.id.text_message);
        textMessage.setVisibility(View.GONE);

        TextView btnCorrect = findViewById(R.id.button_right);
        btnCorrect.setVisibility(View.GONE);

        TextView btnWrong = findViewById(R.id.button_wrong);
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
