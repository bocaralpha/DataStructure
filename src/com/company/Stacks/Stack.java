package com.company.Stacks;

public class Stack {

    public boolean isBalanced(String str) {
        var stack = new java.util.Stack<Character>();
        for (Character ch: str.toCharArray()) {
            if (ch.equals('{')) {
                stack.push(ch);
            }
            if (ch.equals('}')) {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
