import java.io.*;
import java.util.*;

class TrappingRainWater {
	public static void main (String[] args) {
		Scanner ob = new Scanner(System.in);
        int size = ob.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = ob.nextInt();
        }
        System.out.print("Total water = "+findWater(arr.length, arr));
	}
	static int findWater(int n, int arr[])
    {
        int left[] = new int[n];
 
        int right[] = new int[n];

        int water = 0;
 
        left[0] = arr[0];
        for (int i = 1; i < n; i++)
            left[i] = Math.max(left[i - 1], arr[i]);
 
        right[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--)
            right[i] = Math.max(right[i + 1], arr[i]);
 
        for (int i = 0; i < n; i++)
            water += Math.min(left[i], right[i]) - arr[i];
 
        return water;
    }
}
