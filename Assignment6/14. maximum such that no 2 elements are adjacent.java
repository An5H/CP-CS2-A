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
        System.out.print(FindMaxSum(arr, arr.length));
	}
	static int FindMaxSum(int arr[], int n) 
    { 
        int incl = arr[0]; 
        int excl = 0; 
        int excl_new; 
        int i; 
  
        for (i = 1; i < n; i++) 
        { 
            excl_new = (incl > excl) ? incl : excl; 
            incl = excl + arr[i]; 
            excl = excl_new; 
        } 
  
        return (incl > excl) ? incl : excl; 
    } 
}
