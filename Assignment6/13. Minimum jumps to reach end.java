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
        System.out.println(jump(arr));
	}
    public static int jump(int[] A){
    	int jumps = 0, End = 0, Farthest = 0;
    	for (int i = 0; i < A.length - 1; i++) {
    		Farthest = Math.max(Farthest, i + A[i]);
    		if (i == End) {
    			jumps++;
    			End = Farthest;
    		}
    	}
    	return jumps;
    }
}
