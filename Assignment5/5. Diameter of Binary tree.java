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
		
		System.out.print(diameter(root));
	}
	static int diameter(Node root) {
        
        if(root == null){
            return 0;
        }
        
        int dim = 1 + height(root.left) + height(root.right);
        int dLeft = diameter(root.left);
        int dRight = diameter(root.right);
        
        return Math.max(dim, Math.max(dLeft, dRight));
    }
    static int height(Node root){
        if(root == null){
            return 0;
        }
        return Math.max(height(root.left), height(root.right)) + 1;
    }
}
