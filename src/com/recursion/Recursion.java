package com.recursion;

public class Recursion {

	public static void main(String args[])
	{
		// Find Factorial value of a number using recursion
		Factorial fact = new Factorial();
		int result = fact.factorial(5);
		System.out.println("Factorial of a number : "+result);
		
		// Find nth fibonnaci number of series
		Fibonacci fibo = new Fibonacci();
		System.out.println("Fibonacci number : "+fibo.fibo(4));
		
		// Bunny Ears Problem
		BunnyEars bunny = new BunnyEars();
		int number = bunny.bunnyEars(4);
		System.out.println("Number of Bunny Ears : "+number);
		
		// Recursion Binary Search 
		int a[] = {1,2,3,4,5,6,7,8,9,10,11,111};
		BinarySearch binarySearch = new BinarySearch();
		System.out.println("Position of search value : "+binarySearch.binarySearch(a, 111, 0, a.length-1));
				
	}
}
