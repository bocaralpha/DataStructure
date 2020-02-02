package com.company.HashMap;

import java.util.Map;

public class CharFinder {

    public char firstNoRepetedCharacter(String string) {
        Map<Character, Integer> map = new java.util.HashMap<>();
        var chars = string.toCharArray();
        for (char ch: chars) {
            if (map.containsKey(ch)) {
                var count = map.get(ch) + 1;
                map.put(ch, count);
            } else {
                map.put(ch, 1);
            }
        }
        for (char ch: chars) {
            if (map.get(ch) == 1) {
                return ch;
            }
        }
    return Character.MIN_VALUE;
    }
}
