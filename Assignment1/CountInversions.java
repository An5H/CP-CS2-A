import java.io.*;
import java.util.*;

class CountInversions {
    static int swaps = 0;
	public static void main (String[] args) {
		Scanner ob = new Scanner(System.in);
        int size = ob.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = ob.nextInt();
        }
        //sort array
        System.out.println("Inversion count = "+sort(arr, 0, size-1));
	}
	static int merge(int arr[], int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;
 
        int L[] = new int[n1];
        int R[] = new int[n2];
 
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
 
        int i = 0, j = 0;
 
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
                swaps += (m + 1) - (l + i);
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
        return swaps;
    }
    static int sort(int arr[], int l, int r)
    {
        int countInversions = 0;
        if (l < r) {
            // Find the middle point
            int m = l + (r-l)/2;

            countInversions += sort(arr, l, m);
            countInversions += sort(arr, m + 1, r);
            countInversions += merge(arr, l, m, r);
        }
        return countInversions;
    }
}
