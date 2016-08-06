package com.lifeistech.android.game;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;

/**
 * Created by Life_is_Tech on 16/08/06.
 */
public class Clap {
    private SoundPool soundPool;
    private int soundId;

    public Clap(Context context) {
        soundPool = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        soundId = soundPool.load(context, R.raw.clap, 1);
    }

    public void play() {
        soundPool.play(soundId, 1.0F, 1.0F, 0, 0, 1.0F);

        soundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() {

            @Override
            public void onLoadComplete(SoundPool soundPool, int sampleId, int status) {

                if (0 == status) {
                    soundPool.play(sampleId, 1.0F, 1.0F, 0, 0, 1.0F);
                }
            }
        });
    }

}

