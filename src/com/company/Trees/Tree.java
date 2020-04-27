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

    private void traversePreOrder(Node node) {
        var root = node;
        if (root == null) {
            return ;
        }
        System.out.print(root.value);
        traversePreOrder(root.leftNode);
        traversePreOrder(root.rightNode);
    }

    private void traversePostOrder(Node node) {
        var root = node;
        if (root == null) {
            return ;
        }
        traversePostOrder(root.leftNode);
        traversePostOrder(root.rightNode);
        System.out.print(root.value);
    }

    private void traverseInOrder(Node node) {
        var root = node;
        if (root == null) {
            return ;
        }
        traversePreOrder(root.leftNode);
        System.out.print(root.value);
        traversePreOrder(root.rightNode);
    }

    public void traversePreOrder() {
        traversePreOrder(root);
    }
    public void traversePostOrder() {
        traversePostOrder(root);
    }

    private class Node {
        int value;
        Node leftNode;
        Node rightNode;

        public Node(int value) {
            this.value = value;
        }
    }

    public int height() {
       return height(root);
    }

    public int height(Node root) {
        if (root == null) {
            return -1;
        }
        if (root.leftNode == null && root.rightNode == null) {
            return 0;
        }
        return 1 + Math.max(height(root.leftNode), height(root.leftNode));

    }
}
