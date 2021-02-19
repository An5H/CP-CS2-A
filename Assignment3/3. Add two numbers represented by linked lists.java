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
	    head.next = new Node(6);
	    head.next.next = new Node(2);
	    head.next.next.next = new Node(3);
	    
	    Node head2 = new Node(4);
	    head2.next = new Node(9);
	    head2.next.next = new Node(3);
	    
	    Node addedList = addTwoLists(head, head2);
	    
	}
	Node addTwoLists(Node first, Node second)
    {
        // res is head node of the resultant list
        Node res = null;
        Node prev = null;
        Node temp = null;
        int carry = 0, sum;
 
        // while both lists exist
        while (first != null || second != null) {
            sum = carry + (first != null ? first.data : 0)
                  + (second != null ? second.data : 0);
 
            carry = (sum >= 10) ? 1 : 0;
            sum = sum % 10;
            temp = new Node(sum);

            if (res == null) {
                res = temp;
            }

            else {
                prev.next = temp;
            }

            prev = temp;
 
            if (first != null) {
                first = first.next;
            }
            if (second != null) {
                second = second.next;
            }
        }
        if (carry > 0) {
            temp.next = new Node(carry);
        }
        return res;
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
