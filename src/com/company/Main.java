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

        System.out.println(colors.get(2));
    }
}
