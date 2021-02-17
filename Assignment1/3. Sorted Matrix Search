import java.io.*;
import java.util.*;

class SortedMatrixSearch {
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
        
        int element = ob.nextInt();
        int left = 0, right = mat.length-1;
        while(left < row && right >= 0){
            if(mat[left][right] == element){
                System.out.print("element found at i = "+left+", j = "+right);
                return;
            }
            else if(mat[left][right] > element) right--;
            else left++;
        }
        System.out.print("Element not found");
	}
}
