import java.io.*;
import java.util.*;

class FirstAndLastPositions {
	public static void main (String[] args) {
		Scanner ob = new Scanner(System.in);
        int size = ob.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = ob.nextInt();
        }
        
        int element = ob.nextInt();
        int leftIndex = -1, rightIndex = -1;
        for(int i = 0; i < size; i++){
            if(arr[i] == element){
                leftIndex = i;
                break;
            }
        }
        for(int i = size-1; i >= 0; i--){
            if(arr[i] == element){
                rightIndex = i;
                break;
            }
        }
        if(leftIndex != -1 && rightIndex != -1){
            System.out.println("First occurence = "+leftIndex+"\nLast occurence = "+rightIndex);
            return;
        }
        System.out.println("Element not found");
	}
}
