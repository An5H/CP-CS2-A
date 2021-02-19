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
      Node headA = new Node(5);
	    headA.next = new Node(6);
	    headA.next.next = new Node(7);
	    headA.next.next.next = new Node(9);
	    
	    Node headB = new Node(8);
	    headB.next = new Node(11);
	    headB.next.next = new Node(20);
  
        Node dummy = new Node(0);
        Node tail = dummy;
        while(true){
            if(headA == null){
                tail.next = headB;
                break;
            }
            if(headB == null){
                tail.next = headA;
                break;
            }
            if(headA.data <= headB.data){
                tail.next = headA;
                headA = headA.next;
            }
            else{
                tail.next = headB;
                headB = headB.next;
            }
            tail = tail.next;
        }
        Node head = dummy.next;
        printList(head);
    }
    public static void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
