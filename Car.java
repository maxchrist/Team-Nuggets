package com.nuggs.helloworld;

/**
 * Created by max on 12/4/17.
 */

public class Car {

    Cart_Point location;
    Cart_Point prev_location;
    double speed;

    public Car()
    {
        location.x = 1.0;
        location.y = 1.0;
        speed = 1;
    }

    void Car(Cart_Point inloc, double inspeed){
        location.x = inloc.x;
        location.y = inloc.y;
        prev_location.x = inloc.x;
        prev_location.y = inloc.y;
        speed = inspeed;
    }

    void update() {
        prev_location.x = location.x;
        location.x = location.x + speed;

    }
}
