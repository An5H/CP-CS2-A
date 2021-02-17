import java.io.*;
import java.util.*;

class MajorityElement {
	public static void main (String[] args) {
	Scanner ob = new Scanner(System.in);
        int size = ob.nextInt();
        int arr[] = new int[size];
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < size; i++){
            int element = ob.nextInt();
            arr[i] = element;
            max = Math.max(max, element);
        }
        
	int freq[] = new int[max+1];
	for(int i: arr){
		++freq[i];
		if(freq[i] > freq.length/2){
			System.out.println("Majority element found = "+i);
		        return;
		    }
		}
		System.out.println("Element not found");
	}
}
