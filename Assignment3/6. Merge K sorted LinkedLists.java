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

public class MergeKSortedLists {
    
    public static void main(String args[]){
        int k = 3; 
        int n = 4; 
 
        Node arr[] = new Node[k];
 
        arr[0] = new Node(1);
        arr[0].next = new Node(10);
        arr[0].next.next = new Node(11);
        arr[0].next.next.next = new Node(13);
 
        arr[1] = new Node(2);
        arr[1].next = new Node(4);
        arr[1].next.next = new Node(6);
        arr[1].next.next.next = new Node(8);
 
        arr[2] = new Node(0);
        arr[2].next = new Node(9);
        arr[2].next.next = new Node(14);
        arr[2].next.next.next = new Node(20);
 
        // Merge all lists
        Node head = mergeKLists(arr, k - 1);
        //print merged sorted list
        printList(head);
    }
    
    public static Node SortedMerge(Node first, Node second)
    {
        Node result = null;
        /* Base cases */
        if (first == null)
            return second;
        else if (second == null)
            return first;
 
        if (first.data <= second.data) {
            result = first;
            result.next = SortedMerge(first.next, second);
        }
        else {
            result = second;
            result.next = SortedMerge(first, second.next);
        }
 
        return result;
    }
 
    // The main function that takes an array of lists
    // arr[0..last] and generates the sorted output
    public static Node mergeKLists(Node arr[], int last)
    {
        while (last != 0) {
            int i = 0, j = last;
            while (i < j) {
                arr[i] = SortedMerge(arr[i], arr[j]);
                i++;
                j--;
                
                if (i >= j) last = j;
            }
        }
        return arr[0];
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
