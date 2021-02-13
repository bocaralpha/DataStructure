package com.datastructure.Sorting;

public class SelectionSort {

    public void sort(int[] array) {
         for (int i = 0; i < array.length; i++) {
             var minIndex = i;
             for (int j = i; j < array.length; j++) {
                 if (array[j] < array[minIndex]) {
                     minIndex = j;
                    new Swap().swap(minIndex, i, array);
                 }
             }
         }
    }
}
