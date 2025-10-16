package com.tharindu.Data.Structure.Queue.Circular;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Circular_Queue queue = new Circular_Queue(33);

        queue.enqueue(11);
        queue.enqueue(22);
        queue.enqueue(33);
        queue.enqueue(44);
        queue.enqueue(55);
        queue.enqueue(66);
        queue.enqueue(77);

        System.out.println(queue);

        queue.dequeue();
        queue.dequeue();
        System.out.println(queue);

        System.out.println(queue.peek());
    }
}