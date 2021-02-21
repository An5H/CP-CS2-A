import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left, right;
    Node(int data){
        left = right = null;
        this.data = data;
    }
}

class Main {
	public static void main (String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.right.left = new Node(60);
		root.right.right = new Node(70);
		
		System.out.print(LCA(root, 40, 50).data);
	}
	static Node LCA(Node node, int n1, int n2){
	    if(node == null) return null;
	    
	    if(node.data == n1 || node.data == n2)
	        return node;
	        
	    Node left_lca = LCA(node.left, n1, n2); 
        Node right_lca = LCA(node.right, n1, n2); 
  
        if (left_lca != null && right_lca != null) 
            return node; 

        return (left_lca != null) ? left_lca : right_lca;
	}
}
