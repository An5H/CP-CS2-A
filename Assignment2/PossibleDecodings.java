import java.io.*;
import java.util.*;

import java.io.*;
 
class PossibleDecodings
{
    // Driver Code
    public static void main (String[] args){
        Scanner ob = new Scanner(System.in);
        char arr[] = ob.nextLine().toCharArray();
        int n = arr.length;
        if (n == 0 || (n == 1 && arr[0] == '0')){
            System.out.println("0");
            return;
        }
        System.out.println("Count is " +countDecoding(arr, n));
    }
    
    static int countDecoding(char digits[], 
                               int n){
            
        if (n == 0 || n == 1)
            return 1;
 
        // for base condition "01123" should return 0
        if (digits[0] == '0')
            return 0;
 
        int count = 0;
 
        // If the last digit is not 0,
        // then it is also part of the word
        if (digits[n - 1] > '0')
            count = countDecoding(digits, n - 1);
 
        // If the last two digits form a number
        // smaller than or equal to 26,
        // then consider last two digits and recur
        if (digits[n - 2] == '1'
            || (digits[n - 2] == '2'
                && digits[n - 1] < '7'))
            count += countDecoding(digits, n - 2);
 
        return count;
    }
}