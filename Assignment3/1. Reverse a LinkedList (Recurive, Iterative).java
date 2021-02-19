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

class LL {
	public static void main (String[] args) {
	    Node head = new Node(5);
	    head.next = new Node(1);
	    head.next.next = new Node(2);
	    head.next.next.next = new Node(3);
	    head.next.next.next.next = new Node(4);
	    head.next.next.next.next.next = new Node(9);
	    head.next.next.next.next.next.next = new Node(6);
    
        Node ans1 = reversedListIterative(head);
        Node ans2 = reversedListRecursive(head);
        // similarly we can print for ans2
        while(ans1 != null){
            System.out.print(ans1.data);
            ans1 = ans1.next;
            if(ans1.next != null);
            System.out.print("->");
        }
	}
	
	public static Node reversedListIterative(Node head){
	    if(head == null) return null;
	    
	    Node prev = null;
	    Node current = head;
	    Node next = null;
	    
	    while(current != null){
	        next = current.next;
	        current.next = prev;
	        prev = current;
	        current = next;
	    }
	    return prev;
	}

	public static Node reversedListRecursive(Node head) {
        if (head == null || head.next == null) return head;
        Node cur = reversedListRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return cur;
    }
}
