import java.io.*;
import java.util.*;

class Main {
    static Queue <Integer> queue;
	public static void main (String[] args) {
		queue = new LinkedList<Integer>(); 
        queue.add(56); 
        queue.add(27); 
        queue.add(30); 
        queue.add(45); 
        queue.add(85); 
        
        queue = reverseQueue(queue);
        while(!queue.isEmpty()){
            System.out.print(queue.poll()+" ");
        }
	}
	static Queue<Integer> reverseQueue(Queue <Integer> q){ 
        // Base case 
        if (q.isEmpty()) 
            return q; 
      
        // Dequeue current item (from front)   
        int data = q.peek(); 
        q.remove(); 
      
        // Reverse remaining queue   
        q = reverseQueue(q); 
      
        // Enqueue current item (to rear)   
        q.add(data); 
              
        return q; 
    }
}
