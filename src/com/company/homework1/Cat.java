package com.company.homework1;

public class Cat implements JumpRunnable{
    private String name;
    private int maxLength;
    private int maxHeight;

    public Cat(String name, int maxHeight, int maxLength){
        this.name = name;
        this.maxHeight = maxHeight;
        this.maxLength = maxLength;
    }
    public void jump(){
        System.out.println("Cat jump");
    }
    public void run(){
        System.out.println("Cat run");
    }

    public int getMaxLength() {
        return maxLength;
    }
    public int getMaxHeight() {
        return maxHeight;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
