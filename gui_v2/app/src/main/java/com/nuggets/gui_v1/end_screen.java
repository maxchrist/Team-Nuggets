package com.nuggets.gui_v1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class end_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_screen);
    }

    // v8 (Caitlin, 12/9): go back to main screen if main screen button pressed
    public void display_main(View view) {
        Intent intent = new Intent(this, main_screen.class);
        startActivity(intent);
    }
}
