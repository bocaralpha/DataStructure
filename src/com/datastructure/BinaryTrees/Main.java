package com.datastructure.BinaryTrees;

public class Main {
    public static void main( String[] arg) {
       Tree tree = new Tree();
       tree.insert(7);
       tree.insert(5);
       tree.insert(9);
       tree.insert(1);
       tree.insert(8);
       tree.insert(3);
       tree.insert(6);
       //boolean result = tree.find(6);
       //System.out.print(result);
       //tree.traversePreOrder();
       //tree.traversePostOrder();
       //tree.traversePreOrder();
       //System.out.print(tree.height());
       //System.out.print(tree.min());
        tree.printNodeAtDistance(1);
    }
}
