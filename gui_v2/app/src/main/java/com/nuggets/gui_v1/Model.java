package com.nuggets.gui_v1;

/**
 * Created by max on 12/4/17.
 */

public class Model {

    public Car[] carArray = new Car[8];
    public Player chicken = new Player();


    public Model(){

        carArray[0] = new Car();
        CartPoint start1 = new CartPoint(5, 1);
        carArray[1] = new Car(start1, 1);
        CartPoint start2 = new CartPoint(10,2);
        carArray[2] = new Car(start2, -2);
        CartPoint start3 = new CartPoint(5,2);
        carArray[3] = new Car(start3, -2);
        CartPoint start4 = new CartPoint(0,3);
        carArray[4] = new Car(start4, 3);
        CartPoint start5 = new CartPoint(5,3);
        carArray[5] = new Car(start5, 3);
        CartPoint start6 = new CartPoint(10,4);
        carArray[6] = new Car(start6, -4);
        CartPoint start7 = new CartPoint(5,4);
        carArray[7] = new Car(start7, -4);

    }

    boolean update(char playCommand) {
        if (playCommand == 'U') { chicken.moveUp(); }
        else if (playCommand == 'D') { chicken.moveDown(); }
        else{

        }

        for(int i=1; i<carArray.length; i++ )
        {
            carArray[i].update();
        }

        for (int i =  1; i < carArray.length; i++)
        {
            if (chicken.getLocationX() >= carArray[i].prev_location.x &&
                    chicken.getLocationX() <= carArray[i].location.x) {
                return true;
            }
        }
        return false;
    }

}
