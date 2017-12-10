package com.nuggets.gui_v1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class main_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
    }

    //v2 (12/4, Caitlin): added help button capability - Calls up help_screen (instruction screen) when the user taps the Help button
    public void display_instructions(View view) {
        Intent intent = new Intent(this, help_screen.class);
        startActivity(intent);
    }

    //v4 (12/6, Caitlin): added play button capability - Calls up play_screen (game screen) when the user taps the Play button
    public void display_game(View view) {
        Intent intent = new Intent(this, play_screen.class);
        startActivity(intent);
    }


}
