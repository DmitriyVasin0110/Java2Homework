package com.company.homework1;

public class Wall implements Obstacle{
    private int height;

    Wall(int height){
        this.height = height;
    }

    @Override
    public boolean toJump(int maxHeight) {
        return(maxHeight > height);
    }
    @Override
    public boolean toRun(int maxLength) {
        return false;
    }

    public int getHeight(int height) {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
}
