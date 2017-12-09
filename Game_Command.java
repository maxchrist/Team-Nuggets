/**
 * Created by jessicalin on 12/9/17.
 */
    void do_command(Model model, char command)
    {
        if (command=='U')//some sort of bool from gui??
        {
            model.update('U')
        }
        else if (command=='D') {
            model.update('D');
        }
        else if (command=='S'){
            model.update('S');
        }

    }


