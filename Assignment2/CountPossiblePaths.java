import java.io.*;
import java.util.*;

import java.io.*;
 
class CountPossiblePaths
{
    // Driver Code
    public static void main (String[] args){
        Scanner ob = new Scanner(System.in);
        int m = ob.nextInt();
        int n = ob.nextInt();
        System.out.println(getPaths(m, n));
    }
    static int getPaths(int m, int n){
        if(m == 1 || n == 1) return 1;
        return getPaths(m-1, n) + getPaths(m, n-1);
    }
}
 