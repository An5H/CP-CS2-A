import java.io.*;
import java.util.*;
 
/***************************************** Singly Linked List ***********************************************/
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
	    //Initializing singly Linked list
	    Node head = new Node(5);
	    head.next = new Node(1);
	    head.next.next = new Node(2);
	    head.next.next.next = new Node(3);
	    head.next.next.next.next = new Node(4);
	    head.next.next.next.next.next = new Node(9);
	    head.next.next.next.next.next.next = new Node(6);
        
        //testing SinglyLL
        System.out.println("Singly Linked list");
        printList(head);
        head = deleteNode(head, 3);
        head = insertNode(head, 10);
        head = insertNode(head, 45);
        printList(head);
        head = deleteNode(head, 5);
        printList(head);
        head = deleteNode(head, 6);
        printList(head);
        
        System.out.println("Doubly Linked List");
        //head of doubly LL
        doublyLL head2 = new doublyLL(5);
        head2.insertNode(8);
        head2.insertNode(3);
        head2.insertNode(6);
        head2.printList(head2.getHead());
        head2.deleteNode(3);
        head2.insertNode(8);
        head2.printList(head2.getHead());
        head2.insertNode(4);
        head2.insertNode(9);
        head2.printList(head2.getHead());
        head2.deleteNode(8);
        head2.printList(head2.getHead());
        
        System.out.println("Cirular Linked List");
        
        CircularLL head3 = new CircularLL(10);
        head3.insertNode(20);
        head3.insertNode(30);
        head3.insertNode(40);
        head3.insertNode(50);
        head3.printList(head3.getHead());
        head3.deleteNode(30);
        head3.printList(head3.getHead());
        head3.deleteNode(10);
        head3.printList(head3.getHead());
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
	//insertion at front of LL
	static Node insertNode(Node head, int x){
	    Node newNode = new Node(x);
	    if(head == null){
	        head = newNode;
	    }
	    else{
	        newNode.next = head;
	        head = newNode;
	    }
	    return head;
	}
	//deletion
	static Node deleteNode(Node head, int x){
	    Node prev = null;
	    Node current = head;
	    
	    //if head is the element to be deleted
	    if(head.data == x){
	        head = head.next;
	    }
	    
	    else{
    	    while(current != null){
    	        if(current.data == x){
    	            prev.next = current.next;
    	        }
    	        prev = current;
    	        current = current.next;
    	    }
	    }
	    return head;
	}
}
/******************************************** Doubly Linked List ***********************************************/
class DNode{
    int data;
    DNode left, right;
    DNode(int data){
        this.data = data;
        left = right = null;
    }
}
class doublyLL{
    DNode head;
    doublyLL(int val){
        this.head = new DNode(val);
    }
    
    DNode getHead(){
        return this.head;
    }
    //insertion at begining
    DNode insertNode(int x){
        DNode newNode = new DNode(x);
        if(head == null){
            head = newNode;
        }
        else{
            newNode.right = head;
            head.left = newNode;
            head = newNode;
        }
        return head;
    }
    //deletion from DLL
    DNode deleteNode(int x){
        if(head == null) return null;
        
        if(head.data == x){
            head = head.right;
            head.left = null;
        }
        
        DNode prev = null;
        DNode temp = head;
        while(temp != null){
            if(temp.data == x){
                prev.right = temp.right;
                temp.left = prev;
                break;
            }
            prev = temp;
            temp = temp.right;
        }
        return head;
    }
    //printing DLL
    void printList(DNode head){
        DNode temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.right;
        }
        System.out.println();
    }
}

/************************************************** Circular Linked List ***********************************************/

class CircularLL {
	Node head;
	Node tail;
	CircularLL(int data){
	    this.head = new Node(data);
	    this.tail = head;
	}
	
	Node getHead(){
	    return this.head;
	}
	//printing list
    void printList(Node head){
	    Node temp = head;
        while(temp != tail){
            System.out.print(temp.data+"->");
            temp = temp.next;
            if(temp == tail)
            System.out.print(tail.data);
        }
        System.out.println();
	}
	//insertion at front of LL
	Node insertNode(int x){
	    Node newNode = new Node(x);
	    if(head == null){
	        head = newNode;
	        tail = head;
	    }
	    else{
	        newNode.next = head;
	        head = newNode;
	    }
	    tail.next = head;
	    return head;
	}
	//deletion
	Node deleteNode(int x){
	    Node prev = null;
	    Node current = head;
	    
	    //if head is the element to be deleted
	    if(head.data == x){
	        head = head.next;
	        tail.next = head;
	    }
	    
	    else{
    	    while(current != null){
    	        if(current.data == x){
    	            prev.next = current.next;
    	            tail = prev;
    	            break;
    	        }
    	        prev = current;
    	        current = current.next;
    	    }
	    }
	    return head;
	}
}
