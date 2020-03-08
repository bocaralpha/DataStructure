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

    public boolean find(int value) {
        Node current = root;
        while (current != null) {
            if (value < current.value) {
                current = current.leftNode;
            }
            else if (value > current.value) {
                current = current.rightNode;
            } else {
                return true;
            }
        }
        return false;
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
