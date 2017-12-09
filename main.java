/**
 * Created by jessicalin on 12/9/17.
 */

public static void main(){
    Model model; /**create model*/
    char command; /**from GUI??*/
    double lane_num = 0;
    int num_lives = 3;
    do
        {
        Scanner s = new Scanner(System.in);/**gets command*/
        command=s.next();
        if(command==NULL)//no command
        {
            command='S'
        }
        boolean isdead = do_command(model, command);
        if(boolean)
        {
            num_lives--;
        }
        double newlane = model.chicken.getLocationY();
        lane_num = newlane;
        
        }
        while(command!='Q' && num_lives > 0);

}
