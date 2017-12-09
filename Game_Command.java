/**
 * Created by jessicalin on 12/9/17.
 */

    void move_up(Model model)
    {
        CartPoint location=model.player.get_location();
        model.player->moveUp(location);
    }

    void move_down(Model& model)
    {
        CartPoint location=model.player.get_location();
        model.player.moveUp(location);
    }

    void do_command(Model& model)
    {
        if (go_up)//some sort of bool from gui??
        {
            move_up(model)
        }
        else (go_down) {
            move_down(model);
        }

    }


