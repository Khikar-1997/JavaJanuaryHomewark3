package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("White");

        for (String s : colors) {
            System.out.println(s);
        }
        System.out.println();

        colors.remove(2);

        for (String color : colors) {
            System.out.println(color);
        }
    }
}
