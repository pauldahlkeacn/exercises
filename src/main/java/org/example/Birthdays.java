package org.example;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Birthdays {

    private final Map<String, LocalDate> birthdays;

    public Birthdays(Map<String, LocalDate> birthdays) {
        this.birthdays = birthdays;
    }

    public void add(String name, LocalDate date) {
        if (!birthdays.containsKey(name)) {
            birthdays.put(name, date);
        }
    }

    public LocalDate get(String name) {
        return birthdays.get(name);
    }

    public void update(String name, LocalDate date) {
        if (birthdays.containsKey(name)) {
            birthdays.put(name, date);
        }
    }

    public void remove(String name) {
        birthdays.remove(name);
    }

    public static void main(String[] args) {
        Birthdays birthdays1 = new Birthdays(new HashMap<>());

        birthdays1.add("Paul", LocalDate.of(1999, 9, 16));
        System.out.println(birthdays1.get("Paul"));
        System.out.println(birthdays1.get("Sören"));
        birthdays1.update("Paul", LocalDate.of(1999, 10, 16));
        System.out.println(birthdays1.get("Paul"));
        birthdays1.remove("Paul");
        System.out.println(birthdays1.get("Paul"));
        birthdays1.remove("Sören");
    }

}
