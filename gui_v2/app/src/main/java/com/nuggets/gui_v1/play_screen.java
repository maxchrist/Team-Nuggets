package com.nuggets.gui_v1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class play_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_screen);
    }

    /**v4 (12/9, Caitlin): added back button capability
     * Calls up main_screen when the user taps the Quit button */
    public void display_main(View view) {
        Intent intent = new Intent(this, main_screen.class);
        startActivity(intent);
}
