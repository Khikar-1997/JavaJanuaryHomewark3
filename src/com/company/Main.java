package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(34);
        numbers.add(28);
        numbers.add(1);
        numbers.add(78);
        numbers.add(100);

        System.out.print("The searching object is in 'numbers' array,and the objects index is ");
        System.out.println(numbers.indexOf(78) + ".");
    }
}
