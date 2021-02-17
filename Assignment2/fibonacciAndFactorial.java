import java.io.*;
import java.util.*;

class FibAndFactorial {
	public static void main (String[] args) {
	    Scanner ob = new Scanner(System.in);
		int fib = ob.nextInt();
		int fact = ob.nextInt();
		System.out.println("Factorial = "+factorial(fact));
		System.out.println(fib+" Fibonacci number = "+fibonacci(fib));
	}
	public static long factorial(int num){
	    if(num <= 1) return 1;
	    return num * factorial(num-1);
	}
	public static long fibonacci(int num){
	    if(num == 0) return 0;
	    if(num == 1) return 1;
	    return fibonacci(num-1) + fibonacci(num-2);
	}
}