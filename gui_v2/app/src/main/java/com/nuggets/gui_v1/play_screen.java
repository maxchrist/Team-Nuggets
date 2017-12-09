package com.nuggets.gui_v1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class play_screen extends AppCompatActivity {

    //v5 (12/9, Caitlin): added back end classes
    public double lane_num = 0;
    public char command = 'n'; /**from GUI??*/

    boolean do_command(Model model,char com)
    {
        boolean isdead = false;
        if(com=='U')//some sort of bool from gui??
        {
            isdead=model.update('U');
        }
        else if(com=='D'){
            isdead=model.update('D');
        }
        else if(com=='S'){
            isdead=model.update('S');
        }

        return isdead;

    }

    public void main(String[] args) {
        Model model = new Model(); /**create model*/

        int num_lives = 3;
        while (command != 'Q' && num_lives > 0) {

            boolean isdead = false;
            if (command == 'n')//no command
            {
                command = 'S';
            } else if (command == 'U' || command == 'D') {
                isdead = do_command(model, command);
            }

            if (isdead) {
                num_lives--;
            }
            double newlane = model.chicken.getLocationY();
            lane_num = newlane;

        }
    }

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

    //v5 (12/9, Caitlin): added back end classes
//    final Button upButton = findViewById(R.id.button_id);
//    upButton.setOnClickListener(new View.OnClickListener() {
//        public void onClick(View v) {
//            // Code here executes on main thread after user presses button
//            command = 'U';
//        }
//    })

    public void upButton(View v)
    {
        command = 'U';
    }

//    final Button downButton = findViewById(R.id.button_id);
//    downButton.setOnClickListener(new View.OnClickListener() {
//        public void onClick(View v) {
//            // Code here executes on main thread after user presses button
//            command = 'D';
//        }
//    })
//
    public void downButton(View v)
    {
        command = 'D';
    }


}
