package com.tharindu.Data.Structure.node;

public class Stack2 {
    private Node head; //Top node point
    private final Node tail; //Bottom node point
    private int size;

    public Stack2() {
        this.head = null;
        this.tail = null;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = this.head;
        head = newNode;
        size++;
    }

    public int pop() {
        if (head != null) {
            Node temp = head;
            head = temp.next;
            size--;
            return temp.data;
        }else {
            return -1;
        }
    }

    public int peek() {
        if (head == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return head.data;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Stack (top -> Bottom): ");

        Node current = head;
        while (current != null) {
            stringBuilder.append(current.data).append(" ");
            if (current.next != null) stringBuilder.append(" -> ");
            current = current.next;
        }
        return stringBuilder.toString();
    }
}
