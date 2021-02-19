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
	    head.next = new Node(1);
	    head.next.next = new Node(2);
	    head.next.next.next = new Node(3);
	    head.next.next.next.next = new Node(4);
	    head.next.next.next.next.next = new Node(9);
	    head.next.next.next.next.next.next = new Node(6);
	    
	    Stack<Integer> stack = new Stack<>();
	    
	    Node temp = head;
	    while(temp != null){
	        stack.push(temp.data);
	        temp = temp.next;
	    }
	    
	    boolean isPalindrome = false;
	    while(!stack.isEmpty()){
	        if(head.data == stack.pop()){
	            isPalindrome = true;
	        }
	        else{
	            isPalindrome = false;
	            break;
	        }
	        head = head.next;
	    }
	    if(isPalindrome){
	        System.out.print("LinkedList is Palindromic");
	    }
	    else{
	        System.out.print("LinkedList not palindromic");
	    }
	}
}
