import java.io.*;
import java.util.*;

class Main {
	public static void main (String[] args) {
		Scanner ob = new Scanner(System.in);
		String x = ob.nextLine();
		if(isPar(x)){
		    System.out.println("Balanced parenthesis");
		}
		else System.out.println("Imbalanced parenthesis");
	}
	static boolean isPar(String x){
	    Stack <Character> stack = new Stack<>();
        boolean flag = true;
        for(int i = 0; i < x.length(); i++){
            if(x.charAt(i) == '{' || x.charAt(i) == '(' || x.charAt(i) == '['){
                stack.push(x.charAt(i));
            }
            else if(!stack.isEmpty() && ((x.charAt(i) == '}' && stack.peek() == '{')
                                     || (x.charAt(i) == ')' && stack.peek() == '(') 
                                     || (x.charAt(i) == ']' && stack.peek() == '[')))
                                            
            {
                stack.pop();
            }
            else{
                flag = false;
                break;
            }
        }
        if(flag && stack.isEmpty()){
            return true;
        }
    return false;
	}
}
