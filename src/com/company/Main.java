package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> months = new ArrayList<>();
        months.add("March");
        months.add("April");
        months.add("January");
        months.add("June");
        months.add("Jule");
        months.add("August");
        System.out.println("This is 'months' array before reverse");
        for (String month : months) {
            System.out.print(month + " ,");
        }
        System.out.println();
        System.out.println("This is 'months' array after reverse.");
        Collections.reverse(months);
        System.out.println(months);

    }
}

