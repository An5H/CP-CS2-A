import java.io.*;
import java.util.*;

class Node{
    int data;
    Node next, random;
    Node(int data){
        this.data = data;
        next = random = null;
    }
}

public class Main {
    
    public static void main(String args[]){
        Scanner ob = new Scanner(System.in);
	    
	    Node head = new Node(1);  
        head.next = new Node(2);  
        head.next.next = new Node(3);  
        head.next.next.next = new Node(4);  
        head.next.next.next.next = new Node(5);  
      
        // 1's random points to 3  
        head.random = head.next.next;  
      
        // 2's random points to 1  
        head.next.random = head;  
      
        // 3's and 4's random points to 5  
        head.next.next.random = head.next.next.next.next;  
        head.next.next.next.random = head.next.next.next.next;  
      
        // 5's random points to 2  
        head.next.next.next.next.random = head.next;
        
        //Before list
        System.out.println("Original linked list = ");
        printList(head);
        
        //after list
        Node clonedList = clone(head);
        System.out.println("After cloning linked list = ");
        printList(clonedList);
	    
    }
    static Node clone(Node start){  
        Node curr = start, temp = null;  
      
        while (curr != null)  
        {  
            temp = curr.next;  
      
            // Inserting node  
            curr.next = new Node(curr.data);  
            curr.next.next = temp;  
            curr = temp;  
        }  
        curr = start;  
      
        // adjust the random pointers of the  
        // newly added nodes  
        while (curr != null)  
        {  
            if(curr.next != null)  
                curr.next.random = (curr.random != null) 
                          ? curr.random.next : curr.random;  
            curr = (curr.next != null) ? curr.next.next : curr.next;  
        }  
      
        Node original = start, copy = start.next;  
      
        // save the start of copied linked list  
        temp = copy;  
      
        // now separate the original list and copied list  
        while (original != null && copy != null)  
        {  
            original.next = (original.next != null) ? original.next.next : original.next;  
            copy.next = (copy.next != null) ? copy.next.next : copy.next;  
            original = original.next;  
            copy = copy.next;  
        }  
        return temp;
    }
    public static void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
}
