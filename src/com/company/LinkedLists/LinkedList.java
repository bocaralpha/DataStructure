package com.company.LinkedLists;

public class LinkedList {

    private Node first;
    private Node last;

    public void addLast(int item) {
        Node node = new Node(item);
        if (first == null) {
            last = first = node;
        } else {
            last.next = node;
            last = node;
        }
    }

    private class Node {

        private int value;
        private Node next;

        private Node(int value) {
            this.value = value;
        }
    }
}
