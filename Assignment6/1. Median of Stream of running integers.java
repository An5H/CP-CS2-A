import java.io.*;
import java.util.*;

class MedianOfStream {
	public static void main (String[] args) {
	    int sum = 0, avg = 0, count = 0;
		Scanner ob = new Scanner(System.in);
		int size = ob.nextInt();
		for(int i = 0; i < size; i++){
		    int cur = ob.nextInt();
		    ++count;
		    sum += cur;
		    avg = sum / count;
		    System.out.println(avg);
		}
	}
}
