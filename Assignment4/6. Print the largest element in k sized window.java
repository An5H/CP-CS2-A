import java.io.*;
import java.util.*;

class Main {
	public static void main (String[] args) {
		Scanner ob = new Scanner(System.in);
		int size = ob.nextInt();
		int arr[] = new int[size];
		for(int i = 0; i < size; i++){
		    arr[i] = ob.nextInt();
		}
		int k = ob.nextInt();
		for(int i: maxSlidingWindow(arr, k)){
		    System.out.print(i+" ");
		}
	}
	public static int[] maxSlidingWindow(int[] a, int k) {		
		if (a == null || k <= 0) {
			return new int[0];
		}
		int n = a.length;
		int[] r = new int[n-k+1];
		int ri = 0;
		// store index
		Deque <Integer> q = new ArrayDeque<>();
		for (int i = 0; i < a.length; i++) {
			// remove numbers out of range k
			while (!q.isEmpty() && q.peek() < i - k + 1) {
				q.poll();
			}
			// remove smaller numbers in k range as they are useless
			while (!q.isEmpty() && a[q.peekLast()] < a[i]) {
				q.pollLast();
			}
			// q contains index... r contains content
			q.offer(i);
			if (i >= k - 1) {
				r[ri++] = a[q.peek()];
			}
		}
		return r;
	}
}
