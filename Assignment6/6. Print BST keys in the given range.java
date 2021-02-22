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
		
    Scanner ob = new Scanner(System.in);
    int L = ob.nextInt();
    int R = ob.nextInt();
		printBST(root, L, R);
	}
	static void printBST(Node root, int L, int R){
	    if(root == null) return;
	    
	    if(root.data > L) printBST(root.left, L, R);
	    
	    if(root.data >= L && root.data <= R){
	        System.out.print(root.data+" ");
	    }
	    
	    if(root.data < R) printBST(root.right, L, R);
	}
  }
