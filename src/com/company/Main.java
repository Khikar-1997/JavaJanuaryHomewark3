package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("White");
        System.out.println("The 'colors' array before adding element");

        for (String color : colors) {
            System.out.print(color + " ,");
        }

        System.out.println();
        System.out.println();
        System.out.println("The 'colors' array after adding element");

        colors.add(0,"Orange");
        for (String color : colors) {
            System.out.print(color + " ,");
        }
    }
}
