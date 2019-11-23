package com.example.shape_it_final;

import android.content.Context;
import android.media.MediaPlayer;
import android.util.Log;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Star Class
 *
 * A Star is a type of GameItem that will appear in GameActivity to
 * be touched where it will then show its name and say its name
 *
 * Implements the GameItem Interface
 *
 *Methods:
 *  draw() - Draw will draw the GameItem on the screen
 *  showsName() - will make the name of the GameItem appear
 *  saysName() - will say the name of the GameItem
 *  clearName() - will clear the name from the screen
 */
public class Star implements GameItem {

    private String TAG = "SHAPEIT Star";
    private ImageButton starButton;
    private TextView starName;

    /**
     * Star Constructor
     *
     * Assigns the parameters to the method variables.
     * @param shapeButton - reference to the button on GameActivity
     * @param shapeName - reference to the TextView on GameActivity
     */
    Star(ImageButton shapeButton, TextView shapeName) {
        Log.i(TAG, "Started Star class");
        starButton = shapeButton;
        starName = shapeName;
    }

    @Override
    public void draw() {
        //this needs changed to Star image
        starButton.setImageResource(R.drawable.triangle_name);
        Log.i(TAG, "Drew a Square");
    }

    @Override
    public void showsName() {
        starName.setText("Star");
        Log.i(TAG, "Shows the Star Name");
    }

    @Override
    public void saysName(Context context) {
        //this needs changed to Star audio
        MediaPlayer mediaPlayer = MediaPlayer.create(context, R.raw.triangle_audio);
        mediaPlayer.start();
        Log.i(TAG, "Played the sound of the name of the Star");
    }

    @Override
    public void clearName() {
        starName.setText("");
        Log.i(TAG, "Cleared the Star Name");
    }
}