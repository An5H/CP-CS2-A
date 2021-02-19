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
        Node head = new Node(5);
	    head.next = new Node(1);
	    head.next.next = new Node(2);
	    head.next.next.next = new Node(3);
	    head.next.next.next.next = new Node(4);
	    head.next.next.next.next.next = new Node(9);
	    head.next.next.next.next.next.next = new Node(6);
	    
	    System.out.println("Before sorting");
	    head = sortList(head);
	    System.out.println("After sorting");
	    printList(head);
    }
    public static void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
    static Node sortList(Node head) {
        if (head == null || head.next == null)
            return head;
        Node mid = getMid(head);
        Node left = sortList(head);
        Node right = sortList(mid);
        return merge(left, right);
    }

    static Node merge(Node list1, Node list2) {
        Node dummyHead = new Node(0);
        Node tail = dummyHead;
        while (list1 != null && list2 != null) {
            if (list1.data < list2.data) {
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        tail.next = (list1 != null) ? list1 : list2;
        return dummyHead.next;
    }

    static Node getMid(Node head) {
        Node midPrev = null;
        while (head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        Node mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }
}
