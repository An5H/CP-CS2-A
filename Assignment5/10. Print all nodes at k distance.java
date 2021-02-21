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
		
		for(int i: new NodesAtKDistance().distanceK(root, root.left.left, 3)){
		    System.out.print(i+" ");
		}
	}
}
class NodesAtKDistance {
    
    Map<Node, Integer> map;
        
    public List<Integer> distanceK(Node root, Node target, int K) {
        map = new HashMap<>();
        List<Integer> res = new LinkedList<>();
        find(root, target);
        dfs(root, target, K, map.get(root), res);
        return res;
    }
    
    // find target node first and store the distance in that path that we could use it later directly
    private int find(Node root, Node target) {
        if (root == null) return -1;
        if (root == target) {
            map.put(root, 0);
            return 0;
        }
        int left = find(root.left, target);
        if (left >= 0) {
            map.put(root, left + 1);
            return left + 1;
        }
		int right = find(root.right, target);
		if (right >= 0) {
            map.put(root, right + 1);
            return right + 1;
        }
        return -1;
    }
    
    private void dfs(Node root, Node target, int K, int length, List<Integer> res) {
        if (root == null) return;
        if (map.containsKey(root)) length = map.get(root);
        if (length == K) res.add(root.data);
        dfs(root.left, target, K, length + 1, res);
        dfs(root.right, target, K, length + 1, res);
    }
}
