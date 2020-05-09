package com.company.Trees;

public class Main {
    public static void main( String[] arg) {
       Tree tree = new Tree();
       tree.insert(2);
       tree.insert(5);
       tree.insert(9);
       tree.insert(1);
       tree.insert(4);
       //boolean result = tree.find(6);
       //System.out.print(result);
       //tree.traversePreOrder();
       //tree.traversePostOrder();
       //tree.traversePreOrder();
       //System.out.print(tree.height());
       System.out.print(tree.min());
        Tree tree2 = new Tree();
        tree2.insert(2);
        tree2.insert(5);
        tree2.insert(9);
        tree2.insert(1);
        tree2.insert(4);
        System.out.print(tree.equals(tree2));
    }
}
