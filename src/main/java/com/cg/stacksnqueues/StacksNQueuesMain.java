package com.cg.stacksnqueues;

public class StacksNQueuesMain {
    public static void main(String[] args) {
        MyStack s = new MyStack();
        //Pushing elements
        System.out.println("Pushing elements");
        s.push(70);
        s.push(30);
        s.push(56);
        s.printStack();
    }
}
