package com.company.homework3.task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Phonebook {

    HashMap<String, List<String>> phone_book = new HashMap<>();
    public Phonebook(){
    }

    public void add(String surname, String number){
        List<String> number_list;
        if(phone_book.containsKey(surname)){
            number_list = phone_book.get(surname);
        } else{
            number_list = new ArrayList<>();
        }
        number_list.add(number);
        phone_book.put(surname, number_list);
    }
    public List<String> get(String surname) {
        return phone_book.get(surname);
    }
}
