import java.io.*;
import java.util.*;

class AlternativeSorting {
	public static void main (String[] args) {
		Scanner ob = new Scanner(System.in);
        int size = ob.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = ob.nextInt();
        }
        //Bubble sort
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size-1; j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int i = 0, j = size-1; 
        while (i < j) { 
            System.out.print(arr[j--] + " "); 
            System.out.print(arr[i++] + " "); 
        } 
        // to print the middle elment in case of odd number of elements
        if (size % 2 != 0) 
            System.out.print(arr[i]); 
	}
}
