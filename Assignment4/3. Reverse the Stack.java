import java.io.*;
import java.util.*;

class Main {
	public static void main (String[] args) {
		Stack<Integer> s = new Stack<>();
        for (int i = 1; i <= 5; i++) {
            s.push(i);
        }
 
        reverseStack(s);
 
        System.out.print("Reversed stack is ");
        while (!s.empty()) {
            System.out.print(s.pop() + " ");
        }
	}
	public static void insertInBottom(Stack<Integer> s, int item)
    {
        if (s.isEmpty()) {
            s.push(item);
            return;
        }
 
        int top = s.pop();
        insertInBottom(s, item);

        s.push(top);
    }
 
    // Recursive function to reverse a given stack
    public static void reverseStack(Stack <Integer> s)
    {
        if (s.isEmpty()) {
            return;
        }
 
        int item = s.pop();
        reverseStack(s);
 
        insertInBottom(s, item);
    }
}
