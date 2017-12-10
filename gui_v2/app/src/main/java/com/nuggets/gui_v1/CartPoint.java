package com.nuggets.gui_v1;

/**
 * Created by jdgal on 12/4/2017.
 */

public class CartPoint {
    public double x;
    public double y;

    public CartPoint(){
        x = 5;
        y = 0;
    }

    public CartPoint(double ix, double iy){
        x = ix;
        y = iy;
    }

    public boolean equals(CartPoint otherPoint) {
        if ((this.x == otherPoint.y) && (this.y == otherPoint.y)){
            return true;
        }
        else
            return false;
    }
}
