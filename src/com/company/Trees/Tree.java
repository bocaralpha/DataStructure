package com.company.Trees;

public class Tree {

    private Node root;

    public void insert(int value) {
        Node node = new Node(value);
        if (root == null) {
            root = node;
            return;
        }

        Node current = root;
        while (true) {
            if (value < current.value) {
                if (current.leftNode == null) {
                    current.leftNode = node;
                    break;
                }
                current = current.leftNode;
            }
            if (value > current.value) {
                if (current.rightNode == null) {
                    current.rightNode = node;
                    break;
                }
                current = current.rightNode;
            }
        }
    }

    private class Node {
        int value;
        Node leftNode;
        Node rightNode;

        public Node(int value) {
            this.value = value;
        }
    }
}
