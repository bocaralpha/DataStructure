package com.company.Arrays;

import java.util.Arrays;

public class Array {
    int[] numbers = new int[3];

    public String createList() {
        numbers[0] = 0;
        numbers[1] = 1;
        numbers[2] = 2;
        return Arrays.toString(numbers);
    }

    public void print() {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}

