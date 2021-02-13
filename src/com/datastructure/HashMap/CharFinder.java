package com.datastructure.HashMap;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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

    public char firstRepetedCharacter(String string) {
        var chars = string.toCharArray();
        Set<Character> set = new HashSet<>();
        for (char ch: chars) {
            if (set.contains(ch)) {
                return ch;
            }
            set.add(ch);
        }
        return Character.MIN_VALUE;
    }
}
