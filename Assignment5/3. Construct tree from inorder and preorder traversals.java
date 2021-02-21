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
    static int preIndex = 0;
	public static void main (String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.right.left = new Node(60);
		root.right.right = new Node(70);
		
		int inorder[] = {4, 2, 5, 1, 6, 3};
		int preorder[] = {1, 2, 4, 5, 3, 6};
		
		int len = inorder.length;
        root = buildTree(inorder, preorder, 0, len - 1);
        
        inorder(root);
	}
	static void inorder(Node root){
	    if(root != null){
	        inorder(root.left);
	        System.out.print(root.data+" ");
	        inorder(root.right);
	    }
	}
	static Node buildTree(int in[], int pre[], int inStrt, int inEnd)
    {
        if (inStrt > inEnd)
            return null;

        Node tNode = new Node(pre[preIndex++]);
 
        if (inStrt == inEnd)
            return tNode;

        int inIndex = search(in, inStrt, inEnd, tNode.data);

        tNode.left = buildTree(in, pre, inStrt, inIndex - 1);
        tNode.right = buildTree(in, pre, inIndex + 1, inEnd);
 
        return tNode;
    }
 
    static int search(int arr[], int strt, int end, int value)
    {
        int i = -1;
        for (i = strt; i <= end; i++) {
            if (arr[i] == value) return i;
        }
        return i;
    }
}
