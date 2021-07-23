package com.example.android.flashcardsapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class ManDeckEight extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mandeck8);
        call();
    }

    public void btnCorrectClick (View view) {
        setContentView(R.layout.mandeck8);
        call();
    }

    public void btnWrongClick (View view) {
        setContentView(R.layout.mandeck8);
        call();
    }

    private void call () {
        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("munificent", "Generous, giving liberally"));
        words.add(new Word("multifarious", "Diverse, having a lot of variety"));
        words.add(new Word("morose", "Gloomy, sullen"));
        words.add(new Word("monastic", "Relating to or resembling a monastery"));
        words.add(new Word("molt", "Shed or cast off, esp. to regularly shed skin, feathers"));
        words.add(new Word("modish", "Stylish, contemporary"));
        words.add(new Word("modicum", "A little bit or limited quantity"));
        words.add(new Word("missive", "Letter, written message"));
        words.add(new Word("misanthrope", "Hater of humankind"));
        words.add(new Word("mirth", "Jollity, merriment; amusement or laughter"));
        words.add(new Word("mired", "Stuck, entangled"));
        words.add(new Word("militate", "Have a great effect, weigh heavily"));
        words.add(new Word("milieu", "Environment, atmosphere; the environmental setting in which something happens or develops"));
        words.add(new Word("metaphysical", "Concerned with abstract thought, related to metaphysics"));
        words.add(new Word("meretricious", "Attractive in a vulgar or flashy way, tawdry; deceptive"));
        words.add(new Word("mendicant", "Beggar, or religious follower who lives by begging"));
        words.add(new Word("maxim", "A general truth or fundamental principle, esp. expressed as a proverb or saying"));
        words.add(new Word("maudlin", "Excessively sentimental"));
        words.add(new Word("martinet", "strict disciplinarian"));
        words.add(new Word("mar", "Damage, spoil, ruin"));
        words.add(new Word("mannered", "Having a particular manner, esp. an artificial one"));
        words.add(new Word("manifest", "to show, make clear, or prove"));
        words.add(new Word("malinger", "Pretend to be sick, esp. to get out of work"));
        words.add(new Word("malediction", "A Curse"));
        words.add(new Word("jingoism", "Excessive, loud patriotism and aggressive"));
        words.add(new Word("jettison", "Discard, cast off"));
        words.add(new Word("itinerary", "Travel schedule; detailed plan for a journey"));
        words.add(new Word("itinerant", "Traveling from place to place, esp. as part of a job"));
        words.add(new Word("irresolute", "not sure how to proceed, not firm in one's decision-making"));
        words.add(new Word("irascible", "Irritable, easily angered"));
        words.add(new Word("invidious", "Hateful, offensive, injurious"));
        words.add(new Word("investiture", "Investing; formally giving someone a right or title"));
        words.add(new Word("inveigle", "get something by flattery, cleverness"));
        words.add(new Word("invective", "accusations, insults, or verbal abuse"));
        words.add(new Word("inure", "Toughen up; accustom or habituate to pain, hardship"));
        words.add(new Word("inundate", "Flood, cover with water, overwhelm"));
        words.add(new Word("intransigent", "Refusing to compromise, inflexible"));
        words.add(new Word("interregnum", "a period during which government does not function"));
        words.add(new Word("interplay", "Interaction, reciprocal relationship or influence"));
        words.add(new Word("inter", "Bury or place in a tomb"));
        words.add(new Word("insurrection", "Rebellion or revolt against a government or similarly established authority"));
        words.add(new Word("insular", "narrow-minded, provincial"));
        words.add(new Word("insipid", "Dull, stale, lacking taste or interest"));
        words.add(new Word("insinuate", "Hint, suggest slyly; introduce"));
        words.add(new Word("insensible", "Incapable of feeling; unconscious, unaware"));
        words.add(new Word("inquest", "Legal or judicial inquiry"));
        words.add(new Word("inordinate", "Excessive, not within proper limits, unrestrained"));
        words.add(new Word("iniquity", "Injustice, wickedness, sin"));
        words.add(new Word("idolatry", "Idol worship; excessive or unthinking devotion or adoration"));
        words.add(new Word("iconoclast", "Attacker of cherished beliefs or institutions"));

        TextView meaningView = findViewById(R.id.word_meaning);
        meaningView.setVisibility(View.GONE);

        TextView textMessage = findViewById(R.id.text_message);
        textMessage.setVisibility(View.GONE);

        TextView btnCorrect = findViewById(R.id.button_right);
        btnCorrect.setVisibility(View.GONE);

        TextView btnWrong = findViewById(R.id.button_wrong);
        btnWrong.setVisibility(View.GONE);

        TextView meaning = (TextView) findViewById(R.id.cw_8_word_meaning);
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
        TextView quantityTextView = findViewById(R.id.cw_8_word);
        quantityTextView.setText(words.get(number).getWord());
        meaningView.setText(words.get(number).getMeaning());
    }
}
