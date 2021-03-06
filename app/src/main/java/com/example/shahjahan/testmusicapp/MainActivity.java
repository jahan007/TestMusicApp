package com.example.shahjahan.testmusicapp;

import android.media.Image;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


   private MediaPlayer mediaPlayer;
   private ImageView artistImage;
   private TextView leftTime;
   private TextView rigthTime;
   private Button prevButton;
   private Button playButton;
   private Button nextButton;
   private SeekBar seekBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getUPUI();
    }

    public void getUPUI(){

        mediaPlayer = new MediaPlayer();
        mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.naruto);

        artistImage = (ImageView) findViewById(R.id.imageView2);
        leftTime = (TextView) findViewById(R.id.leftTime);
        rigthTime = (TextView) findViewById(R.id.rigthTime);
        prevButton = (Button) findViewById(R.id.prevButton);
        playButton = (Button) findViewById(R.id.playButton);
        nextButton = (Button) findViewById(R.id.nextButton);

        prevButton.setOnClickListener(this);
        playButton.setOnClickListener(this);
        nextButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.prevButton:

                break;

            case R.id.playButton:

                break;

            case R.id.nextButton:

                break;
        }
    }
    public void pauseMusic(){
        if(mediaPlayer != null){
            mediaPlayer.pause();
            playButton.setBackgroundResource(android.R.drawable.ic_media_play);

        }

    }
    public void startMusic(){

        if(mediaPlayer != null){
            mediaPlayer.start();
            playButton.setBackgroundResource(android.R.drawable.ic_media_pause);

        }

    }
}
