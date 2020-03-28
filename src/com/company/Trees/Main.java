package com.company.Trees;

public class Main {
    public static void main( String[] arg) {
       Tree tree = new Tree();
       tree.insert(2);
       tree.insert(5);
       tree.insert(9);
       tree.insert(1);
       tree.insert(4);
       //System.out.print("a");
       boolean result = tree.find(6);
       //System.out.print(result);
       tree.traversePreOrder();
       tree.traversePostOrder();
       tree.traversePreOrder();
    }
}
