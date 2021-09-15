package com.bridgelabz;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class QueueMethod {
    /*
    * @author: Vamsi krishna A
    * @purpose: Stack and Queue
    * @date:13/09/2019
    * */
    public void queueMethod() {
        //Creating priority Queue
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        //Adding queue elements
        queue.add(56);
        queue.add(30);
        queue.add(70);

        System.out.println("Queue elements: "+queue);
    }
    public void dequeueMethod() {
        //creating dequeue
        Deque<Integer> deque = new ArrayDeque<>();
        //adding elements to deque
        deque.add(56);
        deque.add(30);
        deque.add(70);

        System.out.println("Deque elements:"+deque);
    }

    public static void main(String[] args) {
        QueueMethod obj = new QueueMethod();
        obj.queueMethod();
        obj.dequeueMethod();
    }
}
