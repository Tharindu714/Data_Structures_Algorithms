package com.tharindu.Data.Structure.List;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.traverse();

        list.insertAtStart(5);
        list.insertAtStart(15);
        list.insertAtStart(30);
        list.traverse();

        list.insertAtPosition(25, 2);
        list.traverse();

        System.out.println("search 20: " + list.search(20));
        System.out.println("search 100: " + list.search(100));

        list.deleteByValue(15);
        list.traverse();
        list.deleteAtPosition(4);
        list.traverse();

        System.out.println("Reversing the list:");
        list.reverse();
        list.traverse();
    }
}