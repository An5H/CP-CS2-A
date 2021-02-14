import java.io.*;
import java.util.*;

class SmallestMissingNumber {
	public static void main (String[] args) {
		Scanner ob = new Scanner(System.in);
        int size1 = ob.nextInt();
        int arr[] = new int [size1];

        for(int i = 0; i < size1; i++){
            arr[i] = ob.nextInt();
        }
        
        Arrays.sort(arr);
        int count = 0;
        for(int i: arr){
            if(i != count){
                System.out.print("Smallest missing number = "+count);
                return;
            }
            count++;
        }
        System.out.print("All smallest numbers present");
	}
}
