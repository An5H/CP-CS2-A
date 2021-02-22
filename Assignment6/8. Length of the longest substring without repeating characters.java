import java.io.*;
import java.util.*;


class Main {
	public static void main (String[] args) {
		    Scanner ob = new Scanner(System.in);
        char s[] = ob.nextLine().toCharArray();
        if(s.length == 0) return;
        
        HashMap <Character, Integer> map = new HashMap<>();
        int left = 0, right = 0, max = Integer.MIN_VALUE;
        
        for(int i = 0; i < s.length; i++){
            char c = s[i];
            if(map.containsKey(c)){
                left = Math.max(left, map.get(c)+1);
            }
            map.put(c, i);
            max = Math.max(max, right-left+1);
            right++;
        }
        
        System.out.println(max);
	}
}
