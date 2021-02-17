import java.io.*;
import java.util.*;
class Meeting {
	public static void main (String[] args) {
		Scanner ob = new Scanner(System.in);
        //System.out.println("Enter values: x1 x2 v1 v2");
		int x1 = ob.nextInt();
		int x2 = ob.nextInt();
		int v1 = ob.nextInt();
		int v2 = ob.nextInt();
		
		//in case x2 is greater than x1 we swap so our while condition works perfectly fine.
		if(x1 < x2){
		    int temp = x1;
		    x2 = x1;
		    x1 = temp;
		}
		if(isMeetPossible(x1, x2, v1, v2)){
		    while(x1 >= x2){
		        if(x1 == x2){
		            System.out.println("They will meet.");
		            return;
		        }
		        x1 += v1;
		        x2 += v2;
		    }
		}
		else System.out.println("They will not meet");
	}
	public static boolean isMeetPossible(int x1, int x2, int v1, int v2){
	    if((x1 > x2 && v1 >= v2)||(x2 > x1 && v2 >= v1)) return false;
	    return true;
	}
}
