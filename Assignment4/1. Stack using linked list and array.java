/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Node{
    Node next;
    int data;
    Node(int data){
        this.data = data;
        next = null;
    }
}

class Main {
	public static void main (String[] args) {
	    
	    //stack using linkedlist
		StackUsingLinkedList st = new StackUsingLinkedList();
		st.push(1);
		st.push(2);
		st.push(5);
		System.out.println(st.peek());
		st.pop();
		st.push(10);
		System.out.println(st.peek());
		st.pop();
		System.out.println(st.peek());
		System.out.println(st.size());
		
		//stack using arrays
		StackUsingArray st2 = new StackUsingArray();
		st2.push(4);
		st2.push(12);
		System.out.println(st2.peek());
		st2.push(13);
		System.out.println(st2.size());
		st2.push(114);
		System.out.println(st2.peek());
		st2.pop();
		System.out.print(st2.peek());
	}
}

class StackUsingLinkedList{
    Node top;
    int size;
    StackUsingLinkedList(){
        top = null;
        size = 0;
    }
    void push(int x){
        Node newNode = new Node(x);
        
        if(top == null) top = newNode;
        
        else{
            newNode.next = top;
            top = newNode;
        }
        this.size++;
    }
    int pop(){
        int val = 0;
        if(top == null) val = -1;
        
        else{
            val = top.data;
            top = top.next;
        }
        this.size--;
        return val;
    }
    int peek(){
        if(this.size > 0)
            return this.top.data;
        return -1;
    }
    int size(){
        return this.size;
    }
}

class StackUsingArray{
    int arr[];
    int top;
    int size = 0;
    StackUsingArray(){
        arr = new int[1000000];
        top = -1;
    }
    int peek(){
        if(this.size > 0)
            return arr[this.top];
        return -1;
    }
    void push(int x){
        ++this.top;
        arr[this.top] = x;
        this.size++;
    }
    int pop(){
        int val = 0;
        if(this.size == 0) val = -1;
        else{
            val = arr[this.top];
            arr[this.top] = 0;
            --this.top;
        }
        this.size--;
        return val;
    }
    int size(){
        return this.size;
    }
}















