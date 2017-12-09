package com.example.jdgal.myapplication;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    
    Model model; /**create model*/
    char command; /**from GUI??*/
    double lane_num = 0;
    int num_lives = 3;
    do {

                if(command==NULL)//no command
                {
                        command='S'
                }else if (command == 'U' || command == 'D')
                {
                        boolean isdead = do_command(model, command);
                }
            
                if(boolean)
                {
                        num_lives--;
                }
                double newlane = model.chicken.getLocationY();
                lane_num = newlane;
        
        }
        while(command!='Q' && num_lives > 0);
        
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        
        
    final Button upButton = findViewById(R.id.button_id);
    upButton.setOnClickListener(new View.OnClickListener() {
    public void onClick(View v) {
                 // Code here executes on main thread after user presses button
            command = 'U';
    }
    });
        
    final Button downButton = findViewById(R.id.button_id);
    downButton.setOnClickListener(new View.OnClickListener() {
    public void onClick(View v) {
                 // Code here executes on main thread after user presses button
            command = 'D';
    }
    });
    
}
