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
		
		inorder(root);
		System.out.println();
		preorder(root);
		System.out.println();
		postorder(root);
		System.out.println();
		levelorder(root);
	}
	static void inorder(Node root){
	    if(root != null){
	        inorder(root.left);
	        System.out.print(root.data+" ");
	        inorder(root.right);
	    }
	}
	static void preorder(Node root){
	    if(root != null){
	        System.out.print(root.data+" ");
	        preorder(root.left);
	        preorder(root.right);
	    }
	}
	static void postorder(Node root){
	    if(root != null){
	        postorder(root.left);
	        postorder(root.right);
	        System.out.print(root.data+" ");
	    }
	}
	static void levelorder(Node root){
	    if(root == null) return;
	    
	    Queue <Node> q = new LinkedList<>();
	    q.offer(root);
	    
	    while(!q.isEmpty()){
	        Node cur = q.poll();
	        System.out.print(cur.data+" ");
	        
	        if(cur.left != null) q.offer(cur.left);
	        if(cur.right != null) q.offer(cur.right);
	    }
	}
}
