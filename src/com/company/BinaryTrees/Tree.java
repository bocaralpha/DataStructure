package com.company.BinaryTrees;

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

    public boolean isLeaf(Node node) {
        return node.leftNode == null && node.rightNode == null;
    }

    public int min() {
        return min(root);
    }

    public int min(Node root) {
        if (isLeaf(root)) {
            return root.value;
        }
        var left =  min(root.leftNode);
        var right = min(root.rightNode);
        return Math.min(Math.min(left, right), root.value);
    }

    public boolean equals(Tree other) {
        if (other == null) return false;
        return equals(root, other.root);
    }
    public boolean equals(Node first, Node second) {
        if (first == null && second == null) {
            return true;
        }
        if (first != null && second != null) {
            return first.value == second.value
                    && equals(first.leftNode, second.leftNode)
                    && equals(first.rightNode, second.rightNode);
        }
        return false;
    }
    public void printNodeAtDistance(int distance) {
        printNodeAtDistance(root, distance);
    }

    private void printNodeAtDistance(Node root, int distance) {
        if (root == null) return;
        if (distance == 0) {
            System.out.println(root.value);
            return;
        }
        printNodeAtDistance(root.leftNode, distance -1);
        printNodeAtDistance(root.rightNode, distance -1);
    }
}
