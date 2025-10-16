package com.tharindu.Data.Structure.Queue.Circular;

public class Circular_Queue {
    private final int[] arr;
    private final int capacity;
    private int front, rear, size;

    public Circular_Queue(int capacity) {
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

    public void enqueue(int value) {
        if(!isFull()){
            if(front == -1) front = 0;
            rear = (rear + 1) % capacity;
            arr[rear] = value;
            size++;
        }else{
            System.out.println("Simple_Queue is full");
        }
    }

    public int dequeue() {
        if(!isEmpty()){
            int value = arr[front];
            front = (front + 1) % capacity;
            size--;
            if(size == 0){
                front = -1;
                rear = -1;
            }
            return value;
        }else{
            System.out.println("Simple_Queue is empty");
            return -1;
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
