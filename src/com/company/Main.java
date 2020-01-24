package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> weekDays = new ArrayList<>();
        weekDays.add("Monday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");
        System.out.println("This is 'weekDays' array before replace.");
        for (String weekDay : weekDays) {
            System.out.print(weekDay + " ,");
        }
        System.out.println();

        weekDays.set(1, "Tuesday");
        System.out.println("This is 'months' array after replace.");
        System.out.println(weekDays);
    }
}

