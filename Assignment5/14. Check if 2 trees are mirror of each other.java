import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left, right, nextRight;
    Node(int data){
        left = right = nextRight = null;
        this.data = data;
    }
}

class Main {
	public static void main (String[] args) {
		Node root = new Node(40);
		root.left = new Node(20);
		root.right = new Node(50);
		
		Node root2 = new Node(40);
		root2.left = new Node(50);
		root2.right = new Node(20);
		
		System.out.println(areMirror(root, root2));
	}
    static boolean areMirror(Node a, Node b)  
    { 
        /* Base case : Both empty */
        if (a == null && b == null) 
            return true; 
  
        // If only one is empty 
        if (a == null || b == null)  
            return false; 
  
        return a.data == b.data 
                && areMirror(a.left, b.right) 
                && areMirror(a.right, b.left); 
    }
}
