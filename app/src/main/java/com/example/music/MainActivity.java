package com.example.music;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mp;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mp = MediaPlayer.create(getApplicationContext(), R.raw.ezhel);
        b1 = findViewById(R.id.button1);
        //b1.setBackground(getResources().getDrawable(R.drawable.crew));

    }

    public void play(View v){
        mp.start();
    }

    public void stop(View v){
        mp.stop();
        try {
            mp.prepare();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void pause(View v){
        mp.pause();
    }

}


