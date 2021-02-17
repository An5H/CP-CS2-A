import java.io.*;
import java.util.*;

class MinimumNumberOfPlatforms {
	public static void main (String[] args) {
		Scanner ob = new Scanner(System.in);
        int size1 = ob.nextInt();
        int arr[] = new int [size1];
        int dep[] = new int [size1];
        for(int i = 0; i < size1; i++){
            arr[i] = ob.nextInt();
        }
        for(int i = 0; i < size1; i++){
            dep[i] = ob.nextInt();
        }
        System.out.println("Minimum platforms required = "+findPlatform(arr, dep, size1));
	}
	static int findPlatform(int arr[], int dep[], int n)
    {
        Arrays.sort(arr);
        Arrays.sort(dep);
 
        int plat_needed = 1, result = 1;
        int i = 1, j = 0;
 
        while (i < n && j < n) {
           
            if (arr[i] <= dep[j]) {
                plat_needed++;
                i++;
            }
 
            else if (arr[i] > dep[j]) {
                plat_needed--;
                j++;
            }
 
            if (plat_needed > result)
                result = plat_needed;
        }
        return result;
    }
}
