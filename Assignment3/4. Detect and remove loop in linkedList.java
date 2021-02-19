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

class Main {
	public static void main (String[] args) {
	    Node head = new Node(5);
	    head.next = new Node(6);
	    head.next.next = new Node(2);
	    head.next.next.next = new Node(3);
	    head.next.next.next = head.next;
	    
	    if(detectAndRemoveLoop(head) == 1){
	        System.out.println("Loop detected and removed.");
	        printList(head);
	    }
	    else{
	        System.out.println("No loop detected");
	    }
	    
	}
	static int detectAndRemoveLoop(Node node)
    {
        Node slow = node, fast = node;
        while (slow != null && fast != null
               && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
 
            //if loop detected
            if (slow == fast) {
                removeLoop(slow, node);
                return 1;
            }
        }
        return 0;
    }
    // function to remove loop
    static void removeLoop(Node loop, Node curr)
    {
        Node ptr1 = null, ptr2 = null;

        ptr1 = curr;
        while (true) {
 
            ptr2 = loop;
            while (ptr2.next != loop && ptr2.next != ptr1) {
                ptr2 = ptr2.next;
            }
 
            if (ptr2.next == ptr1) {
                break;
            }
 
            ptr1 = ptr1.next;
        }
 
        ptr2.next = null;
    }
    //printing list
	static void printList(Node head){
	    Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println();
	}
}
