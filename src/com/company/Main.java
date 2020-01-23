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
        months.add("September");
        System.out.println("This is 'months' array before elemenths swaping");
        for (String month : months) {
            System.out.print(month + " ,");
        }
        System.out.println();
        Collections.swap(months,0,2);
        System.out.println("This is 'months' array after elemenths swaping");
        System.out.println(months);
    }
}

