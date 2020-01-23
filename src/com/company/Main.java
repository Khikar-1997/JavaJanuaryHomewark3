package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add(" Red");
        colors.add(" Green");
        colors.add(" Yellow");
        colors.add(" Black");
        colors.add(" White");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.iterator());
        }
    }
}
