import java.io.*;
import java.util.*;

class PeakElement {
	public static void main (String[] args) {
		Scanner ob = new Scanner(System.in);
        int size = ob.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = ob.nextInt();
        }
        
        int index = 0;
        int peakElements[] = new int[size];
        
        //corner cases
        if(arr[0] > arr[1]) peakElements[index++] = arr[0];
        if(arr[size-1] > arr[size-2]) peakElements[index++] = arr[size-1];
        
        for(int i = 1; i < size-1; i++){
            if(arr[i-1] < arr[i] && arr[i] > arr[i+1]){
                peakElements[index++] = arr[i];
            }
        }
        for(int i: peakElements){
            if(i != 0) System.out.println("Peak Elements are:"+i);
        }
	}
}
