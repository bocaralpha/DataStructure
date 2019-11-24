package com.company;

import com.company.Arrays.Array;

public class Main {

    public static void main(String[] args) {
      //new Array(3).createList();
      Array array = new Array(2);
      array.insert(10);
      array.insert(20);
      array.insert(30);
      array.removeAt(1);
      array.print();
    }
}
