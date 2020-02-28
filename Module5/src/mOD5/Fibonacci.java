
package mOD5;

/**
 * @author Teresa Scudder
 * 2/23/2020
 *
 */

import java.util.*;

public class Fibonacci {

	// recursive
	public static long fib(int n) {
		if (n <= 1)
			return n;
		return fib(n - 1) + fib(n - 2);
	}

	// iterative 
	public int fibLoop(int n) { 
		if(n <= 1) {
			return n;
		}

		int fib = 1;
		int oldFib = 1;

		for(int i=2; i<n; i++) {
			int temp = fib;
			fib+= oldFib;
			oldFib = temp;
		}
		return fib;
	}

	//Print output
	public static void main(String args[]) {

		Fibonacci fib = new Fibonacci();
		System.out.println("Iterative:");
		System.out.println(fib(5));
		System.out.println(fib(10));
		System.out.println(fib(15));
		System.out.println(fib(20));

		System.out.println("Recursive:");
		System.out.println(fib.fibLoop(5));
		System.out.println(fib.fibLoop(10));
		System.out.println(fib.fibLoop(15));
		System.out.println(fib.fibLoop(20));
		
	}
}
