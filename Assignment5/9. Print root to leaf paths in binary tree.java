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
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.right.left = new Node(60);
		root.right.right = new Node(70);
		
		System.out.println("Root to leaf paths");
		findPaths fp = new findPaths();
		for(String cur: fp.binaryTreePaths(root)){
		    System.out.println(cur);
		}
	}
}
class findPaths {
    List <String> list;
    public List<String> binaryTreePaths(Node root) {
        list = new ArrayList<>();
        if(root == null) return list;
        paths(root, "");
        return list;
    }
    public void paths(Node root, String cur){
        if(root.left == null && root.right == null) list.add(cur+root.data);
        if(root.left != null) paths(root.left, cur+root.data+"->");
        if(root.right != null) paths(root.right, cur+root.data+"->");
    }
}
