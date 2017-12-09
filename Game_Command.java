package com.nuggets.gui_v1;

/**
 * Created by jessicalin on 12/9/17.
 */
// returns true if chicken is dead
    boolean do_command(Model model, char command)
    {
       boolean isdead;
        if (command=='U')//some sort of bool from gui??
        {
            isdead = model.update('U');
        }
        else if (command=='D') {
            isdead = model.update('D');
        }
        else if (command=='S'){
            isdead = model.update('S');
        }
        
        return isdead;

    }


