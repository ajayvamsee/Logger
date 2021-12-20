package com.example.log;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    Button btnStart,btnStop;

    MediaPlayer mediaPlayer=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStart=findViewById(R.id.start);
        btnStop=findViewById(R.id.stop);



        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startAudio();
            }
        });

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                stopAudio();

            }
        });
    }

    private void startAudio() {
        if(mediaPlayer==null){
            mediaPlayer=MediaPlayer.create(this,R.raw.sunset_lover);
            mediaPlayer.setVolume(0.7f,0.7f);
            mediaPlayer.start();

        }
    }

    private void stopAudio() {
        //mediaPlayer.stop();
        mediaPlayer.pause();
    }


}