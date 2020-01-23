package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(34);
        numbers.add(28);
        numbers.add(1);
        numbers.add(78);
        numbers.add(100);

        System.out.println("This 'numbers' array before sorted.");
        for (int number : numbers) {
            System.out.print(number + " ,");
        }

        System.out.println();
        System.out.println("And this is 'numbers' array after sorted.");
        for (int i = 0; i < numbers.size(); i++) {
            Collections.sort(numbers);
        }
        System.out.println(numbers);
    }
}
