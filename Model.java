package com.nuggs.helloworld;

/**
 * Created by max on 12/4/17.
 */

public class Model {
    int lane_count;


    Car lane1_1;
    Cart_Point start1 = new Cart_Point(5, 1);
    Car lane1_2 = new Car(start1, 1);
    Cart_Point start2 = new Cart_Point(10,2);
    Car lane2_1 = new Car(start2, -2);
    Cart_Point start3 = new Cart_Point(5,2);
    Car lane2_2 = new Car(start3, -2);
    Cart_Point start4 = new Cart_Point(0,3);
    Car lane3_1 = new Car(start4, 3);
    Cart_Point start5 = new Cart_Point(5,3);
    Car lane3_2 = new Car(start5, 3);
    Cart_Point start6 = new Cart_Point(10,4);
    Car lane4_1 = new Car(start6, -4);
    Cart_Point start7 = new Cart_Point(5,4);
    Car lane4_2 = new Car(start7, -4);

    //Player chicken;

    void model(){


    }

}
