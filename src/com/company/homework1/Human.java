package com.company.homework1;

public class Human implements JumpRunnable{
    private String name;
    private int maxLength;
    private int maxHeight;

    public Human(String name, int maxHeight, int maxLength){
        this.name = name;
        this.maxHeight = maxHeight;
        this.maxLength = maxLength;
    }

    public void jump(){
        System.out.println("Human jump");
    }
    public void run(){
        System.out.println("Human run");
    }

    public int getMaxHeight() {
        return maxHeight;
    }
    public int getMaxLength() {
        return maxLength;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
