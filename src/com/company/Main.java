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


        ArrayList<String> months1 = new ArrayList<>();
        months1.add("March");
        months1.add("April");
        months1.add("January");
        months1.add("June");
        months1.add("Jule");
        months1.add("August");
        months1.add("September");
        System.out.println("This is 'months1' array");
        for (String month : months1) {
            System.out.print(month + " ,");
        }

        System.out.println();
        System.out.println("'months' equals 'weekDays' = " + months.equals(weekDays));
        System.out.println("'months' equals 'months1' = " + months.equals(months1));
    }
}

