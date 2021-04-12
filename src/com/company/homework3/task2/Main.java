package com.company.homework3.task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Phonebook book1 = new Phonebook();

        book1.add("Петров", "89211234567");
        book1.add("Иванов", "89113457689");
        book1.add("Сидоров", "89104685989");
        book1.add("Котов", "89134578900");
        book1.add("Иванов", "89005553535");
        book1.add("Кузнецова","89142135467");

        System.out.println("Номер телефона Иванова: " + book1.get("Иванов"));
        System.out.println("Номер телефона Котова: " + book1.get("Котов"));
    }
}
