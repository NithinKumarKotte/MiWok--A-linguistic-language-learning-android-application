package com.example.android.miwok;

import android.media.MediaPlayer;

/**
 * Created by Nithin on 04/19/2018.
 */

public class Word {



    private String mDefaultTranslation;

    private int image;

    private int  mediaPlayer;

    private String mMiwokTranslation;



    public Word(String mDefaultTranslation, String mMiwokTranslation, int image, int song){
        this.mDefaultTranslation=mDefaultTranslation;
        this.mMiwokTranslation=mMiwokTranslation;
        this.image=image;
        this.mediaPlayer = song;

    }

    public Word(String mDefaultTranslation,String mMiwokTranslation,int song){
        this.mDefaultTranslation=mDefaultTranslation;
        this.mMiwokTranslation=mMiwokTranslation;
        this.mediaPlayer = song;

    }

    public int getMediaPlayer() {
        return mediaPlayer;
    }
    public int getImage() {return image;}
    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }
    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }
}
