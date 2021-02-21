import java.io.*;
import java.util.*;

class Node{
    int data, hd;
    Node left, right;
    Node(int data){
        left = right = null;
        this.data = data;
        this.hd = 0;
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
		
		leftView(root);
		System.out.println();
		rightView(root);
		System.out.println();
		topView(root);
		System.out.println();
		bottomView(root);
	}
	static void leftView(Node root){
	    if(root == null) return;
	    
	    Queue <Node> q = new LinkedList<>();
	    q.offer(root);
	    
	    List <List<Integer>> levels = new ArrayList<>();
	    while(!q.isEmpty()){
	        int n = q.size();
	        List <Integer> curLevel = new ArrayList<>();
	        while(n-- > 0){
	            Node cur = q.poll();
	            curLevel.add(cur.data);
	            
	            if(cur.left != null) q.offer(cur.left);
	            if(cur.right != null) q.offer(cur.right);
	        }
	        levels.add(curLevel);
	    }
	    
	    for(List<Integer>l : levels){
	        System.out.print(l.get(0)+" ");
	    }
	}
	static void rightView(Node root){
	    if(root == null) return;
	    
	    Queue <Node> q = new LinkedList<>();
	    q.offer(root);
	    
	    List <List<Integer>> levels = new ArrayList<>();
	    while(!q.isEmpty()){
	        int n = q.size();
	        List <Integer> curLevel = new ArrayList<>();
	        while(n-- > 0){
	            Node cur = q.poll();
	            curLevel.add(cur.data);
	            
	            if(cur.left != null) q.offer(cur.left);
	            if(cur.right != null) q.offer(cur.right);
	        }
	        levels.add(curLevel);
	    }
	    
	    for(List<Integer>l : levels){
	        System.out.print(l.get(l.size()-1)+" ");
	    }
	}
	static void topView(Node root)
    {
        class queueObj{
            Node node;
            int hd;
            queueObj(Node node, int hd){
                this.node = node;
                this.hd = hd;
            }
        }
        
        Queue <queueObj> q = new LinkedList <>();
        TreeMap <Integer, Node> map = new TreeMap <>();
        
        if(root == null){
            return;
        }
        
        q.add(new queueObj(root, 0));
        
        while(!q.isEmpty()){
            queueObj cur = q.poll();
            if(!map.containsKey(cur.hd)){
                map.put(cur.hd, cur.node);
            }
            if(cur.node.left != null){
                q.add(new queueObj(cur.node.left, cur.hd - 1));
            }
            if(cur.node.right != null){
                q.add(new queueObj(cur.node.right, cur.hd + 1));
            }
        }
        for(Map.Entry <Integer, Node> mp: map.entrySet()){
            System.out.print(mp.getValue().data+" ");
        }
    }
    public static void bottomView(Node root){
        
        if(root == null){
            return;
        }
        
        TreeMap <Integer, Integer> map = new TreeMap <>();
        Queue <Node> q = new LinkedList <>();
        
        int hd = 0;
        root.hd = hd;
        q.add(root);
        
        while(!q.isEmpty()){
            
            Node cur = q.poll();
            hd = cur.hd;
            map.put(hd, cur.data);
            
            if(cur.left != null){
                cur.left.hd = hd - 1;
                q.add(cur.left);
            }
            
            if(cur.right != null){
                cur.right.hd = hd + 1;
                q.add(cur.right);
            }
        }
        for(Map.Entry <Integer, Integer> mp: map.entrySet()){
            System.out.print(mp.getValue()+" ");
        }
    }
}
