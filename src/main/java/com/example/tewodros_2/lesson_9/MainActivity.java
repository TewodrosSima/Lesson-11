package com.example.tewodros_2.lesson_9;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Window;

public class MainActivity extends Activity {

    MediaPlayer background;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(new GameView(this));

        background = MediaPlayer.create(MainActivity.this, R.raw.background);
        background.setLooping(true);
        background.start();

    }
    @Override
    protected void onPause(){
        super.onPause();
        background.release();
        finish();

    }
}
