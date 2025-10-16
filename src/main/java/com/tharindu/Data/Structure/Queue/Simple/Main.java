package com.tharindu.Data.Structure.Queue.Simple;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Simple_Queue queue = new Simple_Queue(10);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        queue.enqueue(70);

        System.out.println(queue);

        queue.dequeue();
        System.out.println(queue);

        System.out.println(queue.peek());
    }
}