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
        System.out.println("This is 'months' array before update");
        for (String month : months) {
            System.out.print(month + " ,");
        }
        System.out.println();
        months.remove(2);
        months.add("May");
        System.out.println("This is 'months' array after update.");
        for (String month : months) {
            System.out.print(month + " ,");
        }
    }
}

