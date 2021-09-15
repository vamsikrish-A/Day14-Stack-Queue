package com.bridgelabz;

import java.util.Stack;

public class StackMethod {
    /*
    @author: Vamsi Krishna A

    @purpose: Stack and Queues

    @date: 13/09/2019
     */
    public static void main(String[] args) {
        System.out.println("Welcome!! ");
        //creating Instance of Stack
        Stack<Integer> st = new Stack<>();

        //pushing element into stack
        st.push(70);
        st.push(30);
        st.push(56);

        //print element to stack
        System.out.println("Stack Elements: "+st);

        //Access element from the top of the stack
        int element = st.peek();
        System.out.println("Element At Top: "+element);

        //checking Stack empty or not
        boolean result = st.empty();
        while (true) {
            //popping element from the stack
            st.pop();
            System.out.println("Stack after Popping: "+st);
        }

    }
}
