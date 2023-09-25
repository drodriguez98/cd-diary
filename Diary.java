package com.campusdual.poo.ex6_almacenamiento;

import java.util.HashMap;
import java.util.Map;

public class Diary {

    private Map<String, Contact> phoneBook = new HashMap<>();

    public Diary() {}

    public Map<String, Contact> getPhoneBook() {

        return phoneBook;

    }

    public void showPhoneBook() {

        for (Map.Entry<String, Contact> e: this.getPhoneBook().entrySet()) {

            System.out.println("DNI : " + e.getKey() + " CONTACTO : " + e.getValue());

        }

    }

}