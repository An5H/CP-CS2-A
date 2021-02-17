import java.io.*;
import java.util.*;

class SpiralFormMatrix {
    static int swaps = 0;
	public static void main (String[] args) {
		Scanner ob = new Scanner(System.in);
        int row = ob.nextInt();
        int col = ob.nextInt();
        int mat[][] = new int[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                mat[i][j] = ob.nextInt();
            }
        }
        spiralPrint(row, col, mat);
	}
	static void spiralPrint(int m, int n, int a[][])
    {
        int i, k = 0, l = 0;
 
        /*  k - starting row index
        m - ending row index
        l - starting column index
        n - ending column index
        i - iterator
        */
 
        while (k < m && l < n) {
            for (i = l; i < n; ++i) {
                System.out.print(a[k][i] + " ");
            }
            k++;
 
            for (i = k; i < m; ++i) {
                System.out.print(a[i][n - 1] + " ");
            }
            n--;
 
            if (k < m) {
                for (i = n - 1; i >= l; --i) {
                    System.out.print(a[m - 1][i] + " ");
                }
                m--;
            }
 
            if (l < n) {
                for (i = m - 1; i >= k; --i) {
                    System.out.print(a[i][l] + " ");
                }
                l++;
            }
        }
    }
}
