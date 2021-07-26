package com.example.android.flashcardsapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class KapDeckSeven extends AppCompatActivity {
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kapdeck7);
        call();
    }

    public void btnCorrectClick (View view) {
        setContentView(R.layout.kapdeck7);
        call();
    }

    public void btnWrongClick (View view) {
        setContentView(R.layout.kapdeck7);
        call();
    }

    private void call () {
        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("LEVITY", "humor, frivolity, gaiety"));
        words.add(new Word("LEGERDEMAIN", "trickery"));
        words.add(new Word("LASSITUDE", "lethargy, sluggishness"));
        words.add(new Word("LARGESS", "generosity; gift"));
        words.add(new Word("LAPIDARY", "relating to precious stones"));
        words.add(new Word("LAMBASTE", "disapprove angrily"));
        words.add(new Word("LACHRYMOSE", "tearful"));
        words.add(new Word("KNELL", "sound of a funeral bell; omen of death or failure"));
        words.add(new Word("KISMET", "fate"));
        words.add(new Word("JURISPRUDENCE", "philosophy of law"));
        words.add(new Word("JUGGERNAUT", "huge force destroying everything in its path"));
        words.add(new Word("JOCULAR", "jovial, playful, humorous"));
        words.add(new Word("JINGOISM", "belligerent support of one’s country"));
        words.add(new Word("JIBE", "to shift suddenly from one side to the other"));
        words.add(new Word("ITINERANT", "wandering from place to place, unsettled"));
        words.add(new Word("INVIDIOUS", "likely to provoke ill will, offensive"));
        words.add(new Word("INVETERATE", "confirmed, long-standing, deeply rooted"));
        words.add(new Word("INURE", "to harden; accustom; become used to"));
        words.add(new Word("INTRINSIC", "inherent, internal"));
        words.add(new Word("INTREPID", "fearless"));
        words.add(new Word("INTIMATION", "clue, suggestion"));
        words.add(new Word("INTERSTICE", "a space between things"));
        words.add(new Word("INTERPOLATE", "to insert; change by adding new words or material"));
        words.add(new Word("INTERNECINE", "deadly to both sides"));
        words.add(new Word("INTERLOPER", "trespasser; meddler in others’ affairs"));
        words.add(new Word("INTERLOCUTOR", "someone taking part in a dialogue"));
        words.add(new Word("INTERDICT", "to forbid, prohibit"));
        words.add(new Word("INSUPERABLE", "insurmountable, unconquerable"));
        words.add(new Word("INSIDIOUS", "sly, treacherous, devious"));
        words.add(new Word("INNUENDO", "indirect and subtle criticism, insinuation"));
        words.add(new Word("INGRESS", "entrance"));
        words.add(new Word("INGRATIATE", "to bring oneself purposely into another’s good graces"));
        words.add(new Word("INGENIOUS", "original, clever, inventive"));
        words.add(new Word("INFALLIBLE", "incapable of making a mistake"));
        words.add(new Word("INERT", "unable to move, tending to inactivity"));
        words.add(new Word("INDUBITABLE", "unquestionable"));
        words.add(new Word("INDOLENT", "habitually lazy, idle"));
        words.add(new Word("INDIGENT", "very poor"));
        words.add(new Word("INDEFATIGABLE", "never tired"));
        words.add(new Word("INCULPATE", "to blame; charge with a crime"));
        words.add(new Word("INCULCATE", "to teach; impress in the mind"));
        words.add(new Word("INCENDIARY", "combustible, flammable, burning easily"));
        words.add(new Word("INCARNATE", "having bodily form"));
        words.add(new Word("IMPUGN", "to call into question, attack verbally"));
        words.add(new Word("IMPROMPTU", "spontaneous, without rehearsal"));
        words.add(new Word("IMPOLITIC", "unwise"));
        words.add(new Word("IMPERIOUS", "arrogantly self-assured, domineering, overbearing"));
        words.add(new Word("IMPECUNIOUS", "poor, having no money"));
        words.add(new Word("IMBUE", "to infuse; dye; wet, moisten"));
        words.add(new Word("ILLUSORY", "unreal, deceptive"));

        TextView meaningView = findViewById(R.id.word_meaning);
        meaningView.setVisibility(View.GONE);

        TextView textMessage = findViewById(R.id.text_message);
        textMessage.setVisibility(View.GONE);

        TextView btnCorrect = findViewById(R.id.button_right);
        btnCorrect.setVisibility(View.GONE);

        TextView btnWrong = findViewById(R.id.button_wrong);
        btnWrong.setVisibility(View.GONE);

        TextView meaning = (TextView) findViewById(R.id.cw_7_word_meaning);
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
        TextView quantityTextView = findViewById(R.id.cw_7_word);
        quantityTextView.setText(words.get(number).getWord());
        meaningView.setText(words.get(number).getMeaning());
    }
}
