import java.io.*;
import java.util.*;

class StockBuyAndSell {
    static int swaps = 0;
	public static void main (String[] args) {
		Scanner ob = new Scanner(System.in);
        int size = ob.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = ob.nextInt();
        }
        System.out.print("Max Profit = "+maxProfit(arr));
	}
	public static int maxProfit(int[] prices)
    {
        int n = prices.length;
        int cost = 0;
        int maxCost = 0;
 
        if (n == 0) {
            return 0;
        }
 
        int min_price = prices[0];
 
        for (int i = 0; i < n; i++) {
 
            min_price = Math.min(min_price, prices[i]);
 
            cost = prices[i] - min_price;
 
            maxCost = Math.max(maxCost, cost);
        }
        return maxCost;
    }
}
