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
        Scanner ob = new Scanner(System.in);
        Node head = new Node(5);
	    head.next = new Node(1);
	    head.next.next = new Node(2);
	    head.next.next.next = new Node(3);
	    head.next.next.next.next = new Node(4);
	    head.next.next.next.next.next = new Node(9);
	    head.next.next.next.next.next.next = new Node(6);
	    
	    head = delete(head, 3);
	    printList(head);
	    head = delete(head, 9);
	    printList(head);
	    head = delete(head, 5);
	    printList(head);
    }
    
    public static Node delete(Node head, int x){
        if(head == null) return null;
        
        //if head is the element to be deleted
        if(head.data == x){
            head = head.next;
        }
        else{
            Node prev = null;
            Node curr = head;
            
            while(curr != null){
                if(curr.data == x){
                    prev.next = curr.next;
                }
                prev = curr;
                curr = curr.next;
            }
        }
        return head;
    }
    public static void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + "->");
            node = node.next;
        }
        System.out.println();
    }
}
