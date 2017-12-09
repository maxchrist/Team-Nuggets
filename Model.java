package com.nuggs.helloworld;

/**
 * Created by max on 12/4/17.
 */

public class Model {
    int lane_count;

    Car[] carArray = new Car[8];
    Player chicken;


    void Model(){

        carArray[0] = new Car();
        Cart_Point start1 = new Cart_Point(5, 1);
        carArray[1] = new Car(start1, 1);
        Cart_Point start2 = new Cart_Point(10,2);
        carArray[2] = new Car(start2, -2);
        Cart_Point start3 = new Cart_Point(5,2);
        carArray[3] = new Car(start3, -2);
        Cart_Point start4 = new Cart_Point(0,3);
        carArray[4] = new Car(start4, 3);
        Cart_Point start5 = new Cart_Point(5,3);
        carArray[5] = new Car(start5, 3);
        Cart_Point start6 = new Cart_Point(10,4);
        carArray[6] = new Car(start6, -4);
        Cart_Point start7 = new Cart_Point(5,4);
        carArray[7] = new Car(start7, -4);

    }

    void update() {
        for(int i=0; i<studentArray.length; i++ )
        {
            carArray[i].update;
        }
    }

}
