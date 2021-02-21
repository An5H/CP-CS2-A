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
		
		connect(root);
	}
	public static void connect(Node p){
        
        if(p == null){ return; }
        
        Queue <Node> q = new LinkedList <>();
        q.add(p);
        Node temp = null;
        
        while(!q.isEmpty()){
            
            for(int i = 0; i < q.size(); i++){
                
                Node prev = temp;
                temp = q.poll();
                
                if(i > 0){
                    prev.nextRight = temp;
                }
                
                if(temp.left != null){
                    q.add(temp.left);
                }
                
                if(temp.right != null){
                    q.add(temp.right);
                }
            }
            temp.nextRight = null;
        }
    }
}
