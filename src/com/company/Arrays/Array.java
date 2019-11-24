package com.company.Arrays;

import java.util.Arrays;

public class Array {
    private int[] numbers;
    private int count;

    public Array(int length) {
        this.numbers = new int[length];
    }


    public String createList() {
        numbers[0] = 0;
        numbers[1] = 1;
        numbers[2] = 2;
        System.out.println(Arrays.toString(numbers));
        return Arrays.toString(numbers);
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(numbers[i]);
        }
    }

    public void insert(int number) {
        if (numbers.length == count) {
            int[] newNumbers = new int[count * 2];
            for (int i = 0; i < count; i++) {
                newNumbers[i] = numbers[i];
            }
            numbers = newNumbers;
        }
        numbers[count++] = number;
    }

    public void removeAt(int index) {
        if (index < 0 || index > count) {
          throw new IllegalArgumentException();
        }
        // faire reculer les index a partir de cet index vers la fin de la liste
        for (int i = index; i < count; i++)  {
            numbers[i] = numbers[i + 1];
        }
        count --;
    }

    public int indexOf(int number) {
        for(int index = 0; index < count; index++) {
            if (numbers[index] == number) {
                System.out.println(index);
                return index;
            }
        }
        return -1;
    }
}

