import java.io.*;
import java.util.*;

class MergeSortedArray {
	public static void main (String[] args) {
		Scanner ob = new Scanner(System.in);
        int size1 = ob.nextInt();
        int arr1[] = new int [size1];
        for(int i = 0; i < size1; i++){
            arr1[i] = ob.nextInt();
        }
        
        int size2 = ob.nextInt();
        int arr2[] = new int[size2];
        for(int i = 0; i < size2; i++){
            arr2[i] = ob.nextInt();
        }
        
        int mergedArray[] = new int[size1+size2];
        mergeArrays(arr1, arr2, size1, size2, mergedArray);
        
        for(int i: mergedArray){
            System.out.print(i+" ");
        }
	}
	public static void mergeArrays(int[] arr1, int[] arr2, int n1, 
                                int n2, int[] arr3) 
    { 
        int i = 0, j = 0, k = 0; 
      
        // Traverse both array 
        while (i<n1 && j <n2) 
        { 
            if (arr1[i] < arr2[j]) 
                arr3[k++] = arr1[i++]; 
            else
                arr3[k++] = arr2[j++]; 
        } 
      
        while (i < n1) 
            arr3[k++] = arr1[i++]; 
      
        while (j < n2) 
            arr3[k++] = arr2[j++]; 
    }
}
