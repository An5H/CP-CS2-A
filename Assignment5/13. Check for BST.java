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
    static int max = Integer.MIN_VALUE;
	  public static void main (String[] args) {
		Node root = new Node(40);
		root.left = new Node(20);
		root.right = new Node(50);
		root.left.left = new Node(10);
		root.left.right = new Node(30);
		root.right.left = new Node(45);
		root.right.right = new Node(60);
		
		System.out.println(isBST(root));
	}
    static boolean isBST(Node root){
        return checkForBst(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    static boolean checkForBst(Node node, int min, int max){
        
        if(node == null) return true; 
        
        if(node.data < min || node.data > max) return false;
        
        return ((checkForBst(node.left, min, node.data - 1)) 
                && checkForBst(node.right, node.data + 1, max));
    }
}
