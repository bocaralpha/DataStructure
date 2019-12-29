package com.company.LinkedLists;

public class Main {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(10);
        linkedList.addLast(20);
        linkedList.addLast(30);
        linkedList.addLast(40);
        linkedList.addLast(50);
        linkedList.addLast(60);

        //linkedList.indexOf(3);
        //linkedList.contains(3);
        //linkedList.removeFirst();
        //linkedList.removeLast();
        //linkedList.size();
        //linkedList.reverse();
        System.out.print(linkedList.getKthNodeFromEnd(4));
    }
}
