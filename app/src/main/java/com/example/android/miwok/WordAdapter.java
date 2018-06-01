package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nithin on 04/19/2018.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int color;
    private MediaPlayer mediaPlayer;

    public WordAdapter(Activity context, ArrayList<Word> words,int mcolor) {
        super(context,0, words);
        this.color=mcolor;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        final Word currentWord= getItem(position);

        View listitem= convertView;
        if(listitem==null){
            listitem= LayoutInflater.from(getContext()).inflate(R.layout.listitem,parent,false);
        }


 /*       RelativeLayout button = (RelativeLayout) listitem.findViewById(R.id.textcontainer);

        button.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                mediaPlayer = MediaPlayer.create(getContext(), currentWord.getMediaPlayer());
                mediaPlayer.start();

                return true;
            }
        });*/
        ImageView imageView = (ImageView) listitem.findViewById(R.id.iron);
        Log.v("outside Wordadapter",Integer.toString(currentWord.getImage()));
        if (currentWord.getImage()==0){
            Log.v("Inside Wordadapter",Integer.toString(currentWord.getImage()));
            imageView.setVisibility(View.GONE);


        }else{
            imageView.setImageResource(currentWord.getImage());
            imageView.setVisibility(View.VISIBLE);
        }



        TextView defaulttext = (TextView) listitem.findViewById(R.id.telugu);
        defaulttext.setText(currentWord.getmMiwokTranslation());
        defaulttext.setTextColor(getContext().getResources().getColor(R.color.White));


        TextView englishtext = (TextView) listitem.findViewById(R.id.english);
        englishtext.setText(currentWord.getmDefaultTranslation());
        englishtext.setTextColor(getContext().getResources().getColor(R.color.White));


        View textualColor = listitem.findViewById(R.id.textcontainer);

        int textcolor = ContextCompat.getColor(getContext(),color);

        textualColor.setBackgroundColor(textcolor);



        return listitem;
    }

}
