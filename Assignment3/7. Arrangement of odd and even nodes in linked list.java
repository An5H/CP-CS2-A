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

public class Main {
    
    public static void main(String args[]){
        Node head = new Node(5);
	    head.next = new Node(1);
	    head.next.next = new Node(2);
	    head.next.next.next = new Node(3);
	    head.next.next.next.next = new Node(4);
	    head.next.next.next.next.next = new Node(9);
	    head.next.next.next.next.next.next = new Node(6);
	    
        if (head == null)  
            return;  
  
        // Initialize first nodes of even and  
        // odd lists  
        Node odd = head;  
        Node even = head.next;  
        Node evenFirst = even;  
      
        while (true)  
        {  
            if (odd == null || even == null || (even.next) == null){  
                odd.next = evenFirst;  
                break;  
            }  
      
            odd.next = even.next;  
            odd = even.next;  
      
            if (odd.next == null)  
            {  
                even.next = null;  
                odd.next = evenFirst;  
                break;  
            }  
      
            even.next = odd.next;  
            even = odd.next;  
        }
        printList(head);
    }
    
    /* Function to print nodes in a given linked list */
    public static void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
