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
        Scanner ob = new Scanner(System.in);
        int size = ob.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = ob.nextInt();
        }
		
		Node root = createBST(arr, 0, arr.length-1);
		
		inorder(root);
	}
	static void inorder(Node root){
	    if(root == null) return;
	    inorder(root.left);
	    System.out.print(root.data+" ");
	    inorder(root.right);
	}
	static Node createBST(int arr[], int start, int end){
	    if(start > end) return null;
	    
	    int mid = start + (end-start)/2;
	    
	    Node node = new Node(arr[mid]);
	    
	    node.left = createBST(arr, start, mid-1);
	    
	    node.right = createBST(arr, mid+1, end);
	    
	    return node;
	}
}
