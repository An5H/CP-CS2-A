import java.io.*;
import java.util.*;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}

class PalindromicLL {
	public static void main (String[] args) {
	    Node head = new Node(5);
	    head.next = new Node(6);
	    head.next.next = new Node(2);
	    head.next.next.next = new Node(3);
	    
	    Node head2 = new Node(10);
	    head2.next = new Node(2);
	    head2.next.next = new Node(9);
	    
	    List <Integer> list = new ArrayList<>();
	    while(head != null){
	        list.add(head.data);
	        head = head.next;
	    }
	    while(head2 != null){
	        if(list.contains(head2.data)){
	            System.out.println("Intersection point = "+head2.data);
	            return;
	        }
	        head2 = head2.next;
	    }
	}
}
