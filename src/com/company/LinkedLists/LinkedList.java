package com.company.LinkedLists;

public class LinkedList {

    private Node first;
    private Node last;

    public void addLast(int item) {
        Node node = new Node(item);
        if (isEmpty()) {
            last = first = node;
        } else {
            last.next = node;
            last = node;
        }
    }

    public void addFirst(int item) {
        Node node = new Node(item);
        if (isEmpty()) {
            last = first = node;
        } else {
            first.next = node;
            first = node;
        }
    }

    public int indexOf(int item) {
        Node current = first;
        int index = 0;
        while(current.next != null) {
            if (current.value == item) {
                System.out.println(index);
                return index;
            }
                current = current.next;
                index++;
            }
        return -1;
    }

    public boolean contains(int value) {
        return (indexOf(value) != -1)? true: false;
    }


    private boolean isEmpty() {
        return (first == null) ? true: false;
    }

    private class Node {

        private int value;
        private Node next;

        private Node(int value) {
            this.value = value;
        }
    }
}
