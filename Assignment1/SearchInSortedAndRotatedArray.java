import java.io.*;
import java.util.*;

class SearchInSortedAndRotated {
	public static void main (String[] args) {
		Scanner ob = new Scanner(System.in);
        int size = ob.nextInt();
        int arr[] = new int [size];
        for(int i = 0; i < size; i++){
            arr[i] = ob.nextInt();
        }
        int element = ob.nextInt();
        int location = search(arr, 0, size-1, element);
        if(location != -1){
            System.out.println("Element found at = "+location);
        }
        else System.out.println("Element not found");
	}
	static int search(int arr[], int l, int h, int key) 
    { 
        if (l > h) 
            return -1; 
  
        int mid = (l + h) / 2; 
        if (arr[mid] == key) 
            return mid; 
  
        if (arr[l] <= arr[mid]) { 
    
            if (key >= arr[l] && key <= arr[mid]) 
                return search(arr, l, mid - 1, key); 

            return search(arr, mid + 1, h, key); 
        } 
  
        if (key >= arr[mid] && key <= arr[h]) 
            return search(arr, mid + 1, h, key); 
  
        return search(arr, l, mid - 1, key); 
    }
}
