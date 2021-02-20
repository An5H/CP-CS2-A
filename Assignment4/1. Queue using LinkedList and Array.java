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
		QueueUsingLinkedList q = new QueueUsingLinkedList();
		q.add(1);
		q.add(2);
		q.add(3);
		System.out.println(q.peek());
		q.poll();
		System.out.println(q.peek());
		System.out.println(q.size());
		
		//queue using arrays
		QueueUsingArray q2 = new QueueUsingArray();
		q2.add(1);
		q2.add(2);
		q2.add(3);
		System.out.println(q2.peek());
		q2.poll();
		System.out.println(q2.peek());
		System.out.println(q2.size());
	}
}

class QueueUsingLinkedList{
    Node front, rear;
    int size;
    
    QueueUsingLinkedList(){
        front = rear = null;
        size = 0;
    }
    
    void add(int x){
        Node temp = new Node(x); 
  
        // If queue is empty, then new node is front and rear both 
        if (this.rear == null) { 
            this.front = this.rear = temp; 
            return; 
        } 
        // Add the new node at the end of queue and change rear 
        this.rear.next = temp; 
        this.rear = temp;
        this.size++;
    }
    int poll(){
        if (this.front == null) 
            return -1; 
  
        // Store previous front and move front one node ahead 
        Node temp = this.front; 
        this.front = this.front.next; 
  
        // If front becomes NULL, then change rear also as NULL 
        if (this.front == null) 
            this.rear = null;
            
        this.size--;
        
        return temp.data;
    }
    int peek(){
        if(this.size > 0)
            return this.rear.data;
        return -1;
    }
    int size(){
        return this.size;
    }
}

class QueueUsingArray{
    int front, rear; 
    int queue[];
    int size;
    QueueUsingArray(){
        front = rear = 0; 
        queue = new int[1000000];
        size = 0;
    }
    int peek(){
        if(this.size > 0)
            return queue[front];
        return -1;
    }
    void add(int x){
        if (queue.length == rear) { 
            System.out.println("Queue is full"); 
            return; 
        } 
        else { 
            queue[rear] = x; 
            rear++; 
        } 
        this.size++;
        return;
    }
    int poll(){
        int val = queue[rear];
        if (front == rear) { 
            System.out.printf("\nQueue is empty\n"); 
            return -1; 
        } 
        else { 
            for (int i = 0; i < rear - 1; i++) { 
                queue[i] = queue[i + 1]; 
            } 
  
            // store 0 at rear indicating there's no element 
            if (rear < queue.length) 
                queue[rear] = 0; 
  
            // decrement rear 
            rear--; 
        }
        this.size--;
        return val;
    }
    int size(){
        return this.size;
    }
}
