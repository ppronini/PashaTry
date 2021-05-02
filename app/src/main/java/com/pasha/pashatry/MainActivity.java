package com.pasha.pashatry;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void playMp3(String nameOfFile){
        MediaPlayer mPlayer = MediaPlayer.create(this, getResources().getIdentifier(nameOfFile, "raw", getPackageName()));
        mPlayer.start();
    }

    public void playPhrase(View view) {

        Button buttonpressed=(Button) view;

        Log.i("Button pressed", buttonpressed.getTag().toString());

        String fileToPlay=buttonpressed.getTag().toString();

        Log.i("File Name",fileToPlay);

        playMp3(fileToPlay);

    }
}