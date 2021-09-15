package com.bridgelabz;

import java.util.PriorityQueue;

public class QueueMethod {
    /*
    * @author: Vamsi krishna A
    * @purpose: Stack and Queue
    * @date:13/09/2019
    * */
    public static void main(String[] args) {
        //Creating priority Queue
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        //Adding queue elements
        queue.add(56);
        queue.add(30);
        queue.add(70);

        System.out.println("Queue elements: "+queue);
    }
}
