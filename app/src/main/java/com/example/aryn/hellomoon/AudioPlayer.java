package com.example.aryn.hellomoon;

import android.content.Context;
import android.media.MediaPlayer;

/**
 * Created by user on 07.03.2016.
 */
public class AudioPlayer {
    private MediaPlayer mPlayer;

    public void stop(){
        if(mPlayer != null){
            mPlayer.release();
            mPlayer = null;
        }
    }

    public void play(Context c){
        stop();
        mPlayer = MediaPlayer.create(c, R.raw.one_small_step);
        mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stop();
            }
        });
        mPlayer.start();
    }
}
