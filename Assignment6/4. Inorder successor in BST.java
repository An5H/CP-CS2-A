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
		Node root = new Node(40);
		root.left = new Node(30);
		root.right = new Node(50);
		root.left.left = new Node(25);
		root.left.right = new Node(35);
		root.right.left = new Node(45);
		root.right.right = new Node(70);
		
		Node ans = getInorderSuccessor(root.right);
		if(ans != null){
		    System.out.print(ans.data);
		}
		else System.out.print("Inorder successor doesn't exist.");
	}
	static Node getInorderSuccessor(Node root){
	    if(root == null) return null;
	    
	    Node temp = null;
	    if(root.right != null){
	        temp = root.right;
	        while(temp != null && temp.left != null) temp = temp.left;
	    }
	    return temp;
	}
}
