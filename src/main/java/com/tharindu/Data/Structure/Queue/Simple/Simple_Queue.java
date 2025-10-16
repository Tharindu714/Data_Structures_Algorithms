package com.tharindu.Data.Structure.Queue.Simple;

public class Simple_Queue {
    private final int[] arr;
    private int front, rear, size;
    private final int capacity;

    public Simple_Queue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int data) {
        if(!isFull()){
            rear++;
            arr[rear] = data;
            size++;
        }else{
            System.out.println("Simple_Queue is full");
        }
    }

    public void dequeue() {
        if(!isEmpty()){
            int data = arr[front];
            front++;
            size--;
        }else{
            System.out.println("Simple_Queue is empty");
        }
    }

    public int peek() {
        if(!isEmpty()){
            return arr[front];
        }else{
            System.out.println("Simple_Queue is empty");
            return -1;
        }
    }

    @Override
    public String toString() {
        if (isEmpty()){
            return "Simple_Queue is empty";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Simple_Queue: (front -> rear): ");
        for (int i = front; i <= rear; i++) {
            sb.append(arr[i]);
            if (i < rear) {
                sb.append(" -> ");
            }
        }
        return sb.toString();
    }
}
