package com.company.homework1;

public class Treadmill implements Obstacle{
    private int length;
    Treadmill(int length){

        this.length = length;
    }

    @Override
    public boolean toJump(int maxHeight) {
        return false;
    }
    @Override
    public boolean toRun(int maxLength) {
        return (maxLength > length);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
