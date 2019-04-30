package com.example.piano;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer[] btn1Sound = {MediaPlayer.create(this, R.raw.note1)};
        final MediaPlayer[] btn2Sound = {MediaPlayer.create(this, R.raw.note2)};
        final MediaPlayer[] btn3Sound = {MediaPlayer.create(this, R.raw.note3)};
        final MediaPlayer[] btn4Sound = {MediaPlayer.create(this, R.raw.note4)};
        final MediaPlayer[] btn5Sound = {MediaPlayer.create(this, R.raw.note5)};
        final MediaPlayer[] btn6Sound = {MediaPlayer.create(this, R.raw.note6)};
        final MediaPlayer[] btn7Sound = {MediaPlayer.create(this, R.raw.note7)};

        final Button b1 = findViewById(R.id.button1);
        final Button b2 = findViewById(R.id.button2);
        final Button b3 = findViewById(R.id.button3);
        final Button b4 = findViewById(R.id.button4);
        final Button b5 = findViewById(R.id.button5);
        final Button b6 = findViewById(R.id.button6);
        final Button b7 = findViewById(R.id.button7);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (btn1Sound[0].isPlaying()) {
                        btn1Sound[0].stop();
                        btn1Sound[0].release();
                        btn1Sound[0] = MediaPlayer.create(context, R.raw.note1);
                    } btn1Sound[0].start();
                } catch(Exception e) { e.printStackTrace(); }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (btn2Sound[0].isPlaying()) {
                        btn2Sound[0].stop();
                        btn2Sound[0].release();
                        btn2Sound[0] = MediaPlayer.create(context, R.raw.note2);
                    } btn2Sound[0].start();
                } catch(Exception e) { e.printStackTrace(); }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (btn3Sound[0].isPlaying()) {
                        btn3Sound[0].stop();
                        btn3Sound[0].release();
                        btn3Sound[0] = MediaPlayer.create(context, R.raw.note3);
                    } btn3Sound[0].start();
                } catch(Exception e) { e.printStackTrace(); }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (btn4Sound[0].isPlaying()) {
                        btn4Sound[0].stop();
                        btn4Sound[0].release();
                        btn4Sound[0] = MediaPlayer.create(context, R.raw.note4);
                    } btn4Sound[0].start();
                } catch(Exception e) { e.printStackTrace(); }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (btn5Sound[0].isPlaying()) {
                        btn5Sound[0].stop();
                        btn5Sound[0].release();
                        btn5Sound[0] = MediaPlayer.create(context, R.raw.note5);
                    } btn5Sound[0].start();
                } catch(Exception e) { e.printStackTrace(); }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (btn6Sound[0].isPlaying()) {
                        btn6Sound[0].stop();
                        btn6Sound[0].release();
                        btn6Sound[0] = MediaPlayer.create(context, R.raw.note6);
                    } btn6Sound[0].start();
                } catch(Exception e) { e.printStackTrace(); }
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (btn7Sound[0].isPlaying()) {
                        btn7Sound[0].stop();
                        btn7Sound[0].release();
                        btn7Sound[0] = MediaPlayer.create(context, R.raw.note7);
                    } btn7Sound[0].start();
                } catch(Exception e) { e.printStackTrace(); }
            }
        });

        }
}
