import java.io.*;
import java.util.*;


class Main {
	public static void main (String[] args) {
		    Scanner ob = new Scanner(System.in);
        char X[] = ob.nextLine().toCharArray();
        char Y[] = ob.nextLine().toCharArray();
        System.out.println(lcs(X, Y, X.length, Y.length));
	}
	static int lcs( char[] X, char[] Y, int m, int n ){ 
        int L[][] = new int[m+1][n+1]; 
  
        //fill dp
        for (int i=0; i<=m; i++){ 
          for (int j=0; j<=n; j++){ 
                if (i == 0 || j == 0) 
                    L[i][j] = 0; 
                else if (X[i-1] == Y[j-1]) 
                    L[i][j] = L[i-1][j-1] + 1; 
                else
                    L[i][j] = max(L[i-1][j], L[i][j-1]); 
                } 
            } 
        return L[m][n]; 
    } 
}
