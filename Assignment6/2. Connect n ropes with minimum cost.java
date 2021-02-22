import java.io.*;
import java.util.*;

class ConnectNRopes {
	public static void main (String[] args) {
	    Scanner ob = new Scanner(System.in);
	    int size = ob.nextInt();
	    int arr[] = new int[size];
	    
	    PriorityQueue <Integer> pq = new PriorityQueue<>();
	    for(int i = 0; i < size; i++){
	        int element = ob.nextInt();
	        pq.offer(element);
	    }
	    
	    int ans = 0, total = 0;
	    while(pq.size() != 1){
	        ans = pq.poll() + pq.poll();
	        pq.offer(ans);
	        total += ans;
	    }
	    System.out.println(total);
	}
}
