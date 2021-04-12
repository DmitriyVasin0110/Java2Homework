package com.company.homework3.task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "orange", "tangerine",
                "melon", "orange", "apple",
                "banana","kiwi", "pineapple","lemon",
                "orange","grapefruit","mango",
                "lime","apple","lemon", "mango"
        );
        Set<String> unique = new HashSet<>(fruits);

        Map<String, Integer> wordCount = new HashMap<>();
        for (String fruit : fruits) {
            if (!wordCount.containsKey(fruit)) {
                wordCount.put(fruit, 1);
            } else {
                wordCount.put(fruit, wordCount.get(fruit) + 1);
            }
        }
        System.out.println("Список уникальных слов: " + unique);
        System.out.println();
        for (Map.Entry entry : wordCount.entrySet()){
            System.out.println("Слово: " + entry.getKey() + "; Сколько раз встречается: " + entry.getValue());
        }
    }
}
