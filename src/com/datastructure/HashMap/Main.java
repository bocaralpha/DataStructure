package com.datastructure.HashMap;

public class Main {
    public static void main(String[] args) {
        var charfinder = new CharFinder().firstNoRepetedCharacter("une intersection de coca cola");
        System.out.println(charfinder);
        var firstRepetedCharacter = new CharFinder().firstRepetedCharacter("une intersection de coca cola");
        System.out.println(firstRepetedCharacter);
    }
}