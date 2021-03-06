package com.nuggets.gui_v1;

/**
 * Created by max on 12/4/17.
 */

public class Car {

    public CartPoint location = new CartPoint();
    public CartPoint prev_location = new CartPoint();
    public double speed;

    public Car()
    {
        location.x = 1.0;
        location.y = 1.0;
        speed = 1;
    }

    public Car(CartPoint inloc, double inspeed){
        location.x = inloc.x;
        location.y = inloc.y;
        prev_location.x = inloc.x;
        prev_location.y = inloc.y;
        speed = inspeed;
    }

    void update() {
        prev_location.x = location.x;
        if (location.x > 10 && speed > 0)
        {
            location.x = 0;
            prev_location.x = 0;
        }
        if (location.x < 0 && speed < 0)
        {
            location.x = 10;
            prev_location.x = 10;
        }
        location.x = location.x + speed;

    }
}
