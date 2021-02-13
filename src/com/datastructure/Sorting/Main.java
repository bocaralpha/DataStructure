package com.datastructure.Sorting;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 2, 6, 0, 9, 7};
        new SelectionSort().sort(array);
        System.out.print(Arrays.toString(array));
    }
}
