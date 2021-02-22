import java.io.*;
import java.util.*;

class Main {
	public static void main (String[] args) {
		Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        System.out.println(climbStairs(n));
	}
    public static int climbStairs(int n) {
        if(n == 1 || n == 2){
            return n;
        }
        int first = 1, second = 2, res = 0;
        for(int i = 3; i <= n; i++){
            res = first + second;
            first = second;
            second = res;
        }
        return res;
    }
}
