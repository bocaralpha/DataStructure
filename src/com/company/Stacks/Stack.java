package com.company.Stacks;

import com.company.Arrays.Array;

import java.util.Arrays;

public class Stack {

    private int[] items = new int [5] ;
    private int count = 0;

    public boolean isBalanced(String str) {
        var stack = new java.util.Stack<Character>();
        for (Character ch: str.toCharArray()) {
            if (ch.equals('{')  || ch.equals('(') || ch.equals('<')  ) {
                stack.push(ch);
            }
            if (ch.equals('}') || ch.equals(')') || ch.equals('>')) {
                if (stack.isEmpty()) { return  false; }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public void push(int item) {
        if (items.length < count) {
            throw new StackOverflowError("Shit happen");
        }
        items[count] = item;
        count ++;
    }
    public int pop() {
        return  items[count --];
    }

    public String toString() {
       return Arrays.toString(items);
    }
}