package com.nuggets.gui_v1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class help_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_screen);
    }

    /**v3 (12/6, Caitlin): added button capability
     * Calls up main menu screen when the user taps the Back button */
    public void display_main(View view) {
        Intent intent = new Intent(this, main_screen.class);
        startActivity(intent);
    }
}
