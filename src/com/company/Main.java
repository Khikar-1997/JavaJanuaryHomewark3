package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> months = new ArrayList<>();
        months.add("March");
        months.add("April");
        months.add("January");
        months.add("June");
        months.add("Jule");
        months.add("August");
        months.add("September");
        System.out.println("This is 'months' array");
        for (String month : months) {
            System.out.print(month + " ,");
        }
        System.out.println();
        ArrayList<String> weekDays = new ArrayList<>();
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");
        System.out.println("This is 'weekDays' array");
        for (String weekDay : weekDays) {
            System.out.print(weekDay + " ,");
        }
        System.out.println();

        weekDays.addAll(months);
        System.out.println("This is 'weekDays' array merge with 'months' array");
        for (String weekDay : weekDays) {
            System.out.print(weekDay + " ,");
        }
    }
}

