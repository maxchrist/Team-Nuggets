package com.nuggets.gui_v1;

/**
 * Created by max on 12/4/17.
 */

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.MotionEvent;

public class Car {

    Cart_Point location;
    Cart_Point prev_location;
    double speed;
    private Bitmap bitmap;
    private int x;
    private int y;

    public Car()
    {
        location.x = 1.0;
        x=1.0;
        y=1.0;
        location.y = 1.0;
        speed = 1;
    }

    public Car(Cart_Point inloc, double inspeed, Bitmap bitmap){
        this.bitmap=bitmap;
        location.x = inloc.x;
        location.y = inloc.y;
        x=inloc.x;
        y=inloc.y;
        prev_location.x = inloc.x;
        prev_location.y = inloc.y;
        speed = inspeed;
    }

    public Bitmap getBitmap()
    {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap)
    {
        this.bitmap=bitmap;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public void draw(Canvas canvas)
    {
        canvas.drawBitmap(bitmap, 5,5,NULL);
    }

    void update() {
        prev_location.x = location.x;
        location.x = location.x + speed;

    }
}
