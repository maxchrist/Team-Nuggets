package com.nuggets.gui_v1;


public class Player {
    private CartPoint location = new CartPoint();
    private int level; // 1 - 3 for egg through chicken

    public Player(){
        level = 0;
    }

    public double getLocationX(){
        return location.x;
    }

    public double getLocationY(){
        return location.y;
    }

    public CartPoint getLocation(){
        return location;
    }

    public void moveUp(){
        location.y++;
    }

    public void moveDown(){
        location.y--;
    }

    public int getLevel(){
        return level;
    }

    public void levelUp() { level++; }

    public void resetLoc() { location = new CartPoint();}

}
