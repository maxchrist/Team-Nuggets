/**
 * Created by jessicalin on 12/9/17.
 */

public static void main(){
    Model model; /**create model*/
    char command; /**from GUI??*/
    do
        {
        Scanner s = new Scanner(System.in);/**gets command*/
        command=s.next();
        if(command==NULL)//no command
        {
            command='S'
        }
        do_command(model, command);

        }
        while(command!='Q');

}
