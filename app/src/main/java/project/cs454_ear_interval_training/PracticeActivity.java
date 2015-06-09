package project.cs454_ear_interval_training;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.HashMap;

public class PracticeActivity extends ActionBarActivity {

    private final int max_interval = 13;
    private boolean[] available_interval = new boolean[max_interval];
    private Button unison_button, minor2_button, major2_button,
            minor3_button, major3_button, perfect4_button, tritone_button,
            perfect5_button, minor6_button, major6_button, minor7_button,
            major7_button, octave_button, main_menu;
    private Context context;
    private int score, total, level;
    private HashMap<Integer, MediaPlayer> mPlayerHash;
    private HashMap<Integer, Button> buttonHash;
    private HashMap<Integer, String> buttonTextHash;
    private MediaPlayer mPlayerNote1, mPlayerNote2;
    private int answer_value, round_num, correct_num, attempt_num;

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        context = this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.practice_layout);

        Toast.makeText(getApplicationContext(), level + " PRACTICEACTIVITY", Toast.LENGTH_LONG).show();

        unison_button = (Button) findViewById(R.id.unison_button);
        final MediaPlayer mPlayer_unison = MediaPlayer.create(this, R.raw.c_unison);
        unison_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPlayer_unison.start();
            }
        });


        perfect4_button = (Button) findViewById(R.id.perfect4_button);
        final MediaPlayer mPlayer_perfect4 = MediaPlayer.create(this, R.raw.c_perfect4);
        perfect4_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPlayer_perfect4.start();
            }
        });



        perfect5_button = (Button) findViewById(R.id.perfect5_button);
        final MediaPlayer mPlayer_perfect5 = MediaPlayer.create(this, R.raw.c_perfect5);
        perfect5_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPlayer_perfect5.start();
            }
        });



        major2_button = (Button) findViewById(R.id.major2_button);
        final MediaPlayer mPlayer_major2 = MediaPlayer.create(this, R.raw.c_major2);
        major2_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPlayer_major2.start();
            }
        });



        major3_button = (Button) findViewById(R.id.major3_button);
        final MediaPlayer mPlayer_major3 = MediaPlayer.create(this, R.raw.c_major3);
        major3_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPlayer_major3.start();
            }
        });


        major6_button = (Button) findViewById(R.id.major6_button);
        final MediaPlayer mPlayer_major6 = MediaPlayer.create(this, R.raw.c_major6);
        major6_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPlayer_major6.start();
            }
        });



        major7_button = (Button) findViewById(R.id.major7_button);
        final MediaPlayer mPlayer_major7 = MediaPlayer.create(this, R.raw.c_major7);
       major7_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPlayer_major7.start();
            }
        });



        octave_button = (Button) findViewById(R.id.octave_button);
        final MediaPlayer mPlayer_octave = MediaPlayer.create(this, R.raw.c_octave);
        octave_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPlayer_octave.start();
            }
        });



        minor2_button = (Button) findViewById(R.id.minor2_button);
        final MediaPlayer mPlayer_minor2 = MediaPlayer.create(this, R.raw.c_minor2);
        minor2_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPlayer_minor2.start();
            }
        });



        minor3_button = (Button) findViewById(R.id.minor3_button);
        final MediaPlayer mPlayer_minor3 = MediaPlayer.create(this, R.raw.c_minor3);
        minor3_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPlayer_minor3.start();
            }
        });


        tritone_button = (Button) findViewById(R.id.tritone_button);




        minor6_button = (Button) findViewById(R.id.minor6_button);
        final MediaPlayer mPlayer_minor6 = MediaPlayer.create(this, R.raw.c_minor6);
        minor6_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPlayer_minor6.start();
            }
        });


        minor7_button = (Button) findViewById(R.id.minor7_button);
        final MediaPlayer mPlayer_minor7 = MediaPlayer.create(this, R.raw.c_minor7);
        minor7_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPlayer_minor7.start();
            }
        });

        main_menu = (Button) findViewById(R.id.rev_ans);
        main_menu.setOnClickListener (new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}