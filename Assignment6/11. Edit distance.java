import java.io.*;
import java.util.*;


class Main {
	public static void main (String[] args) {
		    Scanner ob = new Scanner(System.in);
        String s1 = ob.nextLine();
        String s2 = ob.nextLine();
        System.out.println(editDistDP(s1, s2, s1.length(), s2.length()));
	}
	static int editDistDP(String str1, String str2, int m, int n){
        int dp[][] = new int[m + 1][n + 1];
 
        // Fill d[][] in bottom up manner
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                
                if (i == 0)
                    dp[i][j] = j;
 
                else if (j == 0)
                    dp[i][j] = i;
 
                else if (str1.charAt(i - 1) == str2.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1];
 
                else
                    dp[i][j] = 1 + min(dp[i][j - 1],    // Insert
                                     dp[i - 1][j],      // Remove
                                     dp[i - 1][j - 1]); // Replace
            }
        }
        return dp[m][n];
    }
    static int min(int a, int b, int c){
        if(a <= b && b <= c) return a;
        if(b <= a && b <= c) return b;
        return c;
    }
}
