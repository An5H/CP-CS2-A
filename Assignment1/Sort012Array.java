import java.io.*;
import java.util.*;

class Sort012Array {
	public static void main (String[] args) {
		Scanner ob = new Scanner(System.in);
        int size = ob.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = ob.nextInt();
        }
        
        int zero = 0, one = 0, two = 0;
        for(int i: arr){
            if(i == 0) zero++;
            if(i == 1) one++;
            if(i == 2) two++;
        }
        
        int index = 0;
        while(zero-- > 0) arr[index++] = 0;
        while(one-- > 0) arr[index++] = 1;
        while(two-- > 0) arr[index++] = 2;
        
        //sorted array
        for(int i: arr){
            System.out.print(i+" ");
        }
	}
}
