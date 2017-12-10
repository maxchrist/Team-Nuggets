package com.nuggets.gui_v1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class play_screen extends AppCompatActivity {

    //v5 (12/9, Caitlin): added back end classes

    public static double lane_num = 0;
    public static char command = 'n'; /**from GUI??*/
    public float chicken_loc = 0;
    public static Model model = new Model();

    static boolean do_command(Model model,char com)
    {
        boolean isdead = false;
        if(com=='U')//some sort of bool from gui??
        {
            isdead=model.update('U');
        }
        else if(com=='D'){
            isdead=model.update('D');
        }
        else {

        }

        return isdead;

    }

    public void mainLoop(){

//        lane_num = 5;
//        TextView textView = (TextView) findViewById(R.id.score_text);
//        textView.setText("Score: " + lane_num);

            boolean isdead = false;

            if (command == 'n')//no command
            {
                command = 'n';
            } else if (command == 'U' || command == 'D') {
                isdead = do_command(model, command);
            }

            if (isdead) {
                death();
            }
            double newlane = model.chicken.getLocationY();
            lane_num = newlane;

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

    // v5 (12/9, Caitlin): function called when up button is pressed
    // v7 (12/9, Max): move chicken up on screen when pressing up button
    public void upButton(View v)
    {
        chicken_loc = chicken_loc - 200;
        command = 'U';
        ImageView imageView = (ImageView) findViewById(R.id.chicken);
        if (chicken_loc < -800)
        {
            imageView.setTranslationY(-chicken_loc);
            chicken_loc = 0;
        }
        imageView.setTranslationY(chicken_loc);
        mainLoop();
        TextView textView = (TextView) findViewById(R.id.score_text);
        textView.setText("Score: " + lane_num);
    }

    // v5 (12/9, Caitlin): function called when down button is pressed
    // v7 (12/9, Max): move chicken down on screen when pressing down button
    public void downButton(View v)
    {
        chicken_loc = chicken_loc + 200;
        command = 'D';
        ImageView imageView = (ImageView) findViewById(R.id.chicken);
        if (chicken_loc > 0)
        {
            imageView.setTranslationY(-chicken_loc);
            chicken_loc = 0;
        }
        imageView.setTranslationY(chicken_loc);
        mainLoop();
        TextView textView = (TextView) findViewById(R.id.score_text);
        textView.setText("Score: " + lane_num);
    }

     boolean death() {
        Intent intent = new Intent(this, end_screen.class);
        startActivity(intent);
        return true;
    }

}
