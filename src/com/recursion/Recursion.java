package com.recursion;

public class Recursion {

	public static void main(String args[])
	{
		// Find Factorial value of a number using recursion
		Factorial fact = new Factorial();
		int result = fact.factorial(5);
		System.out.println(result);
		
		// Find nth fibonnaci number of series
		
		Fibonacci fibo = new Fibonacci();
		System.out.println(fibo.fibo(4));
	}
}
