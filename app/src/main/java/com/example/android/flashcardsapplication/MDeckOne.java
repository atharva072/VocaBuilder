package com.example.android.flashcardsapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class MDeckOne extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mdeck1);
        call();
    }

    public void btnCorrectClick (View view) {
        setContentView(R.layout.mdeck1);
        call();
    }

    public void btnWrongClick (View view) {
        setContentView(R.layout.mdeck1);
        call();
    }

    private void call () {
        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("aberrant","markedly different from an accepted norm"));
        words.add(new Word("aberration","a deviation from what is normal or expected"));
        words.add(new Word("abstain"," choose not to consume or take part in"));
        words.add(new Word("abstruse","difficult to understand; incomprehensible"));
        words.add(new Word("accolade","an award or praise granted as a special honor"));
        words.add(new Word("acerbic","harsh in tone"));
        words.add(new Word("acrimony","bitterness and ill will"));
        words.add(new Word("adamant","refusing to change one's mind"));
        words.add(new Word("admonish","to warn strongly, even to the point of reprimanding"));
        words.add(new Word("admonitory","serving to warn"));
        words.add(new Word("aesthete","one who professes great sensitivity to the beauty of art and nature"));
        words.add(new Word("aesthetic","concerned with the appreciation of beauty"));
        words.add(new Word("amalgam","a mixture of multiple things"));
        words.add(new Word("ambiguous","open to more than one interpretation"));
        words.add(new Word("ambivalent","mixed or conflicting emotions about something"));
        words.add(new Word("ameliorate","make something bad better"));
        words.add(new Word("amenable","easily persuaded"));
        words.add(new Word("amorphous","shapeless"));
        words.add(new Word("anomalous","not normal"));
        words.add(new Word("anomaly","something that is not normal, standard, or expected"));
        words.add(new Word("antipathy","an intense feeling of dislike or aversion"));
        words.add(new Word("antithetical"," sharply contrasted in character or purpose"));
        words.add(new Word("apathetic","marked by a lack of interest"));
        words.add(new Word("apathy","an absence of emotion or enthusiasm"));
        words.add(new Word("apocryphal"," being of questionable authenticity"));
        words.add(new Word("appease","pacify by acceding to the demands of"));
        words.add(new Word("arbitrary","based on a random, groundless decision"));
        words.add(new Word("arcane","requiring secret or mysterious knowledge"));
        words.add(new Word("arduous","; testing powers of endurance"));
        words.add(new Word("artful","exhibiting artistic skill;  clever in a cunning way"));
        words.add(new Word("ascetic","practicing self-denial"));
        words.add(new Word("ascetic","with a look of suspicion or disapproval"));
        words.add(new Word("audacious","willing to be bold in social situations or to take risks"));
        words.add(new Word("audacity","aggressive boldness in social situations"));
        words.add(new Word("auspicious","favorable, the opposite of sinister"));
        words.add(new Word("austere","practicing self-denial;  harsh in manner of temperament"));
        words.add(new Word("avaricious","excessively greedy"));
        words.add(new Word("banal","repeated too often; overfamiliar through overuse"));
        words.add(new Word("banality","a trite or obvious remark"));
        words.add(new Word("belie"," to give a false representation to; misrepresent"));
        words.add(new Word("belligerent","characteristic of one eager to fight"));
        words.add(new Word("betray",": to reveal or make known something, usually unintentionally"));
        words.add(new Word("blatant","without any attempt at concealment; completely obvious"));
        words.add(new Word("bolster","support and strengthen"));
        words.add(new Word("bucolic","relating to the pleasant aspects of the country"));
        words.add(new Word("bumbling","lacking physical movement skills, especially with the hands"));
        words.add(new Word("burgeon","grow and flourish"));
        words.add(new Word("calumny","making of a false statement meant to injure a person\"s reputation\n"));
        words.add(new Word("capricious"," determined by chance or impulse"));
        words.add(new Word("castigate","to reprimand harshly"));

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
