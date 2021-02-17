import java.io.*;
import java.util.*;

class PrintAllCombinationsOfMobileKeyboard{
    static final String codes[] 
            = { " ", "abc", "def", 
                "ghi", "jkl", "mno", 
                "pqr", "stu", "vwx", 
                "yz" }; 
    
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        String str = ob.nextLine();
        System.out.println(printAllCombs(str));
    }
    public static ArrayList <String> printAllCombs(String str) 
    { 
  
        //Base case
        if (str.length() == 0) { 
            ArrayList <String> baseRes = new ArrayList<>(); 
            baseRes.add(""); 
  
            // Return an Arraylist containing 
            // empty string 
            return baseRes; 
        } 
  
        // First character of str 
        char ch = str.charAt(0); 
  
        // Rest of the characters of str 
        String restStr = str.substring(1); 
  
        ArrayList <String> prevRes = printAllCombs(restStr); 
        ArrayList <String> Res = new ArrayList<>(); 
  
        String getCode = codes[ch - '0']; 
  
        for (String val : prevRes) { 
  
            for (int i = 0; i < getCode.length(); i++) { 
                Res.add(getCode.charAt(i) + val); 
            } 
        } 
        return Res; 
    }
}