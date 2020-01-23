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

        System.out.println("This 'numbers' array");
        for (int number : numbers) {
            System.out.print(number + " ,");
        }

        System.out.println();
        ArrayList<Integer> copyNumbers = new ArrayList<>(numbers);
        System.out.println("And this is'copyNumbers' array,it is copy of 'numbers' array");
        for (Integer copyNumber : copyNumbers) {
            System.out.print(copyNumber + " ,");
        }
    }
}
