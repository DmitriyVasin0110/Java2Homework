package com.company.homework1;

public class Main {
    public static void main(String[] args) {
        Obstacle[] obstacles = {
                new Wall(2),
                new Wall(3),
                new Treadmill(23),
                new Treadmill(40)
        };

        JumpRunnable[] members = {
                new Human("Иван", 2, 20),
                new Human("Настя", 1, 15),
                new Cat("Барсик", 2, 30),
                new Cat("Снежок", 3, 25),
                new Robot("Robo1", 5, 50),
                new Robot("Robo2", 6, 70),
                new Robot("Robo3", 1, 22)
        };

        for (JumpRunnable member : members) {
            boolean winner = true;
            for (Obstacle obstacle : obstacles) {
                if (obstacle.toJump(member.getMaxHeight()) || obstacle.toRun(member.getMaxLength())){
                    System.out.println(member.getName() + " препятствие пройдено");

                }
                    else {
                    System.out.println(member.getName() + " полоса препятсвий не пройдена");
                    winner = false;
                    break;
                }
            }
            if (winner){
                System.out.println(member.getName() + " прошел полосу препятствий");
            }
            System.out.println();
        }
    }
}
