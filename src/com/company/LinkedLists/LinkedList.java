package com.company.LinkedLists;

import java.util.NoSuchElementException;

public class LinkedList {

    private Node first;
    private Node last;
    private int size;

    public void addLast(int item) {
        Node node = new Node(item);
        if (isEmpty()) {
            last = first = node;
            size ++;
        } else {
            last.next = node;
            last = node;
            size ++;
        }
    }

    public void addFirst(int item) {
        Node node = new Node(item);
        if (isEmpty()) {
            last = first = node;
            size ++;
        } else {
            first.next = node;
            first = node;
            size ++;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (first == last) {
            first = last = null;
            return;
        }
        Node second = first.next;
        first.next = null;
        first = second;
        size --;
    }

    public void removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (first == last) {
            first = last = null;
            return;
        }
        Node previous = getPrevious(last);
        last = previous;
        last.next = null;
        size --;

    }

   private Node getPrevious(Node last) {
        Node current = first;
        while (current.next != null ) {
            if (current.next == last) {
                return current;
            }
            current = current.next;
        }
        return null;
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

    public int size() {
        return size;
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
