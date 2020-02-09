package com.company.Stacks;

import com.company.Arrays.Array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        boolean result = new Stack().isBalanced("<1 + 1>>");
        System.out.print(result);
        var stack = new Stack();
        stack.push(20);
        stack.push(30);
        stack.push(30);
        stack.push(30);
        stack.pop();
        System.out.print(stack.toString());
    }
}
