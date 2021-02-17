import java.io.*;
import java.util.*;

class kthSmallestElementInRowColumnSortedMatrix {
	public static void main (String[] args) {
		Scanner ob = new Scanner(System.in);
        int row = ob.nextInt();
        int col = ob.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int mat[][] = new int[row][col];
        
        int k = ob.nextInt();
        int smallest = -1, count = 0;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                mat[i][j] = ob.nextInt();
                pq.offer(mat[i][j]);
            }
        }
        int temp = k;
        while(temp-- > 1){
            pq.poll();
        }
        System.out.print(k+" smallest element = "+pq.poll());
	}
}
