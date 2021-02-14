import java.io.*;
import java.util.*;

class MaximumSumContiguousArray {
    static int swaps = 0;
	public static void main (String[] args) {
		Scanner ob = new Scanner(System.in);
        int size = ob.nextInt();
        int arr[] = new int [size];
        for(int i = 0; i < size; i++){
            arr[i] = ob.nextInt();
        }
        //kadane's algorithm
        int max_so_far = arr[0];
        int curr_max = arr[0];
     
        for (int i = 1; i < size; i++)
        {
            curr_max = Math.max(arr[i], curr_max + arr[i]);
            max_so_far = Math.max(max_so_far, curr_max);
        }
        System.out.println("Largest sum contiguous sub-array = "+max_so_far);
	}
}
